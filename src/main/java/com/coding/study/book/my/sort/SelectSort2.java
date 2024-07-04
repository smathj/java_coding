package chapter.book.my.sort;

import java.util.Arrays;

/**
 * 선택 정렬
 * 시간 복잡도 O(n^2)
 */
public class SelectSort2 {

    public static void selectSort(int[] arr) {

        int i = 0;
        int j = 0;

        // 마지막에 남은 1개는 자동정렬된 샘이다
        // "arr.length" 로 해도 영향도는 미미하다
        for (i = 0; i < arr.length-1; i++) {

            int minIndex = i;
            int minIndexValue = arr[i];

            for (j = i + 1; j < arr.length; j++) {
                // i 값 또는 minIndex 인덱스의 값보다 작은 j를 찾아서
                // minIndex에 저장한다
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                    minIndexValue = arr[j];
                    System.out.println("==> 변경!");
                }

                System.out.println("현재 minIndex = " + minIndex + ", minIndexValue = " + minIndexValue);

            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println();
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {


        int[] arr = {3, 4, 1, 2};
        System.out.println(Arrays.toString(arr));

        selectSort(arr);


    }
}
