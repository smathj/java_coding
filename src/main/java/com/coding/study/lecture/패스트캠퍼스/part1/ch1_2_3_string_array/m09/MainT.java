package com.coding.study.lecture.패스트캠퍼스.part1.ch1_2_3_string_array.m09;

import java.io.*;

public class MainT {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            cnt[n]++;
        }

        for (int i = 1; i <= 10000; i++)
            while(cnt[i]-- > 0) {
                bw.write(i + "\n");
            }
        bw.flush();
    }
}
