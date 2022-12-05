package HW_Java.LinkedList2;

import java.util.LinkedList;

public class LinkenList2 {
    public static void main(String[] args) {
        String element1 = new String("element1 ");
        String elment2 = new String("element2 ");
        String element3 = new String("element3");
        String element4 = new String("element4");
        String element5 = new String("element5");


        LinkedList<String> list = new LinkedList();
        list.add(element1);
        list.add(elment2);
        list.add(element3);
        list.add(element4);
        list.add(2, element5);

        list.remove(1);
        System.out.println(list);

    }
}
