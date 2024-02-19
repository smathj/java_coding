package chapter.inflearn.sorting_search.m05;

import java.util.Scanner;


/*

8
20 25 52 30 39 33 43 33

D

 */
public class Main {


    public void solution(int size, int[] arr) {

        String result = "U";

        a: for (int i = 0; i < arr.length; i++) {
            b: for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    result = "D";
                    break a;
                }
            }
        }
        System.out.println(result);



    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(size, arr);
    }

}