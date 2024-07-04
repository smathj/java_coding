package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m01_dfs;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Node {

        int data;
        Node lt;
        Node rt;

        public Node(int val) {
            data = val;
            lt = null;
            rt = null;
        }

    }

    static int n;
    static int sum;
    static int sumRoop;

    static String answer = "NO";

    static int[] checkArr;

    public void DFS(Node root) {


        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            if (answer.equals("YES")) {
                break;
            }

            Node node = queue.poll();
            // 누적합에 증가
            sumRoop += node.data;

            // 이동의 체크
            checkArr[node.data] = 1;

            if ((sum - sumRoop) == sumRoop) {
                answer = "YES";
                break;
            }

            // lt가 존재하고 아직 이동안했다면
            if (node.lt != null && checkArr[node.lt.data] == 0) {
                // 다음 반복
                DFS(node.lt);

            }

            // rt가 존재하고 아직 이동안했다면
            if (node.rt != null && checkArr[node.rt.data] == 0) {
                // 다음 반복
                DFS(node.rt);
            }

            // 이동의 체크
            checkArr[node.data] = 0;
            sumRoop -= node.data;

        }

    }

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
        n = 6;

        checkArr = new int[11];

        Main main = new Main();
        Node root = new Node(1);
        root.lt = new Node(3);
        root.rt = new Node(5);
        root.lt.lt = new Node(6);
        root.lt.rt = new Node(7);
        root.rt.lt = new Node(10);

        sum = 32;




        // DFS 노드별 완벽 탐색 해야한다
        main.DFS(root);
        System.out.println(answer);


    }
}
