package chapter.my.sort;

import java.util.Arrays;

/**
 * 삽입 정렬
 * 시간 복잡도 O(n^2)
 * 특징 뒤에서 앞으로
 */
public class InsertSort {

    public static void insertSort(int[] arr) {

        // 첫번째는 이미 처음/마지막 요소이니 다음부터
        // * 정렬된 영역
        for (int i = 1; i < arr.length; i++) {

            int insertingData = arr[i];
            int k = 0;

            // ! 정렬되지 않은 영역
            for (k = i - 1; k >= 0; k--) {
                if (arr[k] > insertingData) {
                    arr[k + 1] = arr[k];
                } else {
                    break;
                }

            }
            // break 당한 인덱스 다음 위치
            arr[k + 1] = insertingData;
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {


        int[] arr = {3, 4, 1, 2};
        System.out.println(Arrays.toString(arr));

        insertSort(arr);


    }
}
