package HW_Java.HW_alle_zusammen;

import java.util.Scanner;

public class Main20_09_2022 {
    public static void main(String[] args) {
        /*Представьте, что вы пишите программу для онлайн кинотеатра. У вас известно возрастное ограничение фильма и
        возраст клиента (естественно заданы в виде переменных)
        Ваша программа должна выдавать на экран: «вы можете смотреть этот фильм» или «данный контент вам не доступен»*/

        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int age = console.nextInt();
              if (age < 18){
                  System.out.println("Eshe moloj idi domoj... !!!");
              }
              else {
                  System.out.printf("Priyatnogo prosmotra... !!!");
              }
        //__________________________________________________________________________________________________________________-
       /* Допустим, вам дано целое число, которое обозначает год. Напишите метод,
        который определяет, этот год високосный или нет*/

       // leapYear(2014);
    }

    /*public static int leapYear(int leap_year) {

        if (leap_year % 4 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
        return leap_year;
    }*/
}
