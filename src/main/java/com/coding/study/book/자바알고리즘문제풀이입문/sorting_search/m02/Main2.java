package chapter.book.자바알고리즘문제풀이입문.sorting_search.m02;

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
//        Arrays.sort(arr);


        for (int lt = 0; lt < arr.length; lt++) {

            int left = arr[lt];

            for (int rt = (lt+1); rt < arr.length; rt++) {
                int right = arr[rt];

                if(right < arr[lt]) {
//                    System.out.println("[lt : " + lt  + "] 왼쪽이 더큽니다 : " + left + " > " + right);

                    int tmp = arr[lt];
//                    System.out.println("tmp = " + tmp);
                    arr[lt] = right;
                    arr[rt] = tmp;
//                    System.out.println(Arrays.toString(arr));

                }



            }
//            System.out.println(Arrays.toString(arr));
//            System.out.println();
//            System.out.println();

        }

//        System.out.println(Arrays.toString(arr));

        for(int x : arr) System.out.print(x+" ");


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