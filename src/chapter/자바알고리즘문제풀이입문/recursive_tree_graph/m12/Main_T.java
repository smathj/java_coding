package chapter.자바알고리즘문제풀이입문.recursive_tree_graph.m12;

import java.util.Scanner;

/**
 * BFS
 *
 * ▣ 입력예제 1
 5 9
 1 2
 1 3
 1 4
 2 1
 2 3
 2 5
 3 4
 4 2
 4 5
 *
 * ▣ 출력예제 1
 * 6
 */
public class Main_T {

    static int n,m, answer = 0;
    static int[][] graph;   // 행렬
    static int[] ch;    // 체크 배열


    public void DFS(int v) {

        if(v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                /**
                 * 여기가 중요함
                 * "v -> i" 로 이동하는데
                 * 그 "i" 는 현재 가본적 없는 정점이어야 한다
                 */
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;  // 이동 했으니 체크
                    DFS(i);     // 다시 재귀 뻗어나간다
                    ch[i] = 0;  // 이동이 끝났으니 체크 해제
                }
            }
        }


    }

    public static void main(String[] args) {

        Main_T T = new Main_T();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        // 간선의 수 만큼 행렬에 넣어주기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        // 현재 1번 정점 체크
        ch[1] = 1;

        // 1번 정점 기준 백트래킹
        T.DFS(1);
        System.out.println(answer);


    }

}
