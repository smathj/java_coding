package chapter.자바알고리즘문제풀이입문.dfs_bfs.m06_dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static int[] arr;


    public static void DFS(int a, List<Integer> list) {


        if (list.size() == M) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
            list.remove(list.size() - 1);
        } else {

            for (int i = 0; i < N; i++) {
                int v = arr[i]; // 3 6 9

                if (v == a)
                    continue;
                list.add(v);
                DFS(v, list);
            }

        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            DFS(arr[i], list);
        }


    }
}
