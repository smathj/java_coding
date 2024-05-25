package chapter.패스트캠퍼스.part1.ch7_binary_search.m08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 집의 갯수
        int N = sc.nextInt();

        // 공유기 갯수
        int C = sc.nextInt();

        // 집의 좌표 배열
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // NlogN

        System.out.println("N = " + N);
        System.out.println("C = " + C);
        System.out.println(Arrays.toString(arr));




    }
}
