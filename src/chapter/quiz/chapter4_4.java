package chapter.quiz;

import java.util.Scanner;

/**
 * 피보나치 수열
 */
public class chapter4_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("입력: ");

        int num = sc.nextInt();
        System.out.printf("피보나치 수열: ");

        for (int i = 0; i < num; i++) {
            System.out.printf(fibonacci(i)+ " ");
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // an = an-1 + an-2
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
