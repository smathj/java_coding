package com.coding.study.lecture.패스트캠퍼스.part1.ch4_bruteforce.m01;

import java.util.Arrays;
import java.util.Scanner;

/*
20
7
23
19
10
15
25
8
13

7
8
10
13
19
20
23

 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int[] resultArr = new int[7];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

//        System.out.println("sum = " + sum);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(resultArr));

        a: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j) continue;

                if ((sum - arr[i] - arr[j]) == 100) {
//                    System.out.println();
//                    System.out.println();
//                    System.out.println("i = " + i);
//                    System.out.println("arr[i] = " + arr[i]);
//                    System.out.println("j = " + j);
//                    System.out.println("arr[j] = " + arr[j]);
//                    System.out.println();
                    int index = 0;
                    for (int k = 0; k < arr.length ; k++) {

//                        if(index == 7) break a;

                        if (arr[k] != arr[i] && arr[k] != arr[j]) {
//                            System.out.println("index = " + index);
//                            System.out.println("k = " + k);
//                            System.out.println("arr[k] = " + arr[k]);
//                            System.out.println(Arrays.toString(resultArr));
//                            System.out.println();
                            resultArr[index] = arr[k];
                            index++;
                        }
                    }
                }

            }
        }
        Arrays.sort(resultArr);
        for (int i : resultArr) {
            System.out.println(i);
        }


    }
}
