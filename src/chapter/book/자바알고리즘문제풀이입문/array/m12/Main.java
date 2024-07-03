package chapter.book.자바알고리즘문제풀이입문.array.m12;

import java.util.Scanner;

public class Main {


	/**
	 *
	 * @param m 줄의수
	 * @param n 학생수
	 * @param arr 배열
	 */
	public void solution(int m, int n, int[][] arr){

		int[][] score = new int[n][n];

		// 줄
		for (int i = 0; i < m; i++) {


			// 학생
			for (int j = 0; j < n; j++) {

				int stNum = arr[i][j];
//				System.out.println("stNum = " + stNum);
//				System.out.println("(i,j) = (" + i + "," + j + ")");
				// --> 탐색
				for (int k = j + 1; k < n; k++) {

					int leftStNum = arr[i][k];
//					System.out.println("leftStNum = " + leftStNum);
//					System.out.println("(i,k) = (" + stNum + "," + leftStNum + ")");
					score[stNum-1][leftStNum-1] = score[stNum-1][leftStNum-1] + 1;

				}
//				System.out.println("==================");

			}

//			System.out.println();
//			System.out.println();

		}


		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// n-1 = 3

//				System.out.println("score[i][j] = " + score[i][j]);
				if (score[i][j] == m) {
					count++;
				}

			}
		}

		System.out.println(count);

	}


	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();	// 한줄당 n개
		int m=kb.nextInt();	// m 줄

		int[][] arr=new int[m][n];

		for(int i = 0; i< m; i++){
			for(int j = 0; j< n; j++){
				arr[i][j]=kb.nextInt();
			}
		}

		T.solution(m, n, arr);

	}
}
