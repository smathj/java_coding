package chapter.자바알고리즘문제풀이입문.recursive_tree_graph.m01;


/*

3
1 2 3

 */
public class Main_T {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n-1);
			System.out.print(n+" ");
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		Main_T T = new Main_T();
		T.solution(3);
		//System.out.println(T.solution(3));
	}
}