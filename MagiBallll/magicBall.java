package org.example.MagiBallll;

import java.util.Random;

public class magicBall{
	private static final String BALL0 = "Беспорно";
	private static final String BALL1 = "Определено да";
	private static final String BALL2 = "Вероятно всегда";
	private static final String BALL3 = "Хорошие перспективы";
	private static final String BALL4 = "Спроси позже";
	private static final String BALL5 = "НЕТ";
	private static final String BALL6 = "НЕТ";
	private static final String BALL7 = "Весьма сомнительно";

	public static String getPrediction() {
		int rand = new Random().nextInt(8);
		if (rand == 0) {
			return BALL0;
		}
		else if(rand == 1) {
			return BALL1;
		}
		else if(rand == 2) {
			return BALL2;
		}
		else if(rand == 3) {
			return BALL3;
		}
		else if(rand == 4) {
			return BALL4;
		}
		else if(rand == 5) {
			return BALL5;
		}
		else if(rand == 6) {
			return BALL6;
		}
		else if(rand == 7) {
			return BALL7;
		}
		return null;
	}

}
