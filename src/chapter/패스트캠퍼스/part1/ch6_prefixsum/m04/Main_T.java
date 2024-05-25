package chapter.패스트캠퍼스.part1.ch6_prefixsum.m04;

import java.util.Scanner;

public class Main_T {


    /**
     * 누적합 배열 생성 메서드
     * 나는 "드래그 누적 배열" 이라고함
     */
    static int[][] getPrefixSum(char[][] map) {
        int N = map.length - 1;
        int M = map[0].length - 1;

        // 누적합 배열 생성
        int[][] acc = new int[N + 1][M + 1];

        // 누적합 로직
        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= M; j++) {
                int alive = (map[i][j] == '*' ? 1 : 0);
                // 누적 연산식
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + alive;  //! 구간 합 구하기 5 아이디어
            }
        return acc;
    }

    /**
     * 누적합 배열로 특정 부분의 누적합을 연산할때 사용하는 메서드
     * 누적합 배열(드래그 누적 배열)로 특정 (r1,c1) -> (r2,c2)의 영역의 누적합 구함
     *
     */
    static int getRangeSum(int[][] acc, int r, int c, int K) {
        int r1 = Math.max(r - K, 1);                    // 행의 최소 인덱스는 1 이다
        int c1 = Math.max(c - K, 1);                    // 열의 최소 인덱스는 1 이다
        int r2 = Math.min(r + K, acc.length - 1);       // 행의 최대 인덱스는 acc.length - 1 이다
        int c2 = Math.min(c + K, acc[0].length - 1);    // 열의 최대 인덱스는 acc[0].length - 1 이다
        // 누적합 배열을 이용한 특정범위 누적합 구하는 식
        return acc[r2][c2] - acc[r1 - 1][c2] - acc[r2][c1 - 1] + acc[r1 - 1][c1 - 1];   //! 구간 합 구하기 5 아이디어
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        char[][] map = new char[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String rowMap = sc.next();
            for (int j = 1; j <= M; j++)
                map[i][j] = rowMap.charAt(j - 1);
        }

        while (T-- > 0) {
            // 각 시간마다 새롭게 누적합 배열 생성
            int[][] acc = getPrefixSum(map);

            //
            for (int i = 1; i <= N; i++)

                //
                for (int j = 1; j <= M; j++) {
                    // 부분합 연산
                    int nearAlive = getRangeSum(acc, i, j, K);
                    if (map[i][j] == '*') {
                        nearAlive--;
                        if (nearAlive < A || B < nearAlive)
                            map[i][j] = '.';
                    }
                    else if (A < nearAlive && nearAlive <= B)
                        map[i][j] = '*';
                }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }
}
