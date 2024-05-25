package chapter.자바알고리즘문제풀이입문.array.m06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 시간제한 1초
 */
public class Main {
	public boolean isPrime(int num){
		if(num==1) return false;

		for(int i=2; i<num; i++){
			// 약수가 있으면 거짓
			if(num%i==0) return false;
		}

		// 약수가 없으면 소수가 맞다
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr){

		ArrayList<Integer> answer = new ArrayList<>();

		for(int i=0; i<n; i++){
			// 기본값
			int tmp=arr[i];
			// 뒤집은 값
			int res=0;

			// 뒤집는 로직, 0 보다 클때만
			while(tmp>0) {

				// 마지막 수
				int t=tmp%10;

				// 뒤집은 수
				res=res*10+t;

				// 그 다음 수
				tmp=tmp/10;
			}

			// 소수면 add
			if(isPrime(res)) answer.add(res);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){
			System.out.print(x+" ");
		}
	}
}
