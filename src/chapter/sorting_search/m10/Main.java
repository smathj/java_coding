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

        System.out.println("마구간 = " + n);
        System.out.println("말 = " + m);
        System.out.println("말의 위치 = " + Arrays.toString(arr));







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