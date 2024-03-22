package chapter.inflearn.recursive_tree_graph.m07;

import java.util.LinkedList;
import java.util.Queue;


class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main_T {
    Node root;

    public static void main(String[] args) {
        Main_T tree = new Main_T();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }


    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        // 최초에 루트 노드를 넣음
        Q.add(root);

        // 레벨
        int L = 0;

        // 큐가 들어있다면
        while (!Q.isEmpty()) {

            int len = Q.size();
            System.out.print(L + " : ");

            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                // 현재 노드의 왼쪽 자식 노드가 있다면 큐에 저장
                if (cur.lt != null) Q.add(cur.lt);

                // 현재 노드의 오른쪽 자식 노드가 있다면 큐에 저장
                if (cur.rt != null) Q.add(cur.rt);
            }

            // 레벨을 증가 시킴
            L++;
            System.out.println();
        }

    }
}
