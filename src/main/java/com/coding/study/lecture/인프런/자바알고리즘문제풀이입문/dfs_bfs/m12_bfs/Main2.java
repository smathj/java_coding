package com.coding.study.lecture.인프런.자바알고리즘문제풀이입문.dfs_bfs.m12_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 시간복잡도를 최소화함
 */
public class Main2 {
    static int[][] container;
    static int M, N;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int notRipenCount = 0;


    public static int BFS() {
        int days = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            days++;

            // 큐에 익은거 처음에 2개 있음 , 2번 반복해야함
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();

                // 각 익은 토마토별로 네 방향에 덜익은 토마토를 큐에 담고, 컨테이너 상자에 체크표시
                for (int j = 0; j < 4; j++) {
                    int nx = current[0] + dx[j];
                    int ny = current[1] + dy[j];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && container[nx][ny] == 0) {
                        container[nx][ny] = 1;
                        queue.offer(new int[]{nx, ny});
                        notRipenCount--;
                    }
                }
            }
        }

        return notRipenCount == 0 ? days : -1;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        container = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                container[i][j] = Integer.parseInt(st.nextToken());
                if (container[i][j] == 1) {
                    // 큐에 익은 토마토를 담는다
                    queue.offer(new int[]{i, j});
                } else if (container[i][j] == 0) {
                    notRipenCount++;
                }
            }
        }

        System.out.println(BFS());
    }


}
