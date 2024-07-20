package com.coding.study.book.quiz.tree.BinarySearchTree;

public class Main4 {
    public static void main(String[] args) {
        /* binary tree
         *                      56
         *            10                  [94] -> 99
         *        8        17          77         [101]
         *     [3]   9     12  49    65   81    99* -> null
         */

        BinarySearchTree binarySearchTree0 = new BinarySearchTree();
        BinarySearchTree binarySearchTree1 = new BinarySearchTree();
        BinarySearchTree binarySearchTree2 = new BinarySearchTree();

        int arr[] = new int[]{56, 10, 94, 8, 17, 77, 101, 3, 9, 12, 49, 63, 81, 99};
        for (int v : arr) {
            binarySearchTree0.insert(v);
            binarySearchTree1.insert(v);
            binarySearchTree2.insert(v);
        }

/*

        // 1. 자식 노드가 없는 경우
        System.out.println("자식 노드가 없는 노드 3을 지운 결과");
        binarySearchTree0.delete(binarySearchTree0.getRoot(), 3);
        binarySearchTree0.bfs(binarySearchTree0.getRoot());
        System.out.println("\n");

        // 2. 자식 노드가 1개인 경우
        System.out.println("자식 노드가 1개인 노드 101을 지운 결과");
        binarySearchTree1.delete(binarySearchTree1.getRoot(), 101);
        binarySearchTree1.bfs(binarySearchTree1.getRoot());
        System.out.println("\n");
*/



        // 3. 자식 노드가 2개인 경우
        System.out.println("자식 노드가 2개인 노드 94을 지운 결과");
        binarySearchTree2.delete(binarySearchTree2.getRoot(), 94);
        binarySearchTree2.bfs(binarySearchTree2.getRoot());
        System.out.println("\n");


    }
}
