package com.coding.study.lecture.패스트캠퍼스.part1.ch5_sort.m02;

import java.util.Arrays;
import java.util.Scanner;

public class Main_T2 {
    public static class Member implements Comparable<Member> {
        int age;
        String name;
        int idx;

        public Member(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

        @Override
        public int compareTo(Member o) {
            if (this.age != o.age)
                return this.age - o.age;
            return this.idx - o.idx;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Member[] members = new Member[N];
        for (int i = 0; i < N; i++)
            members[i] = new Member(sc.nextInt(), sc.next(), i);

        Arrays.sort(members);

        for (Member member : members)
            System.out.println(member.age + " " + member.name);
    }

}
