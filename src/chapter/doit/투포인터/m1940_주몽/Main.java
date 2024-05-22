package chapter.doit.투포인터.m1940_주몽;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 투 포인터는 정렬이 필수
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        while (i < j) {

            int lv = arr[i];
            int rv = arr[j];

            if (lv + rv > M) {
                j--;
            } else if (lv + rv < M) {
                i++;
            } else {
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);




    }
}
