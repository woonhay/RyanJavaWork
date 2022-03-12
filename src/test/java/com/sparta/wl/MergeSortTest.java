package com.sparta.wl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {
    @Test
    public void testMergeSort() {
        MergeSort ms = new MergeSort();

        int[] numbers = {6, 5, 12, 10, 9, 1};

        int[] actual = ms.sort(numbers);
        int[] expected = {1, 5, 6, 9, 10, 12};

        //Assertions.assertEquals(expected, actual);

        for (int i = 0; i < numbers.length; i ++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}
