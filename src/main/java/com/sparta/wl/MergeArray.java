package com.sparta.wl;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,4,5,6,7};
        int[] sortedNumbers = sortTwoArray(array1, array2);
        for (int i = 0; i < sortedNumbers.length; i ++) {
            System.out.print(sortedNumbers[i]);
            if (i < sortedNumbers.length - 1)
                System.out.print(", ");
        }
    }

    public static int[] sortTwoArray(int[] array1, int[] array2) {
        int[] sortedNumbers = new int[array1.length + array2.length];
        int n1 = 0, n2 = 0;
        for (int i = 0; i < sortedNumbers.length; i ++) {
            if (n1 >= array1.length) {
                sortedNumbers[i] = array2[n2];
                n2++;
            } else if (n2 >= array2.length) {
                sortedNumbers[i] = array1[n1];
                n1++;
            } else {
                if (array1[n1] < array2[n2]) {
                    sortedNumbers[i] = array1[n1];
                    n1++;
                } else {
                    sortedNumbers[i] = array2[n2];
                    n2++;
                }
            }
        }
        return sortedNumbers;
    }
}
