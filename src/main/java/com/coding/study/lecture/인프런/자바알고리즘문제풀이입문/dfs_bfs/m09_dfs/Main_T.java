package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m09_dfs;

import java.util.Scanner;

public class Main_T {
    static int[] combi;
   	static int n, m;
   	public void DFS(int L, int s){
		// 레벨이 m이 되면 출력하고 끊는다 (기저함수)
   		if(L==m){
   			for(int x : combi) System.out.print(x+" ");
   			System.out.println();
   		}
   		else{
   			for(int i=s; i<=n; i++){
   				combi[L]=i;	// [0레벨] = 1, [1레벨] = 2, 즉 레벨이 곧 인덱스이다
   				DFS(L+1, i+1); // 재귀 발생

   			}
   		}
   	}
   	public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		n=kb.nextInt();
   		m=kb.nextInt();	// n개 중 m개를 뽑는다
   		combi=new int[m]; // m 개를 저장할 배열
   		T.DFS(0, 1);	// 0 레벨 시작숫자는 1
   	}
}
