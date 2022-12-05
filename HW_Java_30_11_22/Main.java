package HW_Java.HW_Java_30_11_22;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
 /*  TODO:
         First level: На основании созданного во время занятия связанного списка,
         создайте двунаправленный связанный список и реализуйте методы:
        public boolean add(Type elem) {…}
        public void add(int index, Type elem) {…}
        public Type remove (int index) {…}*/


        var linkedList = new LinkedListImpl<String>();
        linkedList.add("Head element 1 ");
        linkedList.add("Next element 2 ");
        linkedList.add("Tail element 3 ");

        linkedList.add(2,"Tail element 4 ");
        System.out.println("==============Tail element 4==============");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println("==============Remove element============");
        System.out.println(linkedList);
        linkedList.printData();
        System.out.println(linkedList);

    }
}

