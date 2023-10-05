package chapter.pointer_window.m04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
8 6
1 2 1 3 1 1 1 2

3

100 100
3 3 1 4 5 2 2 5 2 1 2 2 1 1 4 1 4 3 3 5 1 5 1 3 4 5 4 5 2 4 2 1 1 4 2 1 5 3 1 3 1 1 1 2 4 4 5 5 5 5 3 2 5 5 3 2 3 4 1 3 3 4 5 1 3 1 3 2 3 1 2 3 2 5 5 4 2 3 1 2 3 2 4 5 2 4 4 4 4 3 1 5 2 2 1 3 2 5 4 1

23
 */
public class Main {


	// v1. Time Limit Exceeded
	public void solution(int n, int m, int[] arr){

		int count = 0;
		for (int i = 0; i < n; i++) {
			int v1 = arr[i];
			int sum = v1;
			List<Integer> list = new ArrayList<>();
			list.add(v1);
			for (int j = i+1; j < n; j++) {
				int v2 = arr[j];
				System.out.println("list = " + list);
				sum += v2;
				list.add(v2);
				if (sum == m)  {
					count++;
					break;
				}
			}
		}

		System.out.println(count);

	}


	// v2. while
//	public void solution2(int n, int m, int[] arr){
//
//		int count = 0;
//		int p1 = 0;
//		int p2 = 0;
//		int sum = 0;
//		while (p1 < n && p2 < n && sum != m) {
//
//			int i = arr[p1] + arr[p2++];
//			if (sum == m) {
//				count++;
//			}
//		}
//
//		for (int i = 0; i < n; i++) {
//			int i1 = arr[i];
//			while (sum != m) {
//			}
//
//		}
//
//		System.out.println(count);
//
//	}
	public static void main(String[] args){
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();
		int m=kb.nextInt();

		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}


		T.solution(n, m, a);
	}
}