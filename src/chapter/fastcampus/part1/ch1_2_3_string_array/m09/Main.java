package chapter.fastcampus.part1.ch1_2_3_string_array.m09;

import java.util.*;


/*
----------------------------------------------------------------
10
5
2
3
1
4
2
3
5
1
7


1
1
2
2
3
3
4
5
5
7
----------------------------------------------------------------

 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                int left = arr[i];
                int right = arr[j];
                if(left > right) {
//                    System.out.println("왼쪽이 더 큽니다");
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                } else {
//                    System.out.println("오른쪽이 더 큽니다");
                }
//                System.out.println("i = " + left);
//                System.out.println("j = " + right);
            }
//            System.out.println();
//            System.out.println();
        }
//        System.out.println(Arrays.toString(arr));

        for (int i : arr) {
            System.out.println(i);
        }

    }

}
