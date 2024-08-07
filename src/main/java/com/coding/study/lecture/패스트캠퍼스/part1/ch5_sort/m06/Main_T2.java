package com.coding.study.lecture.패스트캠퍼스.part1.ch5_sort.m06;

import java.util.*;

public class Main_T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        Map<Integer, Integer> messages = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            int message = sc.nextInt();
            messages.put(message, messages.getOrDefault(message, 0) + 1);
        }

        Integer[] frequencies = messages.keySet().toArray(new Integer[messages.size()]);
        Arrays.sort(frequencies, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return messages.get(o2) - messages.get(o1);
            }
        });

        for (int frequency : frequencies) {
            int count = messages.get(frequency);
            while (count-- > 0)
                System.out.print(frequency + " ");
        }
        System.out.println();
    }
}
