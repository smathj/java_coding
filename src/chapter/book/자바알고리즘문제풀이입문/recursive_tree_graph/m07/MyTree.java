package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m07;


public class MyTree {


    // 데이터
    private int data;

    // 부모 노드

    // 왼쪽 자식 노드
    private MyTree leftTree;

    // 오른쪽 자식 노드
    private MyTree rightTree;


    // 루트 노드 여부
    private boolean isRoot;

    //! 레벨
    private int level;

    // 자식 노드 가진 여부

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    public MyTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(MyTree leftTree) {
        this.leftTree = leftTree;
        leftTree.setLevel(this.level+1);
    }

    public MyTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(MyTree rightTree) {
        this.rightTree = rightTree;
        rightTree.setLevel(this.level+1);
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean root) {
        isRoot = root;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public MyTree() {
    }

    public MyTree(int data) {
        this.data = data;
    }

    public MyTree(int data, boolean isRoot) {
        this.data = data;
        this.isRoot = isRoot;
        this.level = 1;
    }

    public MyTree(int data, MyTree leftTree, MyTree rightTree, boolean isRoot) {
        this.data = data;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
        this.isRoot = isRoot;
    }

    //! 전위 순위 출력
    public void frontPrint(MyTree myTree) {

        if (myTree == null) return;

        // 가지고 있는 데이터를 출력
        System.out.print(myTree.getData() + " ");

        // 왼쪽 노드
        MyTree leftTree = myTree.getLeftTree();
        if (leftTree != null) {
            myTree.frontPrint(leftTree);
        }

        // 오른쪽 노드
        MyTree rightTree = myTree.getRightTree();
        if (rightTree != null) {
            rightTree.frontPrint(rightTree);
        }

    }

    //! 중위 순위 출력
    public void middlePrint(MyTree myTree) {

        if (myTree == null) return;


        // 왼쪽 노드
        MyTree leftTree = myTree.getLeftTree();
        if (leftTree != null) {
            myTree.middlePrint(leftTree);
        }

        // 가지고 있는 데이터를 출력
        System.out.print(myTree.getData() + " ");


        // 오른쪽 노드
        MyTree rightTree = myTree.getRightTree();
        if (rightTree != null) {
            rightTree.middlePrint(rightTree);
        }

    }

    //! 후위 순위 출력
    public void backPrint(MyTree myTree) {
        if (myTree == null) return;


        // 왼쪽 노드
        MyTree leftTree = myTree.getLeftTree();
        if (leftTree != null) {
            myTree.backPrint(leftTree);
        }


        // 오른쪽 노드
        MyTree rightTree = myTree.getRightTree();
        if (rightTree != null) {
            rightTree.backPrint(rightTree);
        }

        // 가지고 있는 데이터를 출력
        System.out.print(myTree.getData() + " ");

    }

    //? 레벨 탐색 순회 출력
    public void levelPrint(MyTree tree) {

        // 값 출력
        System.out.print(tree.data + " ");

        // 왼쪽 출력
        if (tree.leftTree != null) {
            tree.leftTree.levelPrint(tree.leftTree);
        }

        // 오른쪽 출력
        if (tree.rightTree != null) {
            tree.rightTree.levelPrint(tree.rightTree);
        }

    }

    @Override
    public String toString() {
        return "MyTree{" +
                "data=" + data +
                ", leftTree=" + leftTree +
                ", rightTree=" + rightTree +
                ", isRoot=" + isRoot +
                '}';
    }
}
