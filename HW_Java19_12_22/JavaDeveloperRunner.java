package HW_Java.HW_Java19_12_22;

import java.util.ArrayList;
import java.util.List;
//   я не успел сделать домашку и мы ее разобрали на уроке, я сделал другую на тему Iterator
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Srping", "Hibernate", "Maven", "PostgreSOL"};
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(List.of(skills));

        JavaDeveloper javaDeveloper = new JavaDeveloper("Eugene", skills);
        Iterator iterator = javaDeveloper.getIterator(skills);
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills:  ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "  ");
        }
    }
}
