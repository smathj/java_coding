package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m04_dfs;

import java.util.Scanner;

public class Main_T {
    static int[] pm;
   	static int n, m;
   	public void DFS(int L){
   		if(L==m){
   			for(int x : pm) System.out.print(x+" ");
   			System.out.println();
   		}
   		else{
   			for(int i=1; i<=n; i++){
   				pm[L]=i;
   				DFS(L+1);
   			}
   		}
   	}
   	public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		n=kb.nextInt();
   		m=kb.nextInt();
   		pm=new int[m];
   		T.DFS(0);
   	}
}
