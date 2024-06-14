package chapter.자바알고리즘문제풀이입문.dfs_bfs.m05_dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전 교환
 */
/*
3
1 2 5
15
 */
public class Main {

    static int N;
    static int M;
    static Integer[] arr;

//    static int min = Integer.MIN_VALUE;

    /**
     * 깊이 우선 탐색 ( 근데 얼마나 깊은지 지금 모르는데 ? )
     */
    static int minCount = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 동전의 종류 1 ~ 12 개수 (3개)
        N = sc.nextInt();

        // 동전의 종류(1원 , 2원, 5원)
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 거스름돈
        M = sc.nextInt();

        Main mainDFS = new Main();

        Arrays.sort(arr, Collections.reverseOrder());


        for (int i = 0; i < N; i++) {
            mainDFS.DFS(arr[i], 1);
        }


        System.out.println(minCount);

    }

    public void DFS(int sum, int count) {

        // sum이 M 보다 커도 의미없음
        if (sum > M)
            return;

        //! 이미 쌍을 구했으면 더 나은 쌍은 필요 없음 ( >=, == 둘다 됨)
        if(count >= minCount)
            return;

        if (sum == M) {
            minCount = Math.min(count, minCount); // count 가 곧 레벨이기도하네

        } else {

            for (int i = 0; i < N; i++) {
                // 선택 안하는 경우는 없으므로 count 가 level 이 기도 하다
                // 항상 체크한다
                DFS((sum + arr[i]), (count+1));
            }
        }


    }


}
