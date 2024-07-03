package chapter.book.datastructure.ch2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열의 요소를 역순으로 만든다
 */
public class ReverseArray {

    // * 요소 교환
    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    // * 역순으로 정렬
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요소의 수 : ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("x[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("요소를 역순으로 정렬했습니다");
        System.out.println(Arrays.toString(arr));

    }
}
