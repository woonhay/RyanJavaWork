package com.sparta.wl;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 12, 10, 9, 1};

        numbers = sort(numbers);

        for (int i = 0; i < numbers.length; ++i)
            System.out.print(numbers[i] + " ");
    }

    public static int[] sort(int numbers[])
    {
        if (numbers.length > 1) {
            int m = numbers.length / 2;
            int[] array1 = new int[numbers.length / 2];
            for (int i = 0; i < array1.length; i ++) {
                array1[i] = numbers[i];
            }
            int[] array2;
            if (numbers.length % 2 == 0)
                array2 = new int[numbers.length / 2];
            else
                array2 = new int[numbers.length / 2 + 1];
            for (int i = 0; i < array2.length; i ++) {
                array2[i] = numbers[i + array1.length];
            }
            array1 = sort(array1);
            array2 = sort(array2);

            MergeArray ma = new MergeArray();

            int[] sortedNumbers = ma.sortTwoArray(array1, array2);
            return sortedNumbers;
        }
        else {
            return numbers;
        }
    }
}
