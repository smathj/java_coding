package chapter.lecture.패스트캠퍼스.part1.ch1_2_3_string_array.m01;

import java.util.Scanner;

/*

WrongAnswer

wRONGaNSWER

 */
public class Main_T2 {


    public static void solve(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            // 대문자인 경우
            if ('A' <= charArray[i] && charArray[i] <= 'Z') {
                charArray[i] = (char) ('a' + (charArray[i] - 'A'));
            // 소문자인 경우
            } else {
                charArray[i] = (char) ('A' + (charArray[i] - 'a'));
            }
        }
        System.out.println(charArray);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        solve(input);

    }

}
