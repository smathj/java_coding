package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m13_dfs_bfs;

import java.util.*;


//! BFS 로 풀었음
/*

7
1 1 0 0 0 1 0
0 1 1 0 1 1 0
0 1 0 0 0 0 0
0 0 0 1 0 1 1
1 1 0 1 1 0 0
1 0 0 0 1 0 0
1 0 1 0 1 0 0

5



10
0 0 0 0 1 0 0 1 1 1
0 1 0 0 1 0 0 0 1 0
1 0 1 0 0 0 0 0 0 1
0 1 1 0 0 0 1 0 0 1
1 0 1 1 1 0 0 0 1 1
0 0 0 0 1 0 0 1 1 1
0 0 1 1 1 0 0 0 0 0
0 1 0 0 1 0 0 0 0 0
1 0 0 0 0 1 1 0 1 0
1 0 0 0 1 1 1 0 0 1

5

 */
public class Main {

    public static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


    public static int[][] map = null;
    public static int[][] history = null;

    public static int count = 0;

    public static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};   // 행
    public static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};   // 열

    public static int N = 0;


    public static void BFS() {

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {
                if (map[i][j] == 1 && history[i][j] == 0) {

                    Point current = new Point(i, j);
//                    System.out.println("current = " + current);

                    history[i][j] = 1;
                    count++;
                    Queue<Point> que = new LinkedList<>();
                    que.offer(current);

                    while (!que.isEmpty()) {
                        Point centerPoint = que.poll();
                        for (int k = 0; k < 8; k++) {
                            int nx = centerPoint.x + dx[k];
                            int ny = centerPoint.y + dy[k];

                            if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && map[nx][ny] == 1 && history[nx][ny] == 0) {
                                history[nx][ny] = 1;
                                Point nearPoint = new Point(nx, ny);
//                                System.out.println("nearPoint = " + nearPoint);
                                que.offer(nearPoint);
                            }
                        }
                    }
//                    System.out.println("nearCount = " + nearCount);
//                    System.out.println();
                }

            }
        }
    }

    public static void main(String[] args) {


        /*
        입력이 주어질때...
        이전값과 현재값이 상하좌우로 연결되면
        이전값을 특정 컬렉션에 담는다...


         */
        Scanner sc = new Scanner(System.in);

        // ------------------------------------------
        // 이거 덕에.,. 반은 완전탐색 스럽게 풀수있다.
        // 3<=N<=20
        // ------------------------------------------
        N = sc.nextInt();

        map = new int[N + 1][N + 1];
        history = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                map[i][j] = sc.nextInt();
            }
        }


        BFS();
        System.out.println(count);

    }
}
