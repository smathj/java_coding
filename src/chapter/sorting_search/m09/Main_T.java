package chapter.sorting_search.m09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/*
9 3
1 2 3 4 5 6 7 8 9

17


10 3
6 5 8 5 6 8 7 6 6 7

24


100 10
8 6 7 6 8 7 8 9 5 7 5 7 5 7 7 7 8 5 7 9 7 5 9 8 6 6 8 7 5 5 5 8 7 5 9 7 8 6 6 8 5 9 7 5 7 8 9 7 5 7 5 8 9 5 8 9 6 9 7 6 7 6 9 7 6 9 7 5 7 5 6 8 5 7 9 9 6 8 9 6 5 8 6 9 6 8 8 6 9 7 8 8 7 7 6 8 6 9 5 9


73
 */
public class Main_T {


    public int count(int[] arr, int capacity){
   		int cnt=1, sum=0;
   		for(int x : arr){
   			if(sum+x>capacity){
   				cnt++;
   				sum=x;
   			}
   			else sum+=x;
   		}
   		return cnt;
   	}

   	public int solution(int n, int m, int[] arr){
   		int answer=0;
   		int lt=Arrays.stream(arr).max().getAsInt();
   		int rt= Arrays.stream(arr).sum();
   		while(lt<=rt){
   			int mid=(lt+rt)/2;
   			if(count(arr, mid)<=m){
   				answer=mid;
   				rt=mid-1;
   			}
   			else lt=mid+1;
   		}
   		return answer;
   	}

    public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		int n=kb.nextInt();
   		int m=kb.nextInt();
   		int[] arr=new int[n];
   		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
   		System.out.println(T.solution(n, m, arr));
   	}
}

