package chapter.fastcampus.part1.ch6_prefixsum.m03;

import java.io.*;
import java.util.Scanner;

public class Main {

    static int[] arr = null;

    public static void main(String[] args) throws IOException {


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            fnMethod(a, b, k);

        }

        for (int i = 1; i <= N; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();


    }

    private static void fnMethod(int a, int b, int k) {

        int temp = a;
        while (temp <= b) {
            arr[temp] += k;
            temp++;
        }


    }


}
