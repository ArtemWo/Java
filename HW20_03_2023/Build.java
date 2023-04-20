package org.example.HW20_03_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;


public class Build{
	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();


		executor.submit(new BuildingTask(10));
		executor.submit(new BuildingTask(10));
		executor.submit(new BuildingTask(10));
		executor.submit(new BuildingTask(10));


		executor.shutdown();
	}

	static class BuildingTask implements Runnable {
		private final int numHouses;

		public BuildingTask(int numHouses) {
			this.numHouses = numHouses;
		}

		public void run() {
			// Строим дома
			for (int i = 1; i <= numHouses; i++) {
				System.out.println("Строим дом #" + i);


				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}


			System.out.println("Постройка всех домов завершена");
		}
	}
}