package com.coding.study.lecture.패스트캠퍼스.part1.ch7_binary_search.m03;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 강의 코드
 */
public class Main_T3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

//        int ansAbs = Integer.MAX_VALUE;
        int ansAbs = 2000000001;
        int ans1 = 0;
        int ans2 = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            Integer[] pairValues = {set.floor(-x), set.ceiling(-x)};
            for (Integer pairValue : pairValues) {
                if (pairValue == null) continue;
                int sumAbs = Math.abs(x + pairValue);
                if (ansAbs > sumAbs) {
                    ansAbs = sumAbs;
                    ans1 = x;
                    ans2 = pairValue;
                }
            }
            set.add(x);
        }
        System.out.println(Math.min(ans1, ans2) + " " + Math.max(ans1, ans2));
    }

}
