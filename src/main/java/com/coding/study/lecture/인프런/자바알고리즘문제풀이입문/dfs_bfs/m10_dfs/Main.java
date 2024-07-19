package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m10_dfs;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 실패
 */
public class Main {

    public static int[][] map = new int[8][8];
    public static int[][] history = new int[8][8];

    public static int count = 0;

    public static class Point {

        public int x;
        public int y;
//        public int[][] history = new int[8][8];

        public Point back;


        /**
         * 왼쪽으로 이동가능한지
         */
        public boolean isLeft() {
            if (this.y - 1 > 7 || this.y - 1 < 1 || history[this.x][this.y - 1] == 1) {
                return false;
            }
            return map[this.x][(this.y - 1)] == 0;
        }


        /**
         * 오른쪽으로 이동가능한지
         */
        public boolean isRight() {
            if (this.y + 1 > 7 || history[this.x][this.y + 1] == 1) {
                return false;
            }
            return map[this.x][(this.y + 1)] == 0;
        }


        /**
         * 아래쪽으로 이동가능한지
         */
        public boolean isDown() {
            if (this.x + 1 > 7  || history[this.x + 1][this.y] == 1) {
                return false;
            }
            return map[this.x + 1][this.y] == 0;
        }


        /**
         * 위쪽으로 이동가능한지
         */
        public boolean isUp() {
            if (this.x - 1 < 1  || history[this.x - 1][this.y] == 1) {
                return false;
            }
            return map[this.x - 1][this.y] == 0;
        }


        /**
         * 행을 x, 열은 y
         * 왼쪽으로 이동  y 감소
         */
        public Point left() {
            history[this.x][this.y - 1] = 1;
            return new Point(this.x, this.y - 1, this);
        }


        /**
         * 오른쪽으로 이동
         */
        public Point right() {
            history[this.x][this.y + 1] = 1;
            return new Point(this.x, this.y + 1, this);
        }


        /**
         * 아래로 이동
         */
        public Point down() {
            history[this.x + 1][this.y] = 1;
            return new Point(this.x + 1, this.y, this);

        }


        /**
         * 위로 이동
         */
        public Point up() {
            history[this.x - 1][this.y] = 1;
            return new Point(this.x - 1, this.y, this);

        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(int x, int y, Point back) {
            this.x = x;
            this.y = y;
            this.back = back;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }


    }

    public static void DFS(Point p) {

        if (p.x > 7 || p.y > 7) {
            System.out.println("이거 유기 => " + p);
            return;
        }

        if (p.x == 7 && p.y == 7) {
            System.out.println("하나 도착");
            history[7][7] = 0;
            count++;
        } else {
            // 1. 오른쪽 가능
            if (p.isRight()) {
                Point np = p.right();
                DFS(np);
                history[p.x][p.y] = 0;
            }


            // 3. 아래로 가능
            if (p.isDown()) {
                Point np = p.down();
                DFS(np);
                history[p.x][p.y] = 0;
            }


            // 2. 위로 가능
            if (p.isUp()) {
                Point np = p.up();
                DFS(np);
                history[p.x][p.y] = 0;
            }

            // 4. 왼쪽가능
            if (p.isLeft()) {
                Point np = p.left();
                DFS(np);
                history[p.x][p.y] = 0;
            }

        }
    }
/*

0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0

*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
               map[i][j]  = sc.nextInt();
            }
        }

        Point startPoint = new Point(1, 1);
//        startPoint.history[1][1] = 1;
        //히스토리에 현재 위치를 마킹한다
        history[1][1] = 1;
        DFS(startPoint);


        System.out.println("count = " + count);
    }
}
