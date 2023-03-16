package org.example.HW15_03_23.Task1;

import java.util.concurrent.Exchanger;

/*todo 1. Создать модель поведения с применением Exchanger:
   необходимо доставить посылки двумя грузовиками
   грузовик 1 везет: посылка A -> C и посылка A -> D
   грузовик 2 везет: посылка B -> C и посылка B -> D
   A  _ _ _ _             _ _ _ _ B
           \          /
             - - E - -
   _ _ _ _ /          \ _ _ _ _
   C                              D
   E - точка обмена
   каждый грузовик может отвезти обе посылки, но это не оптимально
   поэтому необходимо создать пункт E для обмена конечными посылками, так чтобы
   итоговые конечные точки были одинаковые, то есть
   грузовик 1: посылка A -> C и A -> D, после обмена: A -> D и B -> D
   грузовик 2: посылка B -> C и B -> D, после обмена: B -> C и A -> C
   ----------------------------------------------------------------------------------------*/

public class Main{
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<>();

		new Thread(new DeliverParcels("Truck1", "A", "C", "D", exchanger)).start();
		new Thread(new DeliverParcels("Truck2", "B", "C", "D", exchanger)).start();


	}
}








































