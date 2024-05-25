package chapter.자바알고리즘문제풀이입문.sorting_search.m01;

import java.util.Scanner;


/*

6
13 5 11 7 23 15

5 7 11 13 15 23

 */
public class Main2 {

    // 오름차순

    public void solution(int[] arr) {

//        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length-1; i++) {

            int iValue = arr[i];
            int jValue = arr[i + 1];

            int k = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < jValue) {
                    jValue = arr[j];
                    k = j;
                }
            }
            arr[i] = jValue;
            arr[k] = iValue;
        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(arr);
    }

}