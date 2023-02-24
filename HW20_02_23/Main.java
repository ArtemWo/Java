package HW_Java.Java.HW20_02_23;

import java.util.Arrays;


import static HW_Java.Java.HW20_02_23.ElementExample2.removingDuplicateElementsExample2;
import static HW_Java.Java.HW20_02_23.ElementsExample1.findElements;

public class Main {
    public static void main(String[] args) {
/*todo 1. Напишите программу на Java и тест для нее для поиска общих элементов между двумя массивами целых чисел
                  example input:
            Array1: [1, 2, 5, 5, 8, 9, 7, 10]
            Array2: [1, 0, 6, 15, 6, 4, 7, 0]
            example expected:  [1, 7]
            2. Напишите программу на Java и тест для нее для удаления повторяющихся элементов из массива.
            example input:
            [0, 3, -2, 4, 3, 2]
            example expected:
            [0, 3, -2, 4, 2]
           3. В классе UserService(см.код занятия в репозитории) реализовать метод public void deleteInactive
           (List < User > users),
            который будет удалять с помощью метода UserRepository deleteUser( int id)из БД всех неактивных
            пользователей из списка.
             Составить тест на данный метод с применением Mockito.*/
        int[] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = {1, 0, 6, 15, 6, 4, 7, 0};
        System.out.println("Example 1: ");
        findElements(arr1, arr2);
        //==========================================================
        int[] arrs1 = {0, 3, -2, 4, 3, 2};
        System.out.println("Example 2: ");
      removingDuplicateElementsExample2(arrs1);
    }
}





