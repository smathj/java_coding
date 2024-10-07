package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dynamic_programming.m01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 동적 계획법
 * 바텀업 방식으로 푼다...
 * 작은 단위 연산을 재사용함으로써 복잡한 계산을 푼다.
 *
 * 해당 문제는 피보나치로 해석된다..
 */
public class Main {

	static int n = 0;
	static int[] dy = null;


	public int solution() {

		for (int i = 3; i <= n; i++) {
			dy[i] = dy[i - 1] + dy[i - 2];
		}
		return dy[n];
	}



	public static void main(String[] args){
		Main T = new Main();


		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	// 3 ~ 35 의 값

		dy = new int[n + 1];
		// 바텀업
		dy[1] = 1;	// 1번째 계단 가는 경우의 수
		dy[2] = 2;	// 2번째 계단 가는 경우의 수


		System.out.println(T.solution());
	}
}
