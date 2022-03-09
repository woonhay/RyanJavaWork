package com.sparta.wl;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {3,60,35,2,45,320,5};
        int[] sortedNumbers = bubleSort(numbers);
        for (int i = 0; i < sortedNumbers.length; i ++) {
            System.out.print(sortedNumbers[i]);
            if (i < sortedNumbers.length - 1)
                System.out.print(", ");
        }
    }

    public static int[] bubleSort(int[] numbers) {
        int n = numbers.length;
        int temp = 0;
        for (int i = 0; i < n; i ++) {
            for (int j = 1; j < (n - i); j ++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
