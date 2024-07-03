package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m01_dfs;

import java.util.Scanner;

public class Main_T {

    static String answer="NO";
   	static int n, total=0;
   	boolean flag=false;

    public void DFS(int L, int sum, int[] arr) {

        if(flag) return;
        if(sum > total / 2) return;
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            // 현재 원소를 포함할 경우 DFS
            DFS(L + 1, sum + arr[L], arr);

            // 현재 원소를 포함 하지 않을 경우 DFS
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		n=kb.nextInt();

   		int[] arr=new int[n];

           for(int i=0; i<n; i++){
   			arr[i]=kb.nextInt();
   			total+=arr[i];
   		}

   		T.DFS(0, 0, arr);
   		System.out.println(answer);
   	}


}
