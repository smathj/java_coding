package chapter.book.자바알고리즘문제풀이입문.array.m12;

import java.util.Scanner;

public class Main_T {
	public int solution(int n, int m, int[][] arr){

		int answer=0;

		for(int i=1; i<=n; i++) {

			for(int j=1; j<=n; j++) {

				int cnt=0;

				for(int k=0; k<m; k++) {

					int pi=0, pj=0;

					for(int s=0; s<n; s++) {

						if(arr[k][s]==i) pi=s;

						if(arr[k][s]==j) pj=s;

					}

					if(pi<pj) cnt++;
				}

				if(cnt==m) {
					answer++;
					//System.out.println(i+" "+j);
				}
			}
		}

		return answer;

	}

	public static void main(String[] args){
		Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}