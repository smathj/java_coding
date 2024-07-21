package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m12_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[][] container = null;
    static int[][] history = null;

    static int dayCount = -1;
    static int notRipenCount = 0;
    static int checkCount = 0;
    static int M;
    static int N;

    public static class Tomato {
        public int x;
        public int y;
        public int status;



        public Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Tomato(int x, int y, int status) {
            this.x = x;
            this.y = y;
            this.status = status;
        }

        @Override
        public String toString() {
            return "Tomato{" +
                    "x=" + x +
                    ", y=" + y +
                    ", status=" + status +
                    '}';
        }
    }

    /**
     * 익은토마토 찾기
     */
    public static void findRipenTomato(Queue<Tomato> que) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 익은 토마토 이면서 아직 처리 안한 토마토 => 처음 만나는 토마토
                if (container[i][j] == 1 && history[i][j] == 0) {
//                    System.out.println(i + "," + j + " => 익었음");
                    Tomato tomato = new Tomato(i, j, 1);
                    // 히스토리에 이 토마토 체크
                    history[i][j] = 1;
                    que.offer(tomato);
                }
            }
        }
    }

    public static void BFS() {

        Queue<Queue<Tomato>> outerQue = new LinkedList<>();
        Queue<Tomato> innerQue = new LinkedList<>();

        findRipenTomato(innerQue);
        outerQue.offer(innerQue);
//        System.out.println("outerQue = " + outerQue);
//        System.out.println();

        while (!outerQue.isEmpty()) {
            dayCount++;

//            System.out.println("outerQue.peek().size() = " + outerQue.peek().size());
//            System.out.println();

            Queue<Tomato> que = outerQue.poll();

            while (!que.isEmpty()) {

                // 익은 토마토
                Tomato rt = que.poll();
//                System.out.println("현재 익은 토마토 = " + rt);

                // 익은 토마토 상,하,좌,우 의 토마토 익은 토마토로 만들기
                //? 상
                if(rt.x -1 >= 0 && container[rt.x - 1][rt.y] == 0) {
//                    System.out.println("위쪽 토마토가 존재함 => (" + (rt.x - 1) + ", " + rt.y + ")");
                    container[rt.x - 1][rt.y] = 1;
                    checkCount++;
                }
                // 하
                if(rt.x + 1 < N  && container[rt.x + 1][rt.y] == 0) {
//                    System.out.println("아래쪽 토마토가 존재함 => (" + (rt.x + 1) + ", " + rt.y + ")");
                    container[rt.x + 1][rt.y] = 1;
                    checkCount++;
                }

                //! 좌
                if(rt.y - 1 >= 0  && container[rt.x][rt.y - 1] == 0) {
//                    System.out.println("왼쪽 토마토가 존재함 => (" + (rt.x) + ", " + (rt.y - 1) + ")");
                    container[rt.x][rt.y - 1] = 1;
                    checkCount++;
                }
                //! 우
                if(rt.y + 1 < M  && container[rt.x][rt.y + 1] == 0) {
//                    System.out.println("오른쪽 토마토가 존재함 => (" + (rt.x) + ", " + (rt.y + 1) + ")");
                    container[rt.x][rt.y + 1] = 1;
                    checkCount++;
                }

            }


            Queue<Tomato> storeQue = new LinkedList<>();
            findRipenTomato(storeQue);
            if (storeQue.isEmpty()) {
                break;
            } else {
                outerQue.offer(storeQue);
            }
//            System.out.println();

        }

//        System.out.println("notRipenCount = " + notRipenCount);
//        System.out.println("checkCount = " + checkCount);

        if (notRipenCount == checkCount) {
            System.out.println(dayCount);
        } else {
            System.out.println(-1);
        }


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        M = Integer.parseInt(split[0]);   // 가로 6
        N = Integer.parseInt(split[1]);   // 세로 4

        container = new int[N][M];  // [4 x 6] +1
        history = new int[N][M];  // [4 x 6] +1

        int ripenCount = 0;

        for (int i = 0; i < N; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
            notRipenCount += (int) Arrays.stream(array).filter((value) -> value == 0).count();
            ripenCount += (int) Arrays.stream(array).filter((value) -> value == 1).count();
            container[i] = array;
        }


        if (ripenCount == M * M) {
            System.out.println(0);

        } else {
            BFS();

        }




    }

}
