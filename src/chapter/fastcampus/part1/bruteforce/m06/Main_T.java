package chapter.fastcampus.part1.bruteforce.m06;


import java.util.Scanner;

/**
 * 강사는 쉽게 풀었네 ;;
 */

public class Main_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = ((N - 1) % H) + 1;  // [1, H]
            int number = (N - 1) / H + 1; // [1, W]
            System.out.printf("%d%02d\n", floor, number);
        }
    }

}
