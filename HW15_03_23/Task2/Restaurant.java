package org.example.HW15_03_23.Task2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Restaurant implements Runnable{
	private String name;
	private static Random random = new Random();
	private static Semaphore tables = new Semaphore(5);
	private static Semaphore cookSup = new Semaphore(1);
	private static Semaphore cookSalat = new Semaphore(1);
	private static Semaphore cookSecondCourse = new Semaphore(1);
	private static Semaphore waiter = new Semaphore(1);

	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
		public void run() {
			try {
				//Sup
				System.out.println(Thread.currentThread().getName() + " пришел в ресторан ");
				tables.acquire();

				System.out.println(Thread.currentThread().getName() + " занял стол ");
				Thread.sleep(3000);
				waiter.acquire();

				System.out.println(Thread.currentThread().getName() + " позвал офицанта, заказывает... ");
				Thread.sleep(4000 + random.nextInt(3000));

				System.out.println(Thread.currentThread().getName() + "  заказал СУП, САЛАТ и ВТОРОЕ БЛЮДО- ожидает заказ...");
				cookSup.acquire();
				cookSalat.acquire();
				cookSecondCourse.acquire();
				Thread.sleep(5000);

				System.out.println(Thread.currentThread().getName() + " повара готовят СУП, САЛАТ и ВТОРОЕ БЛЮДО ");
				Thread.sleep(4000);

				System.out.println(Thread.currentThread().getName() + " получил СУП ");
				Thread.sleep(3000);
				cookSup.release();
				System.out.println(Thread.currentThread().getName() + " получил САЛАТ ");
				Thread.sleep(3000);
				cookSalat.release();
				System.out.println(Thread.currentThread().getName() + " получил ВТОРОЕ БЛЮДО ");
				Thread.sleep(3000);
				cookSecondCourse.release();

				System.out.println(Thread.currentThread().getName() + " покушал ");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " позвал офицанта, расплатился оставил отзыв... ");
				Thread.sleep(4000 + random.nextInt(5000));
				System.out.println(Thread.currentThread().getName()+" покинул ресторан");

				waiter.release();
				tables.release();


			} catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

