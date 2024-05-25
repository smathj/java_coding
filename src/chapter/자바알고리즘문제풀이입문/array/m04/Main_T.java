package chapter.자바알고리즘문제풀이입문.array.m04;

import java.util.*;



public class Main_T {
	public int[] solution(int n){
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2; i<n; i++){
			answer[i]=answer[i-2]+answer[i-1];
		}
		return answer;
	}
	public static void main(String[] args){
        Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		for(int x :T.solution(n)) System.out.print(x+" ");
	}
}



