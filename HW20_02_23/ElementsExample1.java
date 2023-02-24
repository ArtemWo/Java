package HW_Java.Java.HW20_02_23;

import java.util.Arrays;
import java.util.List;

public class ElementsExample1 {
    public static List<Integer> findElements(int[] arr1, int[] arr2) {
        Arrays.stream(arr1).distinct().filter(x -> Arrays.stream(arr2)
                .anyMatch(y -> y == x)).forEach(System.out::println);
        return null;
    }
}
