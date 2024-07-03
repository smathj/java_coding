package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m07_dfs;

import java.util.Scanner;

public class Main_T {

    int[][] dy=new int[35][35];


    public int DFS(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main_T T = new Main_T();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int r=kb.nextInt();
        System.out.println(T.DFS(n, r));


    }
}
