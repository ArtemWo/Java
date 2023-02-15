package HW_Java.Java.HW13_02_2023;

public class Main {
    public static void main(String[] args) {
 /*todo       Напишите класс, который реализует ограниченную коллекцию, где максимальное
        количество элементов может быть задано в конструкторе, и элементы могут быть любого типа.*/
        LimitedCollection<String> collection = new LimitedCollection<>(3);
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        System.out.println(collection.size()); // Output: 3
        System.out.println(collection.get(0)); // Output: "one"
    }
}
