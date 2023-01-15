package HW_Java.HW11_1_23;

import java.util.*;

import java.util.function.Consumer;

public class Main {

    static List<String> list4 = Arrays.asList("""
            Не говори мне о толпе безумной 
            Она иной раз вдохновение спугнёт
            Избавь меня от этой давки шумной
            Влекущей мощно в свой водоворот
            Нет тишины ищу я многодумный
            Лишь там поэту радость расцветёт
            Там только там божественною властью
            Любовь и дружба нас приводит к счастью""");


    public static void main(String[] args) {
        System.out.println("-----------------------------ForEach--------------------------------------------------");
        example1();
        System.out.println("-----------------------------Number of words:------------------------------------------");
        example2();
        System.out.println("------------------------------random-------------------------------------------");
        random();


    }

    //"-----------------------------ForEach--------------------------------------------------"
    public static void example1() {
        Consumer<String> consumer = (x) -> System.out.println(x);
        analogForEach(list4, consumer);
    }

    public static void analogForEach(List<String> list, Consumer<String> consumer) {
        for (String e : list)
            consumer.accept(e);
    }

    //"-----------------------------Number of words:------------------------------------------"
    public static void example2() {
        list4.forEach((x) -> System.out.println("Word: " + x + "\n" + " | Number of words:  " + x.length()));
    }

    //"------------------------------random-------------------------------------------"
    public static void random() {
        String eee = list4.toString();
        list4.forEach((x) -> System.out.println((int) (Math.random() * eee.length())));
    }
}

