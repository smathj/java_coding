package com.coding.study.lecture.패스트캠퍼스.part1.ch1_2_3_string_array.m10;

import java.util.Scanner;


/*

9
5 12 7 10 9 1 2 3 11
13

3
 */
public class MainT2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int X = sc.nextInt();


        // N+1 = 100001
        int[] cnt = new int[100001];

        for (int i = 0; i < N; i++) {
            cnt[a[i]]++;
        }

        long ans = 0;
        // 짝수나 홀수일때
        // 짝수이면 X / 2 이지만 i와 j가 같은 경우를 문제에서 제외했다
        // 따라서 (X - 1) / 2 로 써도 문제 없다
        // 홀수이면 (X - 1) / 2
        for (int i = 1; i <= (X - 1) / 2; i++)
            /*
            X - i 자체가 aj 이다
             */
            if (X - i <= 1000000)
                ans += (long)cnt[i] * cnt[X - i];
        System.out.println(ans);

    }
}
