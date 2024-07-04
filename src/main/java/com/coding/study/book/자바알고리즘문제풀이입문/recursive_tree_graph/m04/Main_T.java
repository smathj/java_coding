package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m04;


/*

▣ 입력예제 1
10

▣ 출력예제 1
1 1 2 3 5 8 13 21 34 55

 */
public class Main_T {

    static int[] fibo;

    public static int DFS(int n) {

        if(fibo[n] > 0) return fibo[n];
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }

    }


    public static void main(String[] args) {
        Main_T T = new Main_T();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }

}