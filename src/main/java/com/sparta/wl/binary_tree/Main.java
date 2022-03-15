package com.sparta.wl.binary_tree;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {5, 4, 7, 2, 11};

        BinaryTree tree = new BinaryTree(array[0]);

        tree.addElements(array);

        int[] sortedArray = tree.getSortedTreeAsc();
        int[] desc = tree.getSortedTreeDesc();
        for (int i = 0; i < sortedArray.length; i ++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < desc.length; i ++) {
            System.out.print(desc[i] + " ");
        }
    }


}
