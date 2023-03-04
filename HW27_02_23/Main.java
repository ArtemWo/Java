package org.example.HW27_02_23;


public class Main {
    public static void main(String[] args) throws InterruptedException {
/* todo посчитать количество целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
            которые делятся на заданное целое число без остатка.
           Решить данную задачу последовательно и параллельно в нескольких потоках.
           Сравнить время выполнения.*/
        System.out.println(Runtime.getRuntime().availableProcessors());

        int number = 0;
        int divisor = 2;
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (i % divisor == 0) {
                number++;
            }
        }
           System.out.println(number);


    }
}





