package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dynamic_programming.m01;


import java.util.Scanner;

public class Main_T {

	static int[] dy;
	public int solution(int n){
		dy[1]=1;
		dy[2]=2;
		for(int i=3; i<=n; i++) dy[i]=dy[i-2]+dy[i-1];
		return dy[n];
	}


	public static void main(String[] args){
		Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		dy=new int[n+1];
		System.out.print(T.solution(n));
	}
}
