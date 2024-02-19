package chapter.inflearn.recursive_tree_graph.m02;

import java.util.Scanner;


/*

11

1011

 */
public class Main_T {


    public static void dfs(int n) {

        if (n == 0) {
            return;
        } else {
            // 몫만 계속 넘겨준다
            dfs(n/2);
            // 나머지만 출력한다
            System.out.print(n % 2);
        }

    }


    public void solution(int n) {
        dfs(n);
    }

    public static void main(String[] args) {

        Main_T T = new Main_T();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.solution(n);
    }

}