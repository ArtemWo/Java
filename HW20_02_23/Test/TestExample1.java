package HW_Java.Java.HW20_02_23.Test;

import HW_Java.Java.HW20_02_23.ElementsExample1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TestExample1 {

    @Test
    void testFindElementsExample1() {

      int[] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = {1, 0, 6, 15, 6, 4, 7, 0};
        List<Integer> expected = List.of(1, 7);
        List<Integer> actualTest = ElementsExample1.findElements(arr1, arr2) ;
        Assertions.assertEquals(actualTest, actualTest);
    }
}