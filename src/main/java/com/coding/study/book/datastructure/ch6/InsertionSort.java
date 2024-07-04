package chapter.book.datastructure.ch6;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr, int n) {
        // ! 반복문
        for (int i = 1; i < n; i++) {   // 두번쨰 요소부터 하면된다

            int j;
            int tmp = arr[i];   // 정렬할 값을 tmp 변수에 저장해둔다

            // ! 반복문
            // j > 0 : 인덱스는 0 이상
            // arr[j - 1] > tmp : j가 1씩 감소하며 루프를 돌탠데, 정렬할 값 tmp보다 큰 값만 취급함 (오름차순)
            for (j = i; j > 0 && arr[j - 1] > tmp; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = tmp;


        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("삽입 정렬");
        System.out.print("요소수: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];

        // 배열의 값을 입력받음
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = stdIn.nextInt();
        }

        // 1, 배열, 2, 총갯수
        insertionSort(arr, n);      // 배열 x 를 정렬

        System.out.println("오름차순으로 정렬했습니다");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]: = " + arr[i]);
        }
    }
}
