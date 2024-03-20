package chapter.inflearn.recursive_tree_graph.m05;



/*

전위순회 출력 : 1 2 4 5 3 6 7

중위순회 출력 : 4 2 5 1 6 3 7

후위순회 출력 : 4 5 2 6 7 3 1

 */
public class Main {

    public static void main(String[] args) {

        // 이진 트리 만들기
        MyTree node1 = new MyTree(1, true);
        MyTree node2 = new MyTree(2);
        MyTree node3 = new MyTree(3);
        MyTree node4 = new MyTree(4);
        MyTree node5 = new MyTree(5);
        MyTree node6 = new MyTree(6);
        MyTree node7 = new MyTree(7);



        node1.setLeftTree(node2);
        node1.setRightTree(node3);

        node2.setLeftTree(node4);
        node2.setRightTree(node5);

        node3.setLeftTree(node6);
        node3.setRightTree(node7);

        System.out.print("전위순회 출력 : ");
        node1.frontPrint(node1);

        System.out.println();

        System.out.print("중위순회 출력 : ");
        node1.middlePrint(node1);

        System.out.println();

        System.out.print("후위순회 출력 : ");
        node1.backPrint(node1);


    }

}