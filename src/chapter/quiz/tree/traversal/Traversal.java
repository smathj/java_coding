package chapter.quiz.tree.traversal;

import chapter.quiz.tree.BinarySearchTree.Node;

public class Traversal {


    /**
     * 전위 순회
     */
    public void preorder(Node node) {
        // 기저조건 - 리프 노드의 자식노드일때
        if (node == null) {
            return;
        }

        System.out.print(" " + node.getValue());    // 현재 노드
        preorder(node.getLeftChild());              // 왼쪽 영역
        preorder(node.getRightChild());             // 오른쪽 영역

    }

    /**
     * 중위 순회
     */
    public void inorder(Node node) {
        // 기저조건 - 리프 노드의 자식노드일때
        if (node == null) {
            return;
        }

        inorder(node.getLeftChild());               // 왼쪽 영역
        System.out.print(" " + node.getValue());    // 현재 노드
        inorder(node.getRightChild());              // 오른쪽 영역


    }

    /**
     * 후위 순회
     */
    public void postorder(Node node) {
        // 기저조건 - 리프 노드의 자식노드일때
        if (node == null) {
            return;
        }

        postorder(node.getLeftChild());             // 왼쪽 영역
        postorder(node.getRightChild());            // 오른쪽 영역
        System.out.print(" " + node.getValue());    // 현재 노드



    }

}
