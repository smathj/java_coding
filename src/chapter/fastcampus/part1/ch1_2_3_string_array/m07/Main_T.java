package chapter.fastcampus.part1.ch1_2_3_string_array.m07;

import java.util.Scanner;


/*
----------------------------------------------------------------
4 4
....
....
....
....

4
----------------------------------------------------------------

3 5
XX...
.XX..
...XX

0
----------------------------------------------------------------
5 8
....XXXX
........
XX.X.XX.
........
........

3
----------------------------------------------------------------

 */
public class Main_T {


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++)
            map[i] = sc.next().toCharArray();

//        System.out.println(Arrays.deepToString(map));

        boolean[] rowExist = new boolean[N];
        boolean[] colExist = new boolean[M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (map[i][j] == 'X') {
                    rowExist[i] = true;
                    colExist[j] = true;
                }

//        System.out.println(Arrays.toString(rowExist));
//        System.out.println(Arrays.toString(colExist));

        int rowNeedCount = N;
        int colNeedCount = M;
        for (int i = 0; i < N; i++)
            if (rowExist[i]) rowNeedCount--;
        for (int i = 0; i < M; i++)
            if (colExist[i]) colNeedCount--;

        System.out.println(Math.max(rowNeedCount, colNeedCount));
    }

}
