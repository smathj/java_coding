package com.coding.study.book.quiz.tree.BinarySearchTree;

public class Node {
    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return this.left;
    }

    public void setLeftChild(Node node) {
        this.left = node;
    }

    public Node getRightChild() {
        return this.right;
    }

    public void setRightChild(Node node) {
        this.right = node;
    }
}

