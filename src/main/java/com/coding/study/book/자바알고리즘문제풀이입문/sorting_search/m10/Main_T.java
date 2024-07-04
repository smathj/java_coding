package chapter.book.자바알고리즘문제풀이입문.sorting_search.m10;

import java.util.Arrays;
import java.util.Scanner;


/**

5 3
1 2 8 4 9

3


 */
public class Main_T {

	public int count(int[] arr, int dist){
		int cnt=1;
		int ep=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]-ep>=dist){
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}

	public int solution(int n, int c, int[] arr){
		int answer=0;

		// x축 좌표니까, 오름 차순으로 정렬한다
		Arrays.sort(arr);

		// 최소
		int lt=1;

		// 최대
		int rt=arr[n-1];


		while(lt<=rt){
			// 두 마구간의 거리
			int mid=(lt+rt)/2;

			if(count(arr, mid)>=c){
				answer=mid;
				lt=mid+1;
			}
			else rt=mid-1;
		}
		return answer;
	}

	public static void main(String[] args){
		Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int c=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
}

