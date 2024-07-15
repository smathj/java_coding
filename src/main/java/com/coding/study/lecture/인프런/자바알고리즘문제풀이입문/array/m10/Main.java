package chapter.book.자바알고리즘문제풀이입문.array.m10;

import java.util.Scanner;

public class Main {


	public void solution(int n, int[][] arr){

		int count = 0;
		int[][] map = new int[n+2][n+2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i+1][j+1] = arr[i][j];
			}
		}



		// 행렬
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {

				// 가운데 센터
				int p = map[i][j];

				// 상 --i
				int v1 = map[i-1][j];

				// 하 ++i
				int v2 = map[i+1][j];

				// 좌 --j
				int v3 = map[i][j-1];

				// 우 ++j
				int v4 = map[i][j+1];

//				int[] tmpArr = {p, v1, v2, v3, v4};
//				System.out.println(Arrays.toString(tmpArr));

				int innerMax = 0;

				innerMax = Math.max(innerMax, v1);	// 상
				innerMax = Math.max(innerMax, v2);	// 하
				innerMax = Math.max(innerMax, v3);	// 좌
				innerMax = Math.max(innerMax, v4);	// 우

				if (p > innerMax) {
					count++;
				}

			}
		}

		System.out.print(count);


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
