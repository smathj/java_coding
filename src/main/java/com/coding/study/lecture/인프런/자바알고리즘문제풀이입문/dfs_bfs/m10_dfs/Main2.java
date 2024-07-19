package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m10_dfs;

import java.util.Scanner;


public class Main2 {

    public static int[][] map = new int[8][8];
    public static int[][] history = new int[8][8];

    public static int count = 0;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};


    public static void DFS(int x, int y) {

        if (x == 7 && y == 7) {
            count++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    DFS(nx, ny);
                    map[nx][ny] = 0;
                }
            }


        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
               map[i][j]  = sc.nextInt();
            }
        }

        map[1][1] = 1;
        DFS(1,1);


        System.out.println(count);
    }
}
