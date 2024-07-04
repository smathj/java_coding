package com.coding.study.lecture.패스트캠퍼스.part1.ch1_2_3_string_array.m04;

import java.util.Scanner;


/*
! 맞춤
-----------------------------------------------
ababababa
aba

2
-----------------------------------------------
a a a a a
a a

2
-----------------------------------------------
ababababa
ababa

1
-----------------------------------------------
aaaaaaa
aa

3
-----------------------------------------------

 */
public class Main2 {


    public static void solve(String param, String search) {

        System.out.println("param = " + param);
        System.out.println("search = " + search);
        int count = 0;



        int lt = 0;
        int rt = lt + search.length();
        System.out.println(param.length());
        while (rt <= param.length()) {
            System.out.println("lt = " + lt);
            System.out.println("rt = " + rt);
            String substring = param.substring(lt, rt);
            System.out.println("substring = " + substring);
            // 같을때
            if (search.equals(substring)) {
                System.out.println("일치");
                lt = rt;
                rt = lt + search.length();
                count++;
            // 다를때
            } else {
                System.out.println("불일치");
                lt++;
                rt++;
            }
            System.out.println();
            System.out.println();
        }

        System.out.println(count);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String param1 = scanner.nextLine();
        String search = scanner.nextLine();
        solve(param1, search);

    }

}
