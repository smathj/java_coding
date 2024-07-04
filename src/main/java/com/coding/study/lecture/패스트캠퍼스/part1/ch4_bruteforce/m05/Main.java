package com.coding.study.lecture.패스트캠퍼스.part1.ch4_bruteforce.m05;

import java.util.*;

/**
 * 3085
 * 사탕 게임
 */
/*
3
YCP
CCY
YPC


3


 */
public class Main {


    public static String[][] arr = null;
    public static int N = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = Integer.parseInt(sc.nextLine());

        arr = new String[N + 1][N + 1];

        // 입력
        for (int i = 1; i <= N; i++) {
            String[] split = sc.nextLine().split("");
            String[] arrTemp = new String[N + 1];
            for (int j = 1; j <= N; j++) {
                arrTemp[j] = split[j - 1];
            }
            arr[i] = arrTemp;
        }


        int max = 0;

        // 행 반복문
        a:
        for (int i = 1; i <= N; i++) {
            // 열 반복문
            b: for (int j = 1; j <= N; j++) {
                // 현재 행과, 전체 열의 사이즈를 파라미터로 넘김
                int result  = changePosition(i, j);
                //System.out.println("(" + i + ","+ j + ") 때의 최댓값 = " + result);
                if (result > max) max = result;
                if (max == N) break a;
            }


        }

        //System.out.println();
        //System.out.println();
        //System.out.println("결과");
        System.out.print(max);

    }


    public static String[][] myCopy(String[][] arr) {

        String[][] returnArr = new String[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            String[] innerArr = new String[arr.length];
            returnArr[i] = innerArr;
            for (int j = 0; j < innerArr.length; j++) {
                innerArr[j] = arr[i][j];
            }

        }

        return returnArr;

    }
    // 행을 파라미터로 받는다
    private static int changePosition(int i, int j) {
        //System.out.println();
        //System.out.println();
        int max = 0;

        // -----------------------------------------
        // 현재 상태에서 갯수 새기
        // 갯수 새기 메서드
        if (true) {
            int result = maxCount(arr, i, j);
            //System.out.println("현재 상태 최대값 : " + result);
            if (result > max) max = result;
            if (result == N) return max;
        }



        // -----------------------------------------
        // 왼쪽과 교체
        // 1열이 아닐때만 바꿀 수 있음
        if (j != 1) {
            // 갯수 새기 메서드
            change(arr, i, j, i, j - 1);
            int result = maxCount(arr, i, j);
            change(arr, i, j, i, j - 1);

            //System.out.println("왼쪽과 교체했을때 최대값 : " + result);
            if (result > max) max = result;
            if (result == N) return max;

        }

        // -----------------------------------------
        // 오른쪽과 교체
        // j가 N이 아닐때만 바꿀 수 있음
        if (j != N) {
            // 갯수 새기 메서드
            change(arr, i, j, i, j + 1);
            int result = maxCount(arr, i, j);
            change(arr, i, j, i, j + 1);

            //System.out.println("오른쪽과 교체했을때 최대값 : " + result);
            if (result > max) max = result;
            if (result == N) return max;
        }


        // -----------------------------------------
        // 위 교체
        // i가 1이 아닐때만 바꿀 수 있음
        if (i != 1) {
            // 갯수 새기 메서드
            change(arr, i, j, i -1, j);
            int result = maxCount(arr, i, j);
            change(arr, i, j, i -1, j);

            //System.out.println("위와 교체했을때 최대값 : " + result);
            if (result > max) max = result;
            if (result == N) return max;
        }



        // -----------------------------------------
        // 아래와 교체
        // i가 N이 아닐때만 바꿀 수 있음
        if (i != N) {
            // 갯수 새기 메서드
            change(arr, i, j, i + 1, j);
            int result = maxCount(arr, i, j);
            change(arr, i, j, i + 1, j);

            //System.out.println("아래와와 교체했을때 최대값 : " + result);
            if (result > max) max = result;
            if (result == N) return max;
        }

        return max;
    }

    private static void change(String[][] arr, int i1, int j1, int i2, int j2) {
        String temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
    }

    private static int maxCount(String[][] clone, int i, int j) {


        // 행의 최대값, 열의 최대값
        int maxI = 1, maxJ = 1;
        int maxIHistory = 1, maxJHistory = 1;

        String temp = clone[1][j];

        // 행
        for (int k = 2; k <= N; k++) {
            String alphabet = clone[k][j];
            if(temp.equals(alphabet)) {
                maxI++;
                //! 틀린 원인 ㅡ ㅡ
//                maxIHistory = maxI;
                maxIHistory = Integer.max(maxIHistory, maxI);


            }
            else {
                maxI = 1;
                temp = alphabet;
            }

        }



        temp = clone[i][1];
        // 열
        for (int k = 2; k <= N; k++) {
            String alphabet = clone[i][k];
            if(temp.equals(alphabet)) {
                maxJ++;
                //! 틀린 원인 ㅡ ㅡ
//                maxJHistory = maxJ;
                maxJHistory = Integer.max(maxJHistory, maxJ);
            }
            else {
                maxJ = 1;
                temp = alphabet;
            }
        }

        return Integer.max(maxIHistory, maxJHistory);
    }


}

