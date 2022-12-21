package HW_Java.AddressPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        //1
        Address address1 = new Address(" Berlistr ", 22);
        Address address2 = new Address(" Hofenstr  ", 54);
        Address address3 = new Address(" Eckenerstraße ", 3);

        Person person1 = new Person("Jack", address1);
        Person person2 = new Person("Ann", address2);
        Person person3 = new Person("Tom", address3);

        List<Person> personList = Arrays.asList(person1, person2, person3);
        System.out.println("task 1 -- " + getAddress(personList));

        //2
        List<String> nameList = Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia");
        System.out.println("task 2 -- " + "Ivan,Maria, Stephan, John,Amalia  -->  " + ListNamePerson(nameList));

        //3
        List<Integer> list1 = Arrays.asList(340, 30, 57, 320);
        List<Integer> list2 = Arrays.asList(666, 30, 57, 30);
        System.out.println("task 3 -- " + yesNo(list1, list2));

        //4
        List<Integer> reversList = Arrays.asList(23, 45, 32, 67, 99, 13);
        System.out.println("task 4 -- 23,45,32,67,99,13 --> " + revrs(reversList));
        //5
        List<String> minMaxString = Arrays.asList("bb", "a", "ff", "ddd", "rr");
        System.out.println("task 5 --  (\"bb\",\"a\",\"ff\",\"ddd\" ) --->  " + returnsString(minMaxString));

        List<String> minMaxString2 = Arrays.asList("bb", "aaa", "ff", "d", "aa");
        System.out.println("task 5 --  (\"bb\",\"aaa\",\"ff\",\"d\" ) --->  " + returnsString(minMaxString2));

        //6
        List<Integer> numN=Arrays.asList(23,45,43,23,67,88);
        System.out.println("task 6 -- 23,45,43,23,67,88 ---> "+ withoutElementsMoreThanN(numN,23) );
    }

    //======================================================================
    /* todo:  1.Есть два класса: Address с полями улица и номер дома и
           Person с полями  name and address.  нужно написать
          метод List<Address> getAddress(List<Person> persons).
          то есть по списку persons вернуть список их адресов */

    public static List<Address> getAddress(List<Person> personList) {
        List<Address> addresses = new ArrayList<>();
        for (Person p : personList) {
            addresses.add(p.getAddress());
        }
        return addresses;
    }

    //=====================================================
  /*todo: 2. есть список с именами Ivan,Maria, Stephan, John,Amalia.
      Написать метод, который вернет список не содержащий
      имена исходного списка длиной 4
      Ivan,Maria, Stephan, John,Amalia. -> Maria, Stephan,Amalia.*/
    public static List<String> ListNamePerson(List<String> nameList) {
        List<String> rrr = new ArrayList<>();
        for (String oo : nameList) {
            if (oo.length() != 4)
                rrr.add(oo);
        }
        return rrr;
    }
    // ===========================================================

    /*todo  3. Есть два списка одинаковой длины с целыми числами. Написать метод, который вернет
        списиок с элементами Yes или No где значение на i-м месте зависит от того равны ли
        элементы двух списков под номером i
       {1,2,3,4} ,{5,2,3,8} ->{No,Yes,Yes,No}*/
    public static List<String> yesNo(List<Integer> listnum1, List<Integer> listnum2) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < listnum1.size(); i++) {
            if (listnum1.get(i) == listnum2.get(i))
                res.add("Yes");
            else res.add("No");
        }
        return res;
    }
    //===========================================================

    /*todo   4.Написать метод, реверсирующий список,т.е. возвращающий список элементов в обратном порядке
       1,2,3 -> 3,2,1   Можно использовать методы класса Collections*/
    public static List<Integer> revrs(List<Integer> reversList) {
        Collections.reverse(reversList);
        return reversList;
    }

    //===========================================================

   /*todo: 5*.Написать метод, который возвращает строку, встречающуюся раньше в листе: самую
        // короткую или самую длинную. Если несколько строчек самые короткие или самые длинные,
        // тогда вернуть первую встреченную  из них. Лист не пустой
        //"bb","a","ff","ddd" -> "a"
        //"bb","aaa","ff","d" -> "aaa"*/

    public static List<String> returnsString(List<String> strings) {
        String temp = strings.get(0);
        int minString = Integer.MIN_VALUE;
        int maxString = Integer.MAX_VALUE;
        for (int i = 0; i < strings.size(); i++) {
            if (temp.length() > strings.get(i).length()) {
                minString = i;
                temp = strings.get(i);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (temp.length() < strings.get(i).length()) {
                maxString = i;
                temp = strings.get(i);
            }
        }
        if (minString < maxString) {
            temp = strings.get(minString);
        } else {
            temp = strings.get(maxString);
        }
        return Collections.singletonList(temp);
    }

    // ================================================================
/*todo:Есть лист  целых чисел. Написать метод, который вернет список без элементов, больше числа n.
   public List withoutElementsMoreThanN(List ints, int n)  */
    public static List<Integer> withoutElementsMoreThanN(List<Integer> ints, int n) {
        List<Integer> num = new ArrayList<>();
        for (Integer tt : ints) {
            if (tt <= n) {
                num.add(tt);
            }
        }
        return num;
    }
}





