package chapter.inflearn.recursive_tree_graph.m01;

import java.util.Arrays;
import java.util.Scanner;


/*

3
1 2 3

 */
public class Main {

    public static void print(int param, int n) {
        int nextValue = param + 1;
        if (nextValue <= n) {
            System.out.print(nextValue + " ");
            print(nextValue, n );
        }
    }


    public void solution(int n) {
        print(0, n);
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
/*
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
 */
        T.solution(n);
    }

}