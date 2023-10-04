package chapter.pointer_window.m03;

import java.util.Scanner;

public class Main_T {
	public int solution(int n, int k, int[] arr){
		int answer, sum=0;

		for(int i=0; i<k; i++) sum+=arr[i];

		answer=sum;

		for(int i=k; i<n; i++){
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}

		return answer;
	}

	public static void main(String[] args){
		Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}