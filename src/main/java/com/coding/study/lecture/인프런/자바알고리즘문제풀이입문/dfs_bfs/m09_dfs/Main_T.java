package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m09_dfs;

import java.util.Scanner;

public class Main_T {
    static int[] combi;
   	static int n, m;
   	public void DFS(int L, int s){
   		if(L==m){
   			for(int x : combi) System.out.print(x+" ");
   			System.out.println();
   		}
   		else{
   			for(int i=s; i<=n; i++){
   				combi[L]=i;
   				DFS(L+1, i+1);
   			}
   		}
   	}
   	public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		n=kb.nextInt();
   		m=kb.nextInt();
   		combi=new int[m];
   		T.DFS(0, 1);
   	}
}
