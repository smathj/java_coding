package chapter.pointer_window.m06;

import java.util.Scanner;

/*
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

8
 */
public class Main {


	public void solution(int n, int m, int[] arr){

		int max = 0;

		for (int i = 0; i < n; i++) {

			int sum = arr[i];
			int zeroCount = 0;
			if (sum == 0) {
				zeroCount++;
			}
			int mv = i+1;

			while(mv < n && zeroCount <= m + 1) {
				int v = arr[mv];
				if (v == 0) {
					zeroCount++;
				}
				sum += v;
				mv++;

				if(zeroCount == m+1) {
					sum = sum + m;

					max = Math.max(max, sum);
//					if (sum > max) {
//						max = sum;
//					}
					break;
				}
			}
		}

		System.out.println(max);


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