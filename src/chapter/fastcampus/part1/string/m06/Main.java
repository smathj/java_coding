package chapter.fastcampus.part1.string.m06;

import java.util.Scanner;


/*
-----------------------------------------------
6 4
4 1
8

0 1
-----------------------------------------------
6 4
5 3
4

3 1
 */
public class Main {


    public static class Point {
        private int x;
        private int y;
        private int maxX;
        private int maxY;

        private int increaseX = 1;
        private int increaseY = 1;


        public Point(int x, int y, int maxX, int maxY) {
            this.x = x;
            this.y = y;
            this.maxX = maxX;
            this.maxY = maxY;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }


        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", maxX=" + maxX +
                    ", maxY=" + maxY +
                    '}';
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }


        public boolean isXRound() {
            if(x == maxX) {
                return true;
            } else if (x == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isYRound() {
            if(y == maxY) {
                return true;
            } else if (y == 0) {
                return true;
            } else {
              return false;
            }
        }

        public void nextMove() {

            if (isXRound()) {
                increaseX = increaseX * -1;
            }

            if (isYRound()) {
                increaseY = increaseY * -1;
            }

            x = x + increaseX;
            y = y + increaseY;

            this.setX(x);
            this.setY(y);
        }
    }

    public static void solve(Point point, int hours) {

//        System.out.println("point = " + point);
//        System.out.println("hours = " + hours);
//        System.out.println();
//        System.out.println();

        for (int h = 1; h <= hours; h++) {
            point.nextMove();
//            System.out.println(point.nowPoint());
        }

        System.out.println(point.getX() + " " + point.getY());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxX = scanner.nextInt();
        int maxY = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int hours = scanner.nextInt();
        Point point = new Point(x, y, maxX, maxY);
        solve(point, hours);

    }

}
