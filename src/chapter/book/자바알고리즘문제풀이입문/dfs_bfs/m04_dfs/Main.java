package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m04_dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N, M;

    public void DFS(List<Integer> list) {

        if (list.size() == M) {
            for (Integer v : list) {
                System.out.print(v + " ");
            }
            System.out.println();
            list.remove(list.size() - 1);
        } else {
            for (int i = 1; i <= N; i++) {
                list.add(i);
                DFS(list);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        Main T = new Main();

        for (int i = 1; i <= N; i++) {
            // prefix,
            List<Integer> list = new ArrayList<>();
            list.add(i);
            T.DFS(list);

        }



    }
}
