package com.coding.study.lecture.패스트캠퍼스.part1.ch7_binary_search.m04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();

        int N = sc.nextInt();
        int[] cardArr = new int[N];
        for (int i = 0; i < N; i++) {
            cardArr[i] = sc.nextInt();
            map.put(cardArr[i], map.getOrDefault(cardArr[i], 0) + 1);
        }

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int value = sc.nextInt();
            sb.append(map.getOrDefault(value, 0)).append(" ");
        }
        System.out.println(sb.toString());

    }
}
