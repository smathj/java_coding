package chapter.pointer_window.m04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
8 6
1 2 1 3 1 1 1 2

3

100 100
3 3 1 4 5 2 2 5 2 1 2 2 1 1 4 1 4 3 3 5 1 5 1 3 4 5 4 5 2 4 2 1 1 4 2 1 5 3 1 3 1 1 1 2 4 4 5 5 5 5 3 2 5 5 3 2 3 4 1 3 3 4 5 1 3 1 3 2 3 1 2 3 2 5 5 4 2 3 1 2 3 2 4 5 2 4 4 4 4 3 1 5 2 2 1 3 2 5 4 1

23
 */
public class Main {


	// v1. Time Limit Exceeded
	public void solution(int n, int m, int[] arr){

		int count = 0;
		for (int i = 0; i < n; i++) {
			int v1 = arr[i];
			int sum = v1;
			List<Integer> list = new ArrayList<>();
			list.add(v1);
			for (int j = i+1; j < n; j++) {
				int v2 = arr[j];
				System.out.println("list = " + list);
				sum += v2;
				list.add(v2);
				if (sum == m)  {
					count++;
					break;
				}
			}
		}

		System.out.println(count);

	}

	// v2. 강의보고 재도전
	public void solution2(int n, int m, int[] arr){
		// 포문으로 rt를 전진시킨다
		// 현재 rt 값을 누적한다
		// sum이 m일떄 answer를 카운팅 한다
		// 누적된 sum이 m 보다 같거나 크면 후처리를 한다
		// 누적된 sum에서 lt 값을 뺀다 (맨앞 인덱스값)
		// 그다음 lt값을 증가시킨다 (인덱스용)
		// 만약 감소시킨 sum 값이 m 이라면 카운팅한다

		int sum = 0;
		int count = 0;
		int lt = 0;

		for (int rt = 0; rt < n; rt++) {

			sum += arr[rt];

			if(sum == m) count++;

			while (sum >= m) {

				sum = sum - arr[lt++];

				if(sum == m) count++;
			}

		}

		System.out.println(count);


	}


	public static void main(String[] args){
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();
		int m=kb.nextInt();

		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}


//		T.solution(n, m, a);
		T.solution2(n, m, a);
	}
}