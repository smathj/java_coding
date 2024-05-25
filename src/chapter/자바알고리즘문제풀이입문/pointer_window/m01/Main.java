package chapter.자바알고리즘문제풀이입문.pointer_window.m01;

import java.util.ArrayList;
import java.util.Scanner;

/*
3
1 3 5
5
2 3 6 7 9

1 2 3 3 5 6 7 9
 */
public class Main {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){

		ArrayList<Integer> answer = new ArrayList<>();

		int p1=0, p2=0;

		while(p1<n && p2<m) {
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}

		while(p1<n) answer.add(a[p1++]);

		while(p2<m) answer.add(b[p2++]);

		return answer;
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

		for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
	}
}