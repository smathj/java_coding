package chapter.quiz.tree.BinarySearchTree;

import chapter.quiz.tree.traversal.Traversal;

public class Main5 {

    /* binary tree
     *                 13
     *         9               19
     *     5       11       15     20
     *   1   7   10  12   14  17
     */
    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int arr[] = new int[]{13, 9, 19, 5, 11, 15, 20, 1, 7, 10, 12, 14, 17};

        for (int v : arr) {
            binarySearchTree.insert(v);
        }

        Traversal traversal = new Traversal();
        traversal.preorder(binarySearchTree.getRoot());



    }
}
