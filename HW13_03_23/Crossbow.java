package org.example.HW13_03_23;


	import java.util.Scanner;

	public class Crossbow {
/*todo Арбалет. См. класс Crossbow в репозитории.
		 Стрелок robinHood в одном потоке стреляет из арбалета,
		 его помощник servant в другом потоке приносит ему колчан, когда стрелы закончатся.
		 Заготовка логики в классе Crossbow. Доработать логику, чтобы:
		 стрельба продолжалась бесконечно
		 количество приносимых стрел каждый раз определял бы пользователь, вводя число arrows через консоль*/

			private int arrows = 5;

			synchronized public void fire() {
				for (int arrows1 = arrows; arrows1 >= 0; arrows1--) {
					if (arrows1 != 0) {
						System.out.println("Стрела " + (arrows - arrows1 + 1) + " попала в цель!");
					} else {
						System.out.println("Стрелы закончились");
						arrows = 0;
						System.out.println("Количество стрел: " + arrows);
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Новый колчан с стрелами!!");
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			// reload() приносит новые стрелы и вызывает метод notify(), который пробуждает поток
			synchronized public void reload() {
				System.out.println("Новые стрелы !");
				arrows = 10;
				System.out.println("Количество стрел: " + arrows);
				notify();
			}

			public static void main(String[] args) {

				Crossbow arbalet = new Crossbow();
				Thread robinHood = new Thread(arbalet::fire);
				Thread servant = new Thread(arbalet::reload);

				robinHood.start();

				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				servant.start();
			}
		}
/*todo Переписать класс ReentrantLockBlockingQueue (См. код в репозитории) так, чтобы
		 очередь была на основе массива (ArrayDeque)
		 размер очереди задавался через пареметр size в конструкторе
		 при попытки положить элемент в заполненную очередь поток-продьюсер ожидал бы освобождение места*/




