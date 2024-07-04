package com.coding.study.lecture.패스트캠퍼스.part1.ch1_2_3_string_array.m01;

import java.util.Scanner;

/*

WrongAnswer

wRONGaNSWER

 */
public class Main_T {


    public static void solve(String input) {

        String result = "";

        char[] charArray = input.toCharArray();
        for (char c : charArray) {

            // 대문자인 경우
            if ('A' <= c && c <= 'Z') {

                char c1 = (char) ('a' + c - 'A');
                result += c1;
                // 소문자인 경우
            } else {
                char c1 = (char) ('A' + c - 'a');
                result += c1;
            }


        }


        System.out.println(result);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        solve(input);

    }

}
