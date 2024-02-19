package chapter.inflearn.pointer_window.m03;

import java.util.Scanner;

/*
10 3
12 15 11 20 25 10 20 19 13 15

56
 */
public class Main {


	public void solution(int n, int k, int[] arr){

		int sum = 0;
		int answer = 0;

		// 첫 윈도우
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		answer = sum;

		// 맨앞 버리고 맨뒤 가져가고

		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i-k]);	// 다음 3개
			answer = Math.max(sum, answer);

		}

		System.out.println(answer);



	}

	public static void main(String[] args){
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();
		int k=kb.nextInt();

		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}


		T.solution(n, k, a);
	}
}