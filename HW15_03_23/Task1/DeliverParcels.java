package org.example.HW15_03_23.Task1;

import java.util.concurrent.Exchanger;

public class DeliverParcels implements Runnable{
	private String truckName;
	private String startingPoint;
	private String endPoint1;
	private String endPoint2;
	private Exchanger<String> exchanger;

	public DeliverParcels(String truckName, String startingPoint, String endPoint1, String endPoint2, Exchanger<String> exchanger) {
		this.truckName = truckName;
		this.startingPoint = startingPoint;
		this.endPoint1 = endPoint1;
		this.endPoint2 = endPoint2;
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			//1
			System.out.println(truckName + " начал движение " + startingPoint);
			Thread.sleep(3000);
			System.out.println(truckName + " в пути " + endPoint1);
			Thread.sleep(5000);
			String exchangePointE = exchanger.exchange(endPoint1);
			System.out.println(truckName + " обменял посылку " + exchangePointE);
			//2
			System.out.println(truckName +" начал движение "+startingPoint);
			Thread.sleep(2000);
			System.out.println(truckName+" в пути "+ endPoint2);
			Thread.sleep(5000);
			exchangePointE =exchanger.exchange(endPoint2);
			System.out.println(truckName+" обменял посылку "+ exchangePointE);
			Thread.sleep(3000);

			System.out.println(truckName+ " вернулся на база "+ startingPoint);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
}


