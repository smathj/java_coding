package chapter.pointer_window.m06;

import java.util.Scanner;

/*
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

8
 */
public class Main {


	// v1.
	public void solution(int n, int m, int[] arr){

		int kCount = 0;
		int maxSize = 1;
		int windowSize = 1;
		for (int i = 1; i < n; i++) {

			while(windowSize < n) {

			}

		}


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