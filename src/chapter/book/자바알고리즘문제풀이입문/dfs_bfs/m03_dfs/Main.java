package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m03_dfs;

import java.util.Scanner;

public class Main {

    static int[] scoreArr;
    static int[] timeArr;
    static int N;
    static int M;
    static int totalTime;
    static int totalScore;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        scoreArr = new int[N];
        timeArr = new int[N];

        for (int i = 0; i < N; i++) {
            scoreArr[i] = sc.nextInt();  // 점수
            timeArr[i] = sc.nextInt();  // 시간
        }

        Main T = new Main();
        T.DFS(0, 0,0);
        System.out.println(totalScore);


    }


    public void DFS(int i, int sumScore, int sumTime) {

        if (sumTime > M) {
            return;
        }


        if (i == N) {
            totalScore = Math.max(totalScore, sumScore);

        } else {

            // 현재 문제를 안푼경우
            DFS(i + 1, sumScore, sumTime);

            // 현재 문제를 푼 경우
            DFS(i + 1, sumScore + scoreArr[i], sumTime + timeArr[i]);
        }


    }
}
