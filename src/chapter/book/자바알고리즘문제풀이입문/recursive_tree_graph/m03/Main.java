package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m03;

import java.util.Scanner;


/*

5

120

 */
public class Main {

    public static int value = 1;

    public static void dfs(int n) {

        if (n == 0) {
            return;
        } else {
            dfs(n - 1);
            value *= n;
        }


    }


    public void solution(int n) {

        dfs(n);
        System.out.println(value);

    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.solution(n);
    }

}