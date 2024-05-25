package chapter.자바알고리즘문제풀이입문.pointer_window.m04;

import java.util.Scanner;

/*
8 6
1 2 1 3 1 1 1 2

3

100 100
3 3 1 4 5 2 2 5 2 1 2 2 1 1 4 1 4 3 3 5 1 5 1 3 4 5 4 5 2 4 2 1 1 4 2 1 5 3 1 3 1 1 1 2 4 4 5 5 5 5 3 2 5 5 3 2 3 4 1 3 3 4 5 1 3 1 3 2 3 1 2 3 2 5 5 4 2 3 1 2 3 2 4 5 2 4 4 4 4 3 1 5 2 2 1 3 2 5 4 1

23
 */

// ! lt, rt는 Two Pointer 이다
public class Main_T {
	public int solution(int n, int m, int[] arr){

		int answer=0, sum=0, lt=0;

		// ! [For]
		// 포문으로 rt를 전진시킨다
		for(int rt=0; rt<n; rt++){

			// 현재 rt 값을 누적한다
			sum+=arr[rt];

			// sum이 m일떄 answer를 카운팅 한다
			if(sum==m) answer++;

			// ? [While]
			// 누적된 sum이 m 보다 같거나 크면 후처리를 한다
			while(sum>=m){

				// 누적된 sum에서 lt 값을 뺀다 (맨앞 인덱스값)
				// 그다음 lt값을 증가시킨다 (인덱스용)
				sum -= arr[lt++];

				// 만약 감소시킨 sum 값이 m 이라면 카운팅한다
				if(sum==m) answer++;
			}
			// ? [While End]

		}
		// ! [For End]

		return answer;
	}

	public static void main(String[] args){
		Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}
}