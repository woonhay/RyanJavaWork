package com.sparta.wl.binary_tree;

import java.util.ArrayList;

public class BinaryTree implements BinarySort {
    private final Node rootNode;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElement() {
        return countNode(rootNode);
    }

    private int countNode(Node rootNode) {
        if (rootNode == null)
            return 0;
        else
            return 1 + countNode(rootNode.getRightChild()) + countNode(rootNode.getLeftChild());
    }

    @Override
    public void addElement(int element) {
        addNoteToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 1; i < elements.length; i ++)
            addElement(elements[i]);
    }

    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        else
            return false;
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            }
            else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int getLeftChild(int element) {
        if (findElement(element)) {
            Node node = findNode(element);
            node = node.getLeftChild();
            if (node != null)
                return node.getValue();
            else
                return 0;
        }
        else
            return 0;
    }

    @Override
    public int getRightChild(int element) {
        if (findElement(element)) {
            Node node = findNode(element);
            node = node.getRightChild();
            if (node != null)
                return node.getValue();
            else
                return 0;
        }
        else
            return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] sortedArray = new int[getNumberOfElement()];
        ArrayList<Integer> list = new ArrayList<Integer>();
        inOrder(rootNode, list);

        for (int i = 0; i < sortedArray.length; i ++) {
            sortedArray[i] = list.get(i);
        }
        return sortedArray;
    }

    public void inOrder(Node node, ArrayList list){
        if(node != null){
            inOrder(node.getLeftChild(), list);
            list.add(node.getValue());
            inOrder(node.getRightChild(), list);
        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedArray = new int[getNumberOfElement()];
        ArrayList<Integer> list = new ArrayList<Integer>();
        inOrder(rootNode, list);

        for (int i = 0; i < sortedArray.length; i ++) {
            sortedArray[i] = list.get(sortedArray.length - 1 - i);
        }
        return sortedArray;
    }

    private void addNoteToTree(Node node, int element) {
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            }
            else {
                addNoteToTree(node.getLeftChild(), element);
            }
        }
        else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            }
            else {
                addNoteToTree(node.getRightChild(), element);
            }
        }
    }
}
