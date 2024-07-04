package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * DFS 깊이 우선 탐색
 */
public class Main_T {

    static int n, m, anser = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {

        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v); // 1
        while (!queue.isEmpty()) {
            // 현재 정점
            int cv = queue.poll();

            // 현재 정점이 갈수있는 정점 리스트를 꺼내서 하나씩 반복문을 돌린다
            ArrayList<Integer> moveList = graph.get(cv);
            for (int nv : moveList) {
                // 아직 안갓으면 가자
                if (ch[nv] == 0) {
                    // 갓음으로 체크
                    ch[nv] = 1;

                    // 갓으니 큐에 담아서 반복을 할 수 있게 한다
                    queue.offer(nv);

                    // 현재 nv 까지의 최단거리를 이전 정점 거리에서 1을 더한다 (한칸 이동이니)
                    dis[nv] = dis[cv] + 1;
                }
            }

        }
    }


    public static void main(String[] args) {
        Main_T T = new Main_T();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();

        // 정점수 마다 ArrayList 생성, 1번부터 쓸꺼임
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n + 1];
        dis = new int[n + 1];

        // 그래프에 채우기 각 정점별 간선 정보
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        // 1번 정점 부터 시작
        T.BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i+" : "+dis[i]);
        }



    }
}
