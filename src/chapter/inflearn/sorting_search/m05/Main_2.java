package chapter.inflearn.sorting_search.m05;

import java.util.Arrays;
import java.util.Scanner;


/*

8
20 25 52 30 39 33 43 33

D

 */
public class Main_2 {

    // ! On^2 -> On^1

    public void solution(int size, int[] arr) {

        String result = "U";


        // 정렬한다
        Arrays.sort(arr);

        // 이웃한 항끼리 비교한다
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = "D";
                break;
            }
        }
        System.out.println(result);


    }

    public static void main(String[] args) {
        Main_2 T = new Main_2();

        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(size, arr);
    }

}