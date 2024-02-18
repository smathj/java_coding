package chapter.sorting_search.m10;

import java.util.Arrays;
import java.util.Scanner;


/**

5 3
1 2 8 4 9

3


 */
public class Main {


    /**
     *
     * @param n 마구간 갯수
     * @param m 말의 수
     * @param arr 말의 x 좌표 배열
     */
    public void solution(int n, int m, int[] arr) {

        // 마구간 좌표 정렬
        Arrays.sort(arr);

//        System.out.println("마구간 = " + n);
//        System.out.println("말 = " + m);
//        System.out.println("말의 위치 = " + Arrays.toString(arr));


        int lt = 1;
        int rt = arr[n - 1];

        // 가장 가까운거리
        int answer = 0;

        while (lt <= rt) {

            // 가장 가까운 마구간의 거리
            int mid = (lt + rt) / 2;

            // 배치한 말이 말의수보다 크거나 같다면
            if (parkingCount(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            // 배치 했떠니, 모자르게 배치된다면 -> rt를 줄인다
            } else {
                rt = mid - 1;
            }


        }

        System.out.println(answer);





    }


    /**
     * 말 배치 리턴 함수
     * @param n 마구간 갯수
     * @param m 말의 수
     * @param arr 말의 x 좌표 배열
     */
    private int parkingCount(int[] arr, int mid) {
        int horseCount = 1;
        int lastHoreseArea = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastHoreseArea >= mid) {
                horseCount++;
                lastHoreseArea = arr[i];
            }
        }

        return horseCount;
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(n, m, arr);
    }

}