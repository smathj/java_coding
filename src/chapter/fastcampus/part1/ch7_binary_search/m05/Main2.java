package chapter.fastcampus.part1.ch7_binary_search.m05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Scanner sc = new Scanner(System.in);

        // 나무의 수
        int N = sc.nextInt();

        // 나무 길이
        int M = sc.nextInt();

        int[] arr = new int[N];

        // M 씩 뺄셈
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }
        Arrays.sort(arr);

        // 누적합 셋팅
//        for (int i = 1; i < N; i++) {
//            int value = arr[i];
//            arr[i] = arr[i - 1] + value;
//        }

        // System.out.println("N = " + N);
        // System.out.println("M = " + M);
        // System.out.println("누적합 = " + Arrays.toString(arr));
        // System.out.println();
        // System.out.println();
        int count = 0;

        // 무식하게 h 은 M 부터 시작하자
        int h = M;

        // h 높이로 나무 자르기
        while (true) {
            // System.out.println("h = " + h);
            int[] clone = arr.clone();

            // h 만큼 빼기
            for (int i = 0; i < clone.length; i++) {
                clone[i] = Math.max(clone[i] - h, 0);
            }
            // System.out.println("[1] clone = " + Arrays.toString(clone));

            // 누적합 배열 생성
            for (int i = 1; i < clone.length; i++) {
                int value = clone[i] + clone[i - 1];
                clone[i] = value;
            }

            // System.out.println("[2] clone = " + Arrays.toString(clone));

            // 부분합 배열의 마지막 원소가 항상 제일 최댓값이니
            // 이게 M 보다 큰지만 본다
            boolean flag = clone[clone.length - 1] >= M;

            if (flag) {
                h++;
            } else {
                h--;
                break;
            }

            // System.out.println();
        }
         System.out.println(h);

    }


}
