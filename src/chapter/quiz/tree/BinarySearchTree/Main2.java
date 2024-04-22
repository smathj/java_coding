package chapter.quiz.tree.BinarySearchTree;

public class Main2 {

    public static void main(String[] args) {
        /* binary tree
         *        13
         *    9       17
         *  7   11  14
         */

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(13);
        binarySearchTree.insert(9);
        binarySearchTree.insert(17);
        binarySearchTree.insert(7);
        binarySearchTree.insert(11);
        binarySearchTree.insert(14);
        binarySearchTree.insert(14);

        binarySearchTree.bfs(binarySearchTree.getRoot());
    }
}
