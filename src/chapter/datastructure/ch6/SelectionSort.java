package chapter.datastructure.ch6;

import java.util.Scanner;

public class SelectionSort {


    private static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i;    // 아직 정렬되지않은 부분에서 가장 작은 요소의 인덱스를 저장
            // 즉 처음값을 초기값으로 초기화함

            for (int j = i+1; j < n; j++) {
                // 현재 최소값이라 선언한 min 인덱스 보다 더 작은 값을 갖는 인덱스 j가 있다면
                // 그 j 인덱스를 min 인덱스로 저장한다
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);  // i와 min 인덱스를 바꾼다
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("선택 정렬");
        System.out.print("요소수: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];

        // 배열의 값을 입력받음
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = stdIn.nextInt();
        }

        // 1, 배열, 2, 총갯수
        selectionSort(arr, n);      // 배열 x 를 버블정렬

        System.out.println("오름차순으로 정렬했습니다");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]: = " + arr[i]);
        }
    }
}
