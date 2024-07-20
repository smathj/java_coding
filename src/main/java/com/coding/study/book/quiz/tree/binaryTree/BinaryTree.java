package com.coding.study.book.quiz.tree.binaryTree;


public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 너비 우선 탐색 BFS
     * 큐를 이용한 탐색 방법
     */
    public void bfs(Node root) {
        // 앞에서 직접 만든 큐 자료형
        chapter.book.quiz.queue.linkedlist.LinkedListQueue queue = new chapter.book.quiz.queue.linkedlist.LinkedListQueue();
//        LinkedList<Node> nodes = new LinkedList<Node>();

        queue.enqueue(root);

        while (!queue.empty()) {
            Node node = (Node) queue.dequeue();
            System.out.print(node.getValue() + " ");
//            System.out.println(node.toString());

            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }

            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }

    }

}
