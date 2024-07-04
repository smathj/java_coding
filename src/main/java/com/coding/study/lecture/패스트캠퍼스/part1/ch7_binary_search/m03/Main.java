package com.coding.study.lecture.패스트캠퍼스.part1.ch7_binary_search.m03;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(arr);

        System.out.println("N = " + N);
        System.out.println(Arrays.toString(arr));

        int lt = 0;
        int rt = arr.length - 1;

        int min = Integer.MAX_VALUE;
        Integer[] asd = new Integer[2];
        while (lt <= rt) {
            int sum = arr[lt] + arr[rt];
//            min = Math.min(min, sum);
            min = Math.min(min, Math.abs(sum));
            System.out.println("sum = " + sum);
            asd[0] = arr[lt];
            asd[1] = arr[rt];
            lt++;
            rt--;
        }

        System.out.println("min = " + min);
        System.out.println(Arrays.toString(asd));



    }
}
