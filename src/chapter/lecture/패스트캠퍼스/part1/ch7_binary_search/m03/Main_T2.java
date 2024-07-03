package chapter.lecture.패스트캠퍼스.part1.ch7_binary_search.m03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 강의 코드
 * 덧셈으로 풀이
 */
public class Main_T2 {


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
            int pairValue = findNearestValue(arr, i + 1, N - 1, arr[i]);
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

        // optimal 최적의
        int optimalPairValue = arr[fromIndex];

        // 최초 그냥 찾고자하는 값이 바로 뒤에있을때 그때의 절댓값을 구함
        // 값은 원점에서 떨어진 거리와 같다
        int optimalAbs = Math.abs(findValue + optimalPairValue);

        // 이거해도 정답나옴
//        int optimalAbs = Integer.MAX_VALUE;

        int l = fromIndex + 1;
        int r = toIndex;

        while (l <= r) {
            // 중앙값
            int m = (l + r) / 2;

            // 중앙값과 더했을떄 0에 가까울 수록 정답
            int sum = findValue + arr[m];

            // 그 값의 절댓값 ( 원점에서 떨어진 거리 )
            // 이값이 포인트이다 작을수록 0에 가까운수이다 (음수이였건, 양수이였건)
            int sumAbs = Math.abs(sum);

            if (sumAbs < optimalAbs) {
                optimalPairValue = arr[m];      // 정답 후보 갱신
                optimalAbs = sumAbs;            // 갱신
            }

            /**
             * [이분검색]
             * 합이 0 보다 작으면
             * 왼쪽은 더 안봐도된다
             *
             * 합이 0 보다 크면
             * 오른쪽은 더 안봐도된다
             */
            if(sum < 0 ) l = m + 1;
            else if(sum > 0) r = m - 1;
            // 0 이면 그자체가 정답이다
            else return arr[m];
        }
        return optimalPairValue;
    }

}
