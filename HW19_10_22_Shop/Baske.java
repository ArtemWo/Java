package HW_Java.HW19_10_22_Shop;
import java.util.Arrays;
 /*TODO:
    В задаче  про магазин (от  2022-10-19 ) добавить класс корзина (Basket). Реализовать метод добавления
    и добавления товара в корзину. Реализовать метод checkout, который должен возвращать список товаров и финальную
    стоимость покупки в виде строки.
    Подсказка1: класс корзина представляет собой класс, который управляет массивом товаров. Примерно аналогичный тому,
    что мы реализовывали в классе.
    Подсказка2: для получение строки в методе checkout желательно использовать StringBuilder
    Ограничение: не использовать стандартные классы коллекций в Java. Использовать только массив */



public class Baske {

    public static void checkout(String[] array) {

        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(new String[]{"Checkout: " +
                                        "\n"+ "Juice-5€", "Jacket-86€","Sony mobil-680€", "TV-600€"}));
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(new String[]{"Checkout: " +
                    "\n"+ "Juice-5€", "Jacket-86€","Sony mobil-680€", "TV-600€"});
        }
        System.out.print(stringBuilder.toString());
    }
}








