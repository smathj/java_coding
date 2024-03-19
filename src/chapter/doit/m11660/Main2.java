package chapter.doit.m11660;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// ! 첫번째 구간 합으로 맞춤
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
public class Main2 {



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 숫자의 갯수
        int N = sc.nextInt();

        // 정답 횟수
        int M = sc.nextInt();

        // 2차원 표 (행렬)
//        int[][] arr = new int[N + 1][N + 1];
        int[][] accRow = new int[N + 1][N + 1]; // 행열 로우 합

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int v = sc.nextInt();
//                arr[i][j] = v;
//                accRow[i][j] = accRow[i][j - 1] + arr[i][j];
                accRow[i][j] = accRow[i][j - 1] + v;
            }
        }

//        System.out.println(Arrays.deepToString(sumArr));
//        System.out.println(Arrays.deepToString(accRow));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= M; i++) {
            int x1 = sc.nextInt();  // 행
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();  // 행
            int y2 = sc.nextInt();

            int sum = 0;
            for (int x = x1; x <= x2; x++) {
                sum += accRow[x][y2] - accRow[x][y1 - 1];
            }
            bw.write(String.valueOf(sum) + "\n");

//            System.out.println(sum);

        }
        bw.flush();



    }


}
