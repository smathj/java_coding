package chapter.fastcampus.part1.ch4_bruteforce.m01;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 오름 차순을 정렬 알고리즘으로 직접 해결해보자
 * 버블 정렬, 삽입정렬 , 선택 정렬 ...
 *
 * 삽입 정렬을 선택하자
 */
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
public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int[] resultArr = new int[7];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }


        boolean stopFlag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j) continue;

                // s7 - ai - aj = 100
                if ((sum - arr[i] - arr[j]) == 100) {

                    // 그떄 resultArr 에 값 복사
                    int index = 0;
                    for (int k = 0; k < arr.length ; k++) {
                        if (arr[k] != arr[i] && arr[k] != arr[j]) {
                            resultArr[index] = arr[k];
                            index++;
                        }
                    }
                    stopFlag = true;
                }
            }
            if(stopFlag) break;

        }

        insertSort(resultArr);
        for (int i : resultArr) {
            System.out.println(i);
        }


    }


    // [삽입 정렬]
    public static void insertSort(int[] arr) {

        // * 정렬된 영역
        // i = 0

        // ? 키
        for (int i = 1; i < arr.length; i++) {

            // 키 값
            int insertingData = arr[i];
            int j = 0;

            // * 정렬 영역
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > insertingData) {
                    arr[j + 1] = arr[j];
                } else {
                    System.out.println("j = " + j);
                    System.out.println(Arrays.toString(arr));
                    break;
                }
            }

            arr[j + 1] = insertingData;

        }
    }
}
