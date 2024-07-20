package com.coding.study.book.quiz.tree.BinarySearchTree;

public class Main3 {

    public static void main(String[] args) {
        /* binary tree
         *                      56
         *            10                  94
         *        8        17        77         101
         *     3   9     12  49    65   81    99
         */

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int arr[] = new int[]{56, 10, 94, 8, 17, 77, 101, 3, 9, 12, 49, 63, 81, 99};

        for (int v : arr) {
            binarySearchTree.insert(v);
        }

        System.out.println();
        binarySearchTree.bfs(binarySearchTree.getRoot());
        System.out.println();
        System.out.println();
    }
}
