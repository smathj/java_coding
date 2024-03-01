package chapter.fastcampus.part1.string.m07;

import java.util.Scanner;


/*
-----------------------------------------------
6 4
4 1
8

0 1
-----------------------------------------------
6 4
5 3
4

3 1
 */
public class Main_T {


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++)
            map[i] = sc.next().toCharArray();

        boolean[] rowExist = new boolean[N];
        boolean[] colExist = new boolean[M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (map[i][j] == 'X') {
                    rowExist[i] = true;
                    colExist[j] = true;
                }

        int rowNeedCount = N;
        int colNeedCount = M;
        for (int i = 0; i < N; i++)
            if (rowExist[i]) rowNeedCount--;
        for (int i = 0; i < M; i++)
            if (colExist[i]) colNeedCount--;

        System.out.println(Math.max(rowNeedCount, colNeedCount));
    }

}
