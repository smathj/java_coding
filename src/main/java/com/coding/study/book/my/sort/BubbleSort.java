package chapter.book.my.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 버블 정렬
 * 시간 복잡도 O(n^2)
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        // 전체 원소갯수만큼 돌기위하여 반복문을 실행한다
        // 자리 교체 횟수는 "배열의 길이 - 1" 만큼이다
        for (int i = 0; i < arr.length; i++) {

            // 각 원소를 탐색한다 이때 "arr.length - i - 1" 에 의미를 잘 생각하자
            // "[][]" 를 밀고 간다
            for (int k = 0; k < arr.length - i - 1; k++) {

                if (arr[k] > arr[k+1]) {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k + 1] = temp;
                }


            }


        }

        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

        int[] arr = {7, 5, 4, 3, 6, 1, 8, 9, 10, 7};
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);



    }
}
