package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m03;

import java.util.Scanner;


/*

5

120

 */
public class Main_T {


    public static int dfs(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * dfs(n - 1);
        }


    }


    public void solution(int n) {

        System.out.println(dfs(n));

    }

    public static void main(String[] args) {

        Main_T T = new Main_T();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.solution(n);
    }

}