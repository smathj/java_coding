package chapter.codingtestInJava;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 정렬하기
 */
public class M01 {

    public static void main(String[] args) {

        solution(new int[]{1, -5, 2, 4, 3});
        solution(new int[]{2, 1, 1, 3, 2, 5, 4});
        solution(new int[]{6, 1, 7});


    }

    public static void solution(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
