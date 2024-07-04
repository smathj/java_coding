package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m10;

import chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m09.Main;

import java.util.LinkedList;
import java.util.Queue;

public class Main_Copy {

    public static class Node {

        int data;
        Node lt;
        Node rt;

        public Node(int val) {
            data = val;
            lt = null;
            rt = null;
        }

    }

    Node root;

    public int BFS(Node root) {

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            // 레벨 별 초기 큐의 크기를 변수에 담는다
            int levelQueueSize = queue.size();
            for (int i = 0; i < levelQueueSize; i++) {
                Node currentNode = queue.poll();
                if(currentNode.lt == null && currentNode.rt == null) return level;
                if(currentNode.lt != null)
                    queue.offer(currentNode.lt);
                if(currentNode.rt != null)
                    queue.offer(currentNode.rt);
            }
            level++;
        }

        return 0;
    }
    public static void main(String[] args) {
        Main_Copy tree = new Main_Copy();

        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);

        System.out.println(tree.BFS(tree.root));
    }

}
