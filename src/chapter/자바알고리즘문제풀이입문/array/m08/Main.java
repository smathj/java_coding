package chapter.자바알고리즘문제풀이입문.array.m08;

import java.util.*;

public class Main {


	public void solution(int n, int[] arr){

		/**
		 * 같은 점수일때 높은 등수
		 * 그다음 점수는 아랫 등수가아니라
		 * 인원 만큼 밀려난 등수이다
		 * ex ) 100, 100, 100, 92
		 * 1등 3명, 4등 1명
		 */
		for (int i = 0; i < n; i++) {
			int val = arr[i];
			int result = 1;
			for (int j = 0; j < n; j++) {
				int roopVal = arr[j];
				if(val < roopVal) {
					result = result + 1;
				}
			}
			System.out.print(result + " ");
		}
	}


	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();

		int[] arr=new int[n];

		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}

		T.solution(n, arr);

	}
}
