package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m11_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int[][] map = new int[8][8];

    public static int count = -1;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static class Point {
        public int x;
        public int y;
        public int count;
        public Point parent;


        public Point(int x, int y, int count, Point parent) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.parent = parent;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", count=" + count +
                    ", parent=" + parent +
                    '}';
        }
    }

    /**
     * 넓이 우선 탐색
     */
    public static void BFS() {

        Queue<Point> queue = new LinkedList<>();


        queue.add(new Point(1, 1, 0, null));
        map[1][1] = 1;

        // 큐가 안비어있을때까지 동작
        while (!queue.isEmpty()) {

            Point p = queue.poll();
            // 방문했으므로 중복을 막기위해서 체크
            // 최단거리로 구할것이므로 해당 노드의 자식노드들은 여기로 오면안되니까
            map[p.x][p.y] = 1;
//            System.out.println("현재노드 => " + p);
            if (p.x == 7 && p.y == 7) {
                count = p.count;
                break;
            }



            // 상하좌우 체크
            for (int i = 0; i < 4 ; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                // 이동할 좌표가 갈수 있는 지점인지
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && map[nx][ny] == 0) {
                    Point np = new Point(nx, ny, (p.count+1), new Point(p.x, p.y));
//                    System.out.println("현재 노드에서 이동할 좌표 => " + np);
                    queue.add(np);
                }
            }
//            System.out.println();
        }

        System.out.println(count);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
               map[i][j]  = sc.nextInt();
            }
        }
        BFS();

    }
}

/*
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0


 */