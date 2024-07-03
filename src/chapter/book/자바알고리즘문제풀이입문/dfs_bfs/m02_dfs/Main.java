package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m02_dfs;

import java.util.Scanner;

public class Main {

    static int[] arr;
    static int N, C;
    static int max = 0;

    /**
     * 깊이 우선 탐색
     * @param i 배열 인덱스
     * @param sum 재귀별 총합을 변수로 들고다니자
     * 시간 복잡도 O(n^2)
     */
    public void DFS(int i, int sum) {

        if(sum > C)
            return;

        // i 의 값을 사용, 미사용 이분 재귀
        if (i == N) {
            // 최대값 체크로 끊어주기
            if (sum <= C) {
                max = Math.max(sum, max);
            }
        } else {
            // 사용
            DFS(i + 1, sum + arr[i]);

            // 미사용
            DFS(i + 1, sum);
        }



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 한도 최대값
        C = sc.nextInt();

        // 주어진 마리수
        N = sc.nextInt();

        arr = new int[N];
        // 주어진 마리수에 대한 무게
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Main T = new Main();
        T.DFS(0,0);
        System.out.println(max);

    }
}
