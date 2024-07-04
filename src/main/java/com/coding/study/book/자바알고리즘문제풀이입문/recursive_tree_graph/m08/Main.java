package chapter.book.자바알고리즘문제풀이입문.recursive_tree_graph.m08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기(BFS: 상대트리탐색)
 */
/*

5 14
3

8 3
5

 */
public class Main {

    public static int x1 = 0;
    public static int x2 = 0;

    public static int[] dis = {1, 5, -1};   // 앞1, 앞5, 뒤1




    public static void DFS() {

        int[] visitArr = new int[10001];
        Queue<Integer> que = new LinkedList<>();
        visitArr[x1] = 1;   // 초기 위치 방문 하였음
        que.offer(x1);
        int level = 0;

        a: while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int nowNodeValue = que.poll();

                // 반복문을 통해 3가지 경우에 대해 이동한다
                for (int j = 0; j < 3; j++) {

                    // 각경우의 x좌표 (자식 노드)
                    int childNodeValue = nowNodeValue + dis[j];

                    // 정답을 찾았을때 바로 나와버린다
                    if(childNodeValue == x2) {
                        level = level + 1;
                        break a;
                    }

                    // 각경우의 x좌표는 1 ~ 10000 사이여야하고, 방문 안한거일때 다시 큐에 넣는다
                    if (childNodeValue >= 1 && childNodeValue <= 10000 && visitArr[childNodeValue] == 0) {
                        visitArr[childNodeValue] = 1;
                        que.offer(childNodeValue);
                    }
                }
            }
            level++;    // 루프 돌때마다 레벨이 하나씩 증가한다
        }

        System.out.println(level);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();              // 현수의 위치
        x2 = sc.nextInt();              // 송아지의 위치
        DFS();
    }
}
