package chapter.book.자바알고리즘문제풀이입문.array.m04;

import java.util.Scanner;

public class Main_T_2 {
	public void solution(int n){
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args){
        Main_T_2 T = new Main_T_2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		T.solution(n);
	}
}
