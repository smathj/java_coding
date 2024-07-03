package chapter.book.datastructure.ch6;

import java.util.Scanner;

public class ShellSort {

    // 셀 정렬
    private static void shellSort(int[] arr, int n) {

        // Group 반복문 : 배열의 길이를 2로 계속 나눈다
        // 그륩이 4인거 2인거 1인거를 반복한다
        // * h = 4(그륩)
        for (int h = n / 2; h > 0; h /= 2){

            // ! -----------------------------------------------------------
            // ! 유사 삽입 정렬
            // ! -----------------------------------------------------------
            // * i = 4(그륩)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = arr[i]; // 4


                // * j = 4 - 4
                // j > 0 : 인덱스는 0 이상
                // arr[j] > tmp : arr[j] 값이 왼쪽 값인데, 오른쪽값인 tmp보다 큰것만 반복문을 타야한다
                for (j = i - h; j >= 0 && arr[j] > tmp; j -= h) {
                    arr[j + h] = arr[j];
                }


                arr[j + h] = tmp;
            }
            // ! -----------------------------------------------------------


        }

    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("쉘 정렬");
        System.out.print("요소수: ");
        int n = stdIn.nextInt();
        int[] arr = new int[n];

        // 배열의 값을 입력받음
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = stdIn.nextInt();
        }

        // 1, 배열, 2, 총갯수
        shellSort(arr, n);      // 배열 x 를 정렬

        System.out.println("오름차순으로 정렬했습니다");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]: = " + arr[i]);
        }
    }

}
