package chapter.book.자바알고리즘문제풀이입문.sorting_search.m02;

import java.util.Scanner;


/*

6
13 5 11 7 23 15

5 7 11 13 15 23


 */
public class Main_T {


    public int[] solution(int n, int[] arr){
   		for(int i=0; i<n-1; i++){
   			for(int j=0; j<n-i-1; j++){
   				if(arr[j]>arr[j+1]){
   					int tmp=arr[j];
   					arr[j]=arr[j+1];
   					arr[j+1]=tmp;
   				}
   			}
   		}
   		return arr;
   	}
   	public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		int n=kb.nextInt();
   		int[] arr=new int[n];
   		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
   		for(int x : T.solution(n, arr)) System.out.print(x+" ");
   	}

}