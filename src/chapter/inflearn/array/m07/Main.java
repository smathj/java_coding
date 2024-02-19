package chapter.inflearn.array.m07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 시간제한 1초
 */
public class Main {


	public void solution(int[] arr){

		// 0 을 만나지않으면 a = a + 1 패턴으로 누적

		ArrayList<Integer> list = new ArrayList<>();

		int sum = 0;

		for (int i = 0; i <= arr.length; i++) {

			if (i == arr.length) {
				if(sum > 0 ) list.add(sum);
				break;
			}

			int tmp = arr[i];

			if(tmp == 1) {
				sum = sum + 1;

			} else {
				if(sum > 0 ) list.add(sum);
				sum = 0;
			}
		}

		System.out.println(sum(list));
	}

	public static int sum(ArrayList<Integer> list) {

		int sum = 0;

		for (Integer val : list) {

			int tmp = 0;

			for (int i = 1; i <= val; i++) {
				tmp += i;
			}

			sum = sum + tmp;

		}


		return sum;
	}



	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		// 총문제 갯수
		int n=kb.nextInt();

		/**
		 * 문제의 답안 1 or 0 의 정수
		 * 1 : 일단 정답
		 * 0 : 오답
		 */
		int[] arr=new int[n];

		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}

		T.solution(arr);

	}
}
