package chapter.자바알고리즘문제풀이입문.array.m11;

import java.util.Scanner;

public class Main {


	public void solution(int n, int[][] arr){

		int[] score = new int[n];
		int[][] frList = new int[n][n];

		// 행렬
		// N 번 학생
		for (int i = 0; i < n; i++) {
			int meetCount = 0;

			// G 학년
			for (int j = 0; j < 5; j++) {

				// 행 - i 번학생
				// 열 - j학년 - (i,j) 반

				int myBan = arr[i][j];

				for (int k = 0; k < n; k++) {

					if (k == i) {
						continue;
					}

					if(frList[i][k] == 1) {
						continue;
					}

					int frBan = arr[k][j];
					if (myBan == frBan) {
						meetCount++;
						frList[i][k] = 1;
					}
				}

//				System.out.println((i+1) + "번 학생" + (j+1) + "학년일때 같은반인 횟수는 " + meetCount + "번 입니다");

			}
			score[i] += meetCount;

//			System.out.println();


		}
//		System.out.println(Arrays.toString(score));

		int stIndex = 0;
		int max = 0;

		for (int i = 0; i < score.length; i++) {
			int v = score[i];
			if (v > max) {
				max = v;
				stIndex = i;
			}
		}

//		System.out.println((stIndex + 1) + "번 학생이 정답임");
		System.out.println(stIndex + 1);


	}


	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();

		int[][] arr=new int[n][5];

		for(int i=0; i<n; i++){
			for(int j=0; j<5; j++){
				arr[i][j]=kb.nextInt();
			}
		}

		T.solution(n, arr);

	}
}
