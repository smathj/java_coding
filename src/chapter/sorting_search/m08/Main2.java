package chapter.sorting_search.m08;

import java.util.Arrays;
import java.util.Scanner;


/*
▣ 입력예제 1
8 32
23 87 65 12 57 32 99 81


▣ 출력예제 1
3
 */
public class Main2 {



    public void solution(int value, int[] arr) {

        // 중복 X

//        System.out.println(value);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        int lt = 0;
        int rt = arr.length - 1;

        int number = 0;

        while (lt <= rt) {
            // 가운데 인덱스
            int mid = (lt + rt) / 2;
            // 가운데 인덱스가 그 값일떄
            if (arr[mid] == value) {
                number = mid + 1;
                break;
            }
            // 가운데 인덱스 값이 찾고자하는 값보다 클때 -> rt = mid - 1
            if (arr[mid] > value) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(number);
    }

    public static void main(String[] args) {
        Main2 T = new Main2();

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