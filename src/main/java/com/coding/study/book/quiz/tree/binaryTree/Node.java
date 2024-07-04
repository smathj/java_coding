package chapter.book.quiz.tree.binaryTree;

public class Node {
    private int value;
    private Node left = null;
    private Node right = null;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return left;
    }

    public void setLeftChild(Node left) {
        this.left = left;
    }

    public Node getRightChild() {
        return right;
    }

    public void setRightChild(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}