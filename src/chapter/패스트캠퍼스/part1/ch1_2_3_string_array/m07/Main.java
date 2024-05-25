package chapter.패스트캠퍼스.part1.ch1_2_3_string_array.m07;

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
public class Main {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 행
        int m = scanner.nextInt();  // 열

        char[][] charArr = new char[n][m];
        for (int i = 0; i < n; i++) {
            charArr[i] = scanner.next().toCharArray();
        }

//        System.out.println(Arrays.deepToString(charArr));

        // 행의 갯수 길이를 가진 배열
        boolean[] rowExistArr = new boolean[n];
        // 열의 갯수 길이를 가진 배열
        boolean[] colExistArr = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (charArr[i][j] == 'X') {
                    rowExistArr[i] = true;
                    colExistArr[j] = true;
                }
            }
        }

        // 기본 사이즈로 두고 가감한다
        int needRowCount = n;
        int needColCount = m;


        for (int i = 0; i < n; i++) {
            if(rowExistArr[i]) needRowCount--;
        }
        for (int j = 0; j < m; j++) {
            if(colExistArr[j]) needColCount--;
        }

        System.out.println(Math.max(needRowCount, needColCount));

    }

}
