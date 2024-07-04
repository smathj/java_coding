package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m04;


/*

▣ 입력예제 1
10

▣ 출력예제 1
1 1 2 3 5 8 13 21 34 55

 */
public class Main_T2 {


    public int DFS(int n){
   		if(n==1) return 1;
   		else if(n==2) return 1;
   		else return DFS(n-2)+DFS(n-1);  // 재귀 뻗어 나가기
   	}

   	public static void main(String[] args){
        Main_T2 T = new Main_T2();
        int n = 10;
   		for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
   	}

}