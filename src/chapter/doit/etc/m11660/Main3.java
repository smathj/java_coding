package chapter.doit.etc.m11660;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// ! 패캠 풀이
// ? 구간 합 구하기 5
/*
---------------------------------------------------
4 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4

27
6
64

 */
public class Main3 {



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 숫자의 갯수
        int N = sc.nextInt();

        // 정답 횟수
        int M = sc.nextInt();

        // 2차원 표 (행렬)
        int[][] arr = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 2차원 누적합 배열 (1,1) 기준으로 부터 해당 좌표까지
        int[][] acc = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + arr[i][j];
            }
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= M; i++) {
            int x1 = sc.nextInt();  // 행
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();  // 행
            int y2 = sc.nextInt();


            int result = acc[x2][y2] - acc[x1 - 1][y2] - acc[x2][y1 - 1] + acc[x1 - 1][y1 - 1];
            bw.write(result + "\n");


        }
        bw.flush();



    }


}
