package chapter.my.sort;

import java.util.Arrays;

/**
 * 선택 정렬
 * 시간 복잡도 O(n^2)
 */
public class SelectSort {

    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                // 나보다 큰놈 찾아서 인덱스 저장
                if (arr[j] < arr[minIndex]) {
                    // 그렇다면 오히려 작은 인덱스는 j 이다
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex]; // j
            arr[minIndex] = temp;


        }

        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {


        int[] arr = {3, 4, 1, 2};
        System.out.println(Arrays.toString(arr));

        selectSort(arr);



    }
}
