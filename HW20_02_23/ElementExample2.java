package HW_Java.Java.HW20_02_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementExample2 {
    public static List<Integer>  removingDuplicateElementsExample2(int[] arrs1) {
        Arrays.stream(arrs1).distinct().filter(x -> Arrays.stream(arrs1)
                .anyMatch(y -> y == x)).forEach(System.out::print);
        return null;
    }
}
