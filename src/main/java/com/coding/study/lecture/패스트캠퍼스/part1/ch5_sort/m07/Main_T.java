package com.coding.study.lecture.패스트캠퍼스.part1.ch5_sort.m07;

import java.util.Arrays;
import java.util.Scanner;

class Meeting {
    int start;
    int end;
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++)
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());

        Arrays.sort(meetings, (o1, o2) -> {
            if (o1.end == o2.end)
                return o1.start - o2.start;
            return o1.end - o2.end;
        });

        int cnt = 0, ended = 0;
        for (int i = 0; i < N; i++)
            if (ended <= meetings[i].start) {
                cnt++;
                ended = meetings[i].end;
            }
        System.out.println(cnt);
    }
}
