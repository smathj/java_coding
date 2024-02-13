package chapter.sorting_search.m06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/*

9
120 125 152 130 135 135 143 127 160

3 8


6
120 130 150 150 130 150

3 5
 */
public class Main_T {


    public ArrayList<Integer> solution(int n, int[] arr){
   		ArrayList<Integer> answer=new ArrayList<>();
   		int[] tmp=arr.clone();
   		Arrays.sort(tmp);
   		for(int i=0; i<n; i++){
   			if(arr[i]!=tmp[i]) answer.add(i+1);
   		}
   		return answer;
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

