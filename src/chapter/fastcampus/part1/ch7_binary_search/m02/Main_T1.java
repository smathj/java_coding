package chapter.fastcampus.part1.ch7_binary_search.m02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_T1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> sums = new HashSet<>();

        // A + B + C = X
        // A + B = X - C 로 바꾸어서 풀자

        // 1. A + B
        for (int i = 0; i < N; i++) {
            // A + B
            // B + A 가 여러번 반복문 타지 않게하기 위함, 덧셈의 특징
            for (int j = i; j < N; j++) {
                sums.add(arr[i] + arr[j]);
            }
        }

        int ans = -1;
        // 2. X - C
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int target = arr[i] - arr[j];
                if (sums.contains(target)) {
                    ans = Math.max(ans, arr[i]);
                }
            }
        }

        System.out.println(ans);



    }
}
