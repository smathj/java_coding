package chapter.fastcampus.part1.string.m06;

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
        int W = sc.nextInt();
        int H = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int T = sc.nextInt();

        int p = (P + T) % (2 * W);
        int q = (Q + T) % (2 * H);
        if (p > W) p = 2 * W - p;
        if (q > H) q = 2 * H - q;
        System.out.println(p + " " + q);
    }

}
