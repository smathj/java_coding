package chapter.자바알고리즘문제풀이입문.array.m08;

import java.util.Scanner;

public class Main_T {
	public int[] solution(int n, int[] arr){
		int[] answer = new int[n];
		for(int i=0; i<n; i++){
			int cnt=1;
			for(int j=0; j<arr.length; j++){
				if(arr[j]>arr[i]) cnt++;
			}
			answer[i]=cnt;
		}
		return answer;
	}
	public static void main(String[] args){
		Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x :T.solution(n, arr)) System.out.print(x+" ");
	}
}