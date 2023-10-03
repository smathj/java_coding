package chapter.pointer_window.m02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
5
1 3 9 5 2
5
3 2 5 7 8

2 3 5
 */
public class Main {
	public void solution(int n, int m, int[] a, int[] b){

		int p1=0;
		int p2=0;

		// 반드시 정렬 ( 오름 차순 )
		Arrays.sort(a);
		Arrays.sort(b);

		List<Integer> list = new ArrayList<>();

		while (p1 < n && p2 < m) {

			if(a[p1] == b[p2]) {
				list.add(a[p1]);
				p1++;
				p2++;

			} else if (a[p1] > b[p2]) {
				p2++;
			} else {
				p1++;
			}

		}


		for (Integer integer : list) {
			System.out.print(integer + " ");
		}


	}

	public static void main(String[] args){
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}

		int m=kb.nextInt();
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i]=kb.nextInt();
		}

		T.solution(n, m, a, b);
	}
}