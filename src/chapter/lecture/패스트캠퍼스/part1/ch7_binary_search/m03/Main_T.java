package chapter.lecture.패스트캠퍼스.part1.ch7_binary_search.m03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이해가 안됨 깃코드
 * 뺄셈으로 풀이
 *  | A+B | = | -A-B | 성질 이용
 */
public class Main_T {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ansAbs = Math.abs(arr[0] + arr[1]);
        int ans1 = arr[0];
        int ans2 = arr[1];
        for (int i = 0; i < N - 1; i++) {
            //! 마지막 인자에 음수 주의
            int pairValue = findNearestValue(arr, i + 1, N - 1, -arr[i]);
            int sumAbs = Math.abs(arr[i] + pairValue);
            if (ansAbs > sumAbs) {
                ansAbs = sumAbs;
                ans1 = arr[i];
                ans2 = pairValue;
            }
        }
        System.out.println(ans1 + " " + ans2);
    }

    private static int findNearestValue(int[] arr, int fromIndex, int toIndex, int findValue) {

        int nearestValue = arr[fromIndex];


        int nearestDiff = Math.abs(findValue - nearestValue);
        // 이것도 정답가능
//        int nearestDiff = Integer.MAX_VALUE;

        // l 을 현재 왼쪽인덱스 다음을 가르켜서 나머지 구간에 대해 이분검색을 진행한다
        int l = fromIndex + 1;
        int r = toIndex;

        while (l <= r) {
            // 중앙값
            int m = (l + r) / 2;

            /**
             * findValue 은 음수가 곱해져있음
             */
            int diff = Math.abs(findValue - arr[m]);

            if (diff < nearestDiff) {
                nearestValue = arr[m];
                nearestDiff = diff;
            }
            if(arr[m] < findValue) l = m + 1;
            else if(arr[m] > findValue) r = m - 1;
            else return findValue;
        }
        return nearestValue;
    }

}
