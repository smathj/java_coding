package chapter.sorting_search.m04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/*

5 9
1 2 3 2 6 2 3 5 7

7 5 3 2 6

 */
public class Main {


    public void solution(int memorySize, int[] arr) {

        int[] memoryArr = new int[memorySize];

        System.out.println("memorySize = " + memorySize);
        System.out.println("memoryArr = " + Arrays.toString(memoryArr));
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println();
        System.out.println();


        for (int i = 0; i < arr.length; i++) {

            //

            int index = i;
            System.out.println("[전] index = " + index);
            if(index >= memorySize) {
                index = index - memorySize + 1;
                System.out.println("[후] index = " + index);
            }






            System.out.println(Arrays.toString(memoryArr));
            System.out.println();



        }



    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int memorySize = kb.nextInt();
        int jobCount = kb.nextInt();

        int[] arr = new int[jobCount];

        for (int i = 0; i < jobCount; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(memorySize, arr);
    }

}