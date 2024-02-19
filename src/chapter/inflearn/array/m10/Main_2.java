package chapter.inflearn.array.m10;

import java.util.Scanner;

public class Main_2 {


	public void solution(int n, int[][] arr){


		// 강사 아이디어
		// 상 1, 0
		// 하 -1, 0
		// 좌 0, -1
		// 우 0, 1

		// i,j에 대한 증분
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				boolean flag = true;

				// 동서남북
				for (int k = 0; k < 4; k++) {

					int x = i + dx[k];
					int y = j + dy[k];

					// 동서남북의 값이 현재좌표의 값보다 크면 봉우리가 아니다
					if (x >= 0 && x < n && y >= 0 && y < n && arr[x][y] >= arr[i][j]) {
						flag = false;
						break;
					}
				}

				if (flag) {
					count++;
				}
			}
		}
		System.out.println(count);


	}


	public static void main(String[] args){
		Main_2 T = new Main_2();
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
