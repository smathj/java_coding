package chapter.fastcampus.part1.ch6_prefixsum.m01;

import java.util.Scanner;

public class Main_T {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] acc = new int[N + 1];

        int ans = 0;

        while (M-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            ans ^= acc[j] ^ acc[i - 1];
        }

        System.out.println(ans);
    }
}
