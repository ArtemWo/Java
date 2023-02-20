package HW_Java.Java.HW25_1_23;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
/*      todo  1. Напишите код, который создает Stream из массива чисел,
          фильтрует его по четным числам и выводит результат в консоль.*/
        int[] num = {22, 33, 3, 43, 8, 99};
        java.util.Arrays.stream(num).filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");

 /*todo   2. Напишите код, который создает Stream из списка строк,
            отсортировывает его по длине строк и выводит результат в консоль.*/
        List<String> list = Arrays.asList("1234", "12345", "123", "12", "123456");
        list.stream().sorted((x1, x2) -> x1.length() - x2.length()).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");

/* todo  3. Напишите код, который создает Stream из диапазона чисел,
           отображает каждое число к его квадрату и выводит результат в консоль.*/
        IntStream.range(2, 7).map(x -> x * x).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");

/*todo  4. Напишите код, который создает Stream из списка объектов,
          объединяет их в одну строку и выводит результат на консоль.*/
        List<Object> list1 = Arrays.asList("124", 2344, "4321", 45, "wwww");
        Object qqq = list1.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(qqq);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");

/*todo  5. Напишите код, который создает Stream из списка чисел,
           используя метод reduce () находит наибольшее число в списке.*/
        List<Integer> list2 = Arrays.asList(2, 23, 45, 22, 1);
        Optional<Integer> tt = list2.stream().reduce(Integer::max);
        System.out.println(tt);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");

/* todo  6. Напишите код, который создает Stream из Map, используя метод filter () и метод forEach() выводит
           ключ - значение только тех элементов, значение которых больше заданного.*/
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "aaa");
        map.put(27, "rr");
        map.put(4, "uuu");
        map.put(32, "mmm");
        map.put(55, "ppp");
        Stream<Map.Entry<Integer, String>> mapStream = map.entrySet().stream();
        mapStream.filter(x -> x.getKey() > 20)
                .forEach(x -> System.out.println(x.getKey() + "     " + x.getValue()));

/*todo   Напишите код, который считывает текстовый файл и используя Stream API,
               подсчитывает количество слов в файле.*/

        Stream<String> lines =
                null;
        try {
            lines = Files.lines(Paths.get("data.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long wordsCount = lines
                .flatMap(s -> Stream.of(s.split("[\s\n\t\r]+")).filter(t -> !t.isEmpty()))
                .count();
          lines.close();
        System.out.println("Number of words: " + wordsCount);


    }
}