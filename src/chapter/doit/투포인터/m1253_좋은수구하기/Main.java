package chapter.doit.투포인터.m1253_좋은수구하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i <N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int count = 0;
        // a + b = k
        // 찾는 값 k
        for (int k = 0; k < arr[arr.length-1]; k++) {
            int findValue = arr[k];
            int i = 0;
            int j = arr.length-1;

            while (i < j) {

                if (arr[i] + arr[j] == findValue) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (arr[i] + arr[j] < findValue) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(count);
    }
}
