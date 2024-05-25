package chapter.자바알고리즘문제풀이입문.recursive_tree_graph.m02;

import java.util.Scanner;


/*

11

1011

 */
public class Main {

    public static final StringBuilder sb = new StringBuilder();

    public static void dfs(int n) {
        // 몫
        int mock = n / 2;   // -> 0

        // 나머지
        int rest = n % 2;   // -> 1

        // 0, 1



        if (mock != 0) {
            dfs(mock);

        }

        // 나머지가 0, 1이면 기록한다
        if (rest < 2) {
//            list.add(rest);
            sb.append(rest);
        }


    }


    public void solution(int n) {

        dfs(n);
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.solution(n);
    }

}