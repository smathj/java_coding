package chapter.fastcampus.part1.ch6_prefixsum.m02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int M = sc.nextInt();

        int[][] arr = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        // 누적합 배열
        int[][] acc = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                acc[i][j] =
                        // 위 사각 영역 누적합
                        acc[i - 1][j]
                        // 왼쪽 사각 영역 누적합
                      + acc[i][j - 1]
                        // 공통 부분 사각 영역 중복 제거
                      - acc[i - 1][j - 1]
                        // 현재 i,j의 값
                      + arr[i][j];
            }
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= M; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();


            //? 특정 영역의 부분합 구하기
            int result =
                    // 제일 큰영역의 누적합
                    acc[x2][y2]
                    // 왼쪽 영역 빼주기
                  - acc[x1 - 1][y2]
                    // 위쪽 영역 빼주기
                  - acc[x2][y1 - 1]
                    // 두번 빼진거 한번 다시 더해주기
                  + acc[x1 - 1][y1 - 1];
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
