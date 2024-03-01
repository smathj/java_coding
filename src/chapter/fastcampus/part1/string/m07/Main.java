package chapter.fastcampus.part1.string.m07;

import java.lang.reflect.Array;
import java.util.Arrays;
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

        System.out.println();

        System.out.println("행(n) = " + n);
        System.out.println("열(m) = " + m);
        boolean[][] arr = new boolean[m][n];

        System.out.println();
        System.out.println("처음\n" + Arrays.deepToString(arr));
        System.out.println();

        // 행 3
        for (int roopN = 0; roopN < n; roopN++) {
            String next = scanner.next();
            System.out.println("next = " + next);
            // 열 5
            for (int roopM = 0; roopM < m; roopM++) {

            }
            System.out.println();
        }
        System.out.println();

        System.out.println("이후\n" + Arrays.deepToString(arr));



    }

}
