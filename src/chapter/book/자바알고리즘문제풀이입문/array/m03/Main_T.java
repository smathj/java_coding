package chapter.book.자바알고리즘문제풀이입문.array.m03;

import java.util.Scanner;

public class Main_T {

    public String solution(int n, int[] a, int[] b){
   		String answer="";


        // ! A의 기준으로 And 조건을 적극 활용하였다
        // ? A 이기는경우 3가지, 비기는 경우 1가지, 지는경우는 else 처리
   		for(int i=0; i<n; i++){
   			if(a[i]==b[i]) answer+="D";
   			else if(a[i]==1 && b[i]==3) answer+="A";
   			else if(a[i]==2 && b[i]==1) answer+="A";
   			else if(a[i]==3 && b[i]==2) answer+="A";
   			else answer+="B";
   		}
   		return answer;
   	}
   	public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		int n=kb.nextInt();
   		int[] a=new int[n];
   		int[] b=new int[n];
   		for(int i=0; i<n; i++){
   			a[i]=kb.nextInt();
   		}
   		for(int i=0; i<n; i++){
   			b[i]=kb.nextInt();
   		}
   		for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
   	}

}
