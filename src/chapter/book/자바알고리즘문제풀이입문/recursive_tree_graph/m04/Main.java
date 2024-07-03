package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m04;

import java.util.Scanner;


/*

▣ 입력예제 1
10

▣ 출력예제 1
1 1 2 3 5 8 13 21 34 55

 */
public class Main {

    static int count = 1;
    static int preValue = 0;
    static int stopCount = 1;

    public static void dfs(int value) {

        // 10 > 10
        if(count == stopCount) return;

        int nextValue = preValue + value;   // 2
        count++;
        preValue = value;
        System.out.print(nextValue + " ");
        dfs(nextValue);


    }


    public void solution(int n) {
        stopCount = n;
        System.out.print(1 + " ");
        dfs(1);
    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.solution(n);
    }

}