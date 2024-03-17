package chapter.datastructure.ch6;

import java.util.Scanner;

public class BubbleSort3 {



    private static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }


    private static void bubbleSort(int[] arr, int n) {
        int k = 0;              // arr[k] 보다 앞쪽을 정렬을 마친 상태
        while (k < n-1) {
            int last = n - 1;   // 마지막으로 요소를 교환한 위치
            // 패스
            for (int j = n-1; j > k; j--) {
                // 앞에 값이 더크면 뒤로 보내야함 (왼 > 오)
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }

    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전3)");
        System.out.print("요소수: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];

        // 배열의 값을 입력받음
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = stdIn.nextInt();
        }

        // 1, 배열, 2, 총갯수
        bubbleSort(arr, n);      // 배열 x 를 버블정렬

        System.out.println("오름차순으로 정렬했습니다");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]: = " + arr[i]);
        }
    }

}
