package com.sparta.wl.binary_tree;

public interface BinarySort {
    int getRootElement();

    int getNumberOfElement();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element);

    int getRightChild(int element);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
