package chapter.lecture.패스트캠퍼스.part1.ch7_binary_search.m05;

import java.util.Scanner;

public class Copy {

    public static boolean isPossible(int[] arr, int mid, int M) {
        // 부분합 배열 대신, 반복문으로 직접 다 더할꺼임 따라서 정렬이 필요없음
        // 시간아낌
        long sum = 0;
        for (int h : arr) {
            if(h > mid) sum += h - mid;
        }
        return sum >= M;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        // 이분검색

        // 한 그루당 높이 최솟값
        int lt = 0;

        // 한 그루당 높이 최댓값
        int rt = 1000000000;

        int ans = -1;

        while (lt <= rt) {
            // 이 자체가 중간 나무 길이 값 따라서 arr[mid] 안쓰는거네
            int mid = (lt + rt) / 2;
            if (isPossible(arr, mid, M)) {
                ans = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(ans);

    }
}
