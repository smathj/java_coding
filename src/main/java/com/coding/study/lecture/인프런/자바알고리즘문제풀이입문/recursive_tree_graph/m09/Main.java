package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m09;

public class Main {

    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int val) {
            data = val;
            lt = null;
            rt = null;
//            lt = rt = null;
        }

    }

    Node root;

    public int DFS(int level, Node root) {
        if (root.lt == null && root.rt == null) {
            return level;   // level == 거리}
        } else {
            return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));

        }
    }
    public static void main(String[] args) {
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.DFS(0, tree.root));

    }
}
