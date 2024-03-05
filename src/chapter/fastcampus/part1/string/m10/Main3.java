package chapter.fastcampus.part1.string.m10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
! 시간초과

9
5 12 7 10 9 1 2 3 11
13

3
 */
public class Main3 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] inputArr = new int[N];
        int[] countArr = new int[100001];

        for (int i = 0; i < N; i++) {
            int nextInt = sc.nextInt();
            countArr[nextInt]++;
        }

        int X = sc.nextInt();

        System.out.println("N = " + N);
        System.out.println("X = " + X);
        System.out.println(Arrays.toString(countArr));


    }
}
