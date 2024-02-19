package chapter.inflearn.sorting_search.m03;

import java.util.Arrays;
import java.util.Scanner;


/*

6
11 7 5 6 10 9


5 6 7 9 10 11



 */
public class Main {

    // 오름차순

    public void solution(int[] arr) {

//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(arr);
    }

}