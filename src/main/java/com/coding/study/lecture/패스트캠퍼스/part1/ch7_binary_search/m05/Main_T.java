package com.coding.study.lecture.패스트캠퍼스.part1.ch7_binary_search.m05;

import java.util.Scanner;


/**
 * ! Parametric Search
 * ~~ 일때 최대 or 최소
 */
public class Main_T {

    static boolean isPossible(int[] heights, int cutHeight, int thresholdHeight) {
        long sum = 0;
        for (int h : heights)
            if (h > cutHeight) sum += h - cutHeight;
        return sum >= thresholdHeight;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] h = new int[N];

        for (int i = 0; i < N; i++)
            h[i] = sc.nextInt();

        int l = 0, r = 1000000000, ans = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (isPossible(h, m, M)) {
                ans = m;
                l = m + 1;
            }
            else r = m - 1;
        }
        System.out.println(ans);
    }

}
