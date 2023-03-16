package org.example.HW15_03_23.Task2;

/*todo
   Реализовать логику работы небольшого ресторана, который может принять только 5 человек одновременно.
   Люди прибывают и выстраиваются в очередь на входе, ожидая освобождения столиков.
   заказывают комплексный обед из 3-х блюд (суп, салат и второе).
   В ресторане один официант и три повара, каждый из которых готовит только одно блюдо на одного человека.
   Один повар готовит только супы, второй только салаты, третий только второе.
   Официант собирает обед на поднос и относит посетителям.
   Посетили едят и покидают ресторан, освобождая столы для новых посетителей.*/
public class Main{
	public static void main(String[] args) {


			new Thread(new Restaurant("visitor 0")).start();
			new Thread(new Restaurant("visitor 1")).start();
			new Thread(new Restaurant("visitor 2")).start();
			new Thread(new Restaurant("visitor 3")).start();
			new Thread(new Restaurant("visitor 4")).start();



	}

}
