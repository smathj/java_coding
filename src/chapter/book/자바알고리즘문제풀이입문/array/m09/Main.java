package chapter.book.자바알고리즘문제풀이입문.array.m09;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


	public void solution(int n, int[][] arr){

		int max = 0;

		for (int i = 0; i < n; i++) {

			int garoSum = garoSum(arr, i, n);
			int seroSum = 0;
			int sideSumRight = 0;
			int sideSumLeft = 0;

			int innerMax = garoSum;


			for (int j = 0; j < n; j++) {
				int val = arr[i][j];
				seroSum = seroSum(arr, j, n);

				int tmp = sideSumRight(arr, i, j, n);
				if (tmp >= sideSumRight) {
					sideSumRight = tmp;
				}

				int tmp2 = sideSumLeft(arr, i, j, n);
				if(tmp2 > sideSumLeft) {
					sideSumLeft = tmp2;
				}

				List<Integer> list = Arrays.asList(garoSum, seroSum, sideSumLeft, sideSumRight);

				for (Integer sum : list) {
					if (sum >= innerMax) {
						innerMax = sum;
					}
				}

				if (innerMax >= max) {
					max = innerMax;
				}
			}



		}
		System.out.print(max);
	}

	// 가로 총합
	public static int garoSum(int[][] arr, int i, int n) {

		int sum = 0;
		for (int j = 0; j < n; j++) {
			sum += arr[i][j];
		}
		return sum;
	}

	// 세로 총합
	public static int seroSum(int[][] arr, int j, int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i][j];
		}
		return sum;

	}



	// 오른쪽 대각 아래 총합
	public static int sideSumRight(int[][] arr, int i, int j, int n) {

		int a = i;
		int b = j;

		int c = i;
		int d = j;


		int sum = arr[i][j];

		// 윗방향
		while (a < 0 && b < 0) {
			a--;
			b--;
			if(a < 0 || b < 0) break;
			int v1 = arr[a][b];
			sum += v1;
		}

		// 아랫방향
		while (c < n && d < n) {
			c++;
			d++;
			if(c >= n || d >= n) break;
			int v2 = arr[c][d];
			sum += v2;
		}

		return sum;
	}


	// 왼쪽 대각 아래 총합
	public static int sideSumLeft(int[][] arr, int i, int j, int n) {

		int a = i;
		int b = j;

		int c = i;
		int d = j;


		int sum = arr[i][j];

		// 윗방향
		while (a < 0 && b < n) {
			a--;
			b++;
			if(a < 0 || b >= n) break;
			int v1 = arr[a][b];
			sum += v1;
		}

		// 아랫방향
		while (c < n && d < 0) {
			c++;
			d--;
			if(c >= n || d < 0) break;
			int v2 = arr[c][d];
			sum += v2;
		}

		return sum;

	}




	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();

		int[][] arr=new int[n][n];

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}

		T.solution(n, arr);

	}
}
