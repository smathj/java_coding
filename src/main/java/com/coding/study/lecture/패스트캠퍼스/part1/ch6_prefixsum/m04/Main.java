package com.coding.study.lecture.패스트캠퍼스.part1.ch6_prefixsum.m04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 공간 규격
        // 가로
        int N = sc.nextInt();
        // 세로
        int M = sc.nextInt();

        // 시간
        int T = sc.nextInt();

        // 길이 k
        int K = sc.nextInt();

        // 상수값 a,b
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 2차원
        char[][] map = new char[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            // 한줄임 .*.... 이런식
            String rowMap = sc.next();
            for (int j = 1; j <= M; j++) {
                map[i][j] = rowMap.charAt(j - 1);
            }
        }

        while (T-- > 0) {

            // 각 시간 마다 누적합 배열 생성한다
            int[][] acc = getPrefixSum(map);

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {

                    // 부분합 연산
                    int nearAlive = getRangeSum(acc, i, j, K);
                    // 생성
                    if (map[i][j] == '*') {
                        nearAlive--;
                        // 삭제
                        if (nearAlive < A || B < nearAlive) {
                            map[i][j] = '.';
                        }
                    } else if (A < nearAlive && nearAlive <= B) {
                        map[i][j] = '*';
                    }

                }
            }


        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }


    }

    /**
     * 이차원 배열 파라미터을 가지고
     * [부분합을 나타내는] 이차원 배열을 생성한다
     */
    public static int[][] getPrefixSum(char[][] map) {

        // 부분합 배열
        // 같은 행과 열의 규격을 갖는 이차원 배열 생성한다
        int[][] acc = new int[map.length][map[0].length];

        // 누적합 로직
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[0].length ; j++) {
                // 생명이 존재하면 1, 없으면 0
                int alive = (map[i][j] == '*') ? 1 : 0;

                // 드래그 누적 연산식
                //! 구간 합 구하기 5 에서 사용한 연산식 방법
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + alive;
            }
        }


        return acc;
    }


    public static int getRangeSum(int[][] acc, int x, int y, int k) {
        // 두개의 좌표(드래그 누적합 배열 기준)
        int x1 = Math.max(x - k, 1);
        int y1 = Math.max(y - k, 1);

        int x2 = Math.min(x + k, acc.length - 1);
        int y2 = Math.min(y + k, acc[0].length - 1);

        return acc[x2][y2] - acc[x1 - 1][y2] - acc[x2][y1 - 1] + acc[x1 - 1][y1 - 1];


    }

}
