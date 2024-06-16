package chapter.자바알고리즘문제풀이입문.dfs_bfs.m08_dfs;

import java.util.Scanner;

public class Main {
    static int N;
    static boolean flag = false;
    static int F;
    static int[][] paskalArr;


    public static void DFS(int[] arr, int nextIndex) {

        if(flag) return;

        if (nextIndex == N) {
            for (int i = 0; i < arr.length; i++) {
                int value = arr[i];
//                System.out.print(value + " ");
                paskalArr[0][i] = value;
            }
//            System.out.println(Arrays.toString(paskalArr[0]));
//            System.out.println();


            pascalCalculator();

        } else {
            for (int nextValue = 1; nextValue <= N; nextValue++) {

                // 배열 arr 에 nextValue 가 nextIndex 인덱스 이전에 존재하는 가?
                if (containCheck(nextValue, nextIndex, arr)) {
                    continue;
                }
                arr[nextIndex] = nextValue;
                DFS(arr, (nextIndex + 1));
                arr[nextIndex] = 0;


            }
        }




    }


    private static void pascalCalculator() {
        for (int i = 0; i < paskalArr.length-1; i++) {
            int[] beforeArr = paskalArr[i];
            int[] nextArr = paskalArr[i+1];

            for (int j = 0; j < beforeArr.length-1; j++) {
                nextArr[j] = beforeArr[j] + beforeArr[j + 1];

            }

        }


        if (paskalArr[N - 1][0] == F) {
            flag = true;
            int[] topArr = paskalArr[0];
            for (int i : topArr) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

    private static boolean containCheck(int nextValue, int nextIndex, int[] arr) {
        for (int i = 0; i < nextIndex; i++) {
            if (arr[i] == nextValue) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        F = sc.nextInt();

        paskalArr = new int[N][N];

        int temp = N;
        for (int i = 0; i < N; i++) {
            paskalArr[i] = new int[temp--];
        }

        DFS(new int[N], 0);



    }
}
