package org.example.SwichCase;

public class TextoNumber{



	public static void main(String[] args) {
		String str = "99_666_999";
		for(char s : str.toCharArray()){
			System.out.print(digitToText(s));
			System.out.print(" ");

			{
			}
		}
	}


	public static String digitToText(char digit) {
		String strNum = "";
		switch(digit) {
			case '0':
				strNum = "null";
				break;
			case '1':
				strNum = "eins";
				break;
			case '2':
				strNum = "zwei";
				break;
			case '3':
				strNum = "drei";
				break;
			case '4':
				strNum = "vier";
				break;
			case '5':
				strNum = " fünf";
				break;
			case '6':
				strNum = "sechs";
				break;
			case '7':
				strNum = "sieben";
				break;
			case '8':
				strNum = "acht";
				break;
			case '9':
				strNum = "neun";
				break;

		}
		return strNum;
	}
}
