package chapter.sorting_search.m08;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


/*
▣ 입력예제 1
8 32
23 87 65 12 57 32 99 81


▣ 출력예제 1
3
 */
public class Main {



    public void solution(int value, int[] arr) {

        // 중복 X

//        System.out.println(value);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                number = i + 1;
                break;
            }
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int value = kb.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(value, arr);
    }

}