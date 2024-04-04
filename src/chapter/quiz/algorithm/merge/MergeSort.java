package chapter.quiz.algorithm.merge;

import java.util.Arrays;

public class MergeSort {

    private void mergeSort(int arr[], int start, int div, int end) {

        int[] temp = new int[arr.length];

        int s = start;      // 왼쪽 시작 인덱스
        int r = div + 1;    // 오른쪽 시작 인덱스
        int k = start;      // 배열에 복사할 위치 인덱스

        // 왼 && 오
        while (s <= div && r <= end) {
            if (arr[s] <= arr[r]) {
                temp[k++] = arr[s++];
            } else {
                temp[k++] = arr[r++];
            }
        }

        // 앞쪽
        while (s <= div) {
            temp[k++] = arr[s++];
        }

        // 뒤쪽
        while (r <= end) {
            temp[k++] = arr[r++];
        }


        // end - start = start와 end 길이 만큼을 원본 배열에 다시 덮어 씌워준다
        for (int h = 0; h <= end-start; h++) {
            arr[start + h] = temp[start + h];
        }
    }

    public void merge(int arr[], int left, int right) {
        // 하나가 남을 때까지
        if (left < right) {
            int div = (left + right) / 2;   // 센터

            // 왼쪽을 다시 나눈다
            merge(arr, left, div);

            // 오른쪽을 다시 나눈다
            merge(arr, div+1, right);

            // 정렬한다
            mergeSort(arr, left, div, right);

        } else {
            System.out.println("left = " + left);
            System.out.println("right = " + right);
            System.out.println();
        }
    }

}
