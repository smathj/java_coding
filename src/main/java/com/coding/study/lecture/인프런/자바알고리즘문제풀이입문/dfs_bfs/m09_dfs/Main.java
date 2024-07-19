package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m09_dfs;

import java.util.Scanner;

public class Main {
   	static int n, m;

    // 항상 데이터를 여기에 채운다
    static int[] combi;

	/**
	 * level 값의 인덱스에
	 * 파라미터로 넘어온 start 값 부터 n 까지 설정하면서
	 * 재귀
	 */
   	public static void DFS(int level, int start){
		if (level == m) {
			for (int i : combi) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = start; i <= n; i++) {
				/**
				 * 반복할때마다 해당 레벨에 값을 설정한다
				 */
				combi[level] = i;
				DFS(level + 1, i + 1);
			}
		}


   	}
   	public static void main(String[] args){
   		Scanner kb = new Scanner(System.in);

   		n=kb.nextInt();
   		m=kb.nextInt();		// n개 중 m개를 뽑는다

   		combi=new int[m]; 	// m 개를 저장할 배열

   		DFS(0, 1);	// 0 레벨 시작숫자는 1
   	}
}



