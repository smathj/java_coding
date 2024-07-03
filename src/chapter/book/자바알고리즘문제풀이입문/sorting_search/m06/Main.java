package chapter.book.자바알고리즘문제풀이입문.sorting_search.m06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/*

9
120 125 152 130 135 135 143 127 160

3 8


6
120 130 150 150 130 150

3 5
 */
public class Main {


    public void solution(int[] arr) {

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(copyArr));
//        System.out.println(Arrays.toString(arr));
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < copyArr.length; i++) {
            if(copyArr[i] != arr[i]) resultList.add(i + 1);
        }
        for (Integer num : resultList) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(arr);
    }

}