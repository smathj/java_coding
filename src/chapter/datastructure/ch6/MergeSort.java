package chapter.datastructure.ch6;

import java.util.Arrays;

/**
 * 병합정렬
 * 시간 복잡도 nlogn
 */
public class MergeSort {

    static int[] buff;  // 작업용 배열

    static void __mergeSort(int[] a, int left, int right) {
        // 왼 < 오 전제
        if (left < right) {


            int center = (left + right) / 2;    // 모듈러로 중간값을 구한다

            int i;          // a 배열 용도
            int k = left;   // a 배열 용도

            int p = 0;      // buff 배열 용도
            int j = 0;      // buff 배열 용도

            // 재귀
            __mergeSort(a, left, center);           // 배열의 앞 부분 병합정렬

            // 재귀
            __mergeSort(a, center+1, right);    // 배열의 뒷 부분 병합정렬

            // a 배열 왼쪽 buff에 채우기
            for (i = left; i <= center; i++) {
                buff[p++] = a[i];   // center 다음값을 알기위해서 변수 p를 사용함
            }


            // i <= right : 오른쪽 배열 구간                        <-- a 배열용
            // j < p      : 왼쪽 배열 구간(0 부터 center 까지 구간)   <-- buff 배열용
            while (i <= right && j < p) {
                // a[left] 부터 채운다
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }

            // 왼쪽 배열 구간을 끝가지 안갓으면
            // 마저 채워준다
            while (j < p) {
                a[k++] = buff[j++];
            }


        }
    }

    static void mergeSort(int[] a, int n) {

        // 작업용 배열을 생성
        buff = new int[n];

        // 배열 전체를 병합 정렬
        __mergeSort(a, 0, n - 1);

        // 작업용 배열을 해제
        buff = null;

    }

    public static void main(String[] args) {

        System.out.println("병합 정렬");

        int[] x = {6, 4, 3, 7, 1, 9, 8};

        System.out.println(Arrays.toString(x));
        System.out.println("오름 차순으로 정렬합니다");

        mergeSort(x, x.length);

        System.out.println(Arrays.toString(x));
    }


}
