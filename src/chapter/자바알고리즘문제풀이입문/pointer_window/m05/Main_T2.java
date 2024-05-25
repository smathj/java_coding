package chapter.자바알고리즘문제풀이입문.pointer_window.m05;

import java.util.Scanner;


public class Main_T2 {
	public int solution(int n){
		int answer=0, cnt=1;
		n--;
		while(n>0){
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
		}
		return answer;
	}

	public static void main(String[] args){
		Main_T2 T = new Main_T2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.print(T.solution(n));
	}
}