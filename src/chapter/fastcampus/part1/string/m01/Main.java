package chapter.fastcampus.part1.string.m01;

import java.util.Scanner;

/*

WrongAnswer

wRONGaNSWER

 */
public class Main {


    public static void solve(String input) {


        String[] arr = input.split("");
        String result = "";
        for (String s : arr) {

            // 대문자인 경우
            if (s.equals(s.toUpperCase())) {
                result += s.toLowerCase();
            // 소문자인 경우
            } else {
                result += s.toUpperCase();
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
