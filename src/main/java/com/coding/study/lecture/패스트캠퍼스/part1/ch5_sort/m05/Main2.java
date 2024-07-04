package com.coding.study.lecture.패스트캠퍼스.part1.ch5_sort.m05;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] positionArr = br.readLine().split(" ");

        //! TreeSet
        TreeSet<Integer> set = new TreeSet<>();


        for (String position : positionArr) {
            set.add(Integer.parseInt(position));
        }


        Map<String, Integer> map = new HashMap<>();


        int i = 0;
        for (Integer value : set) {
            map.put(String.valueOf(value), i);
            i++;
        }

        for (String s : positionArr) {
            bw.write(map.get(s) + " ");
        }

        bw.flush();

        bw.close();
        br.close();



    }
}
