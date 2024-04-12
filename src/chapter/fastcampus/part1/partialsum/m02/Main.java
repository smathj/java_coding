package chapter.fastcampus.part1.partialsum.m02;

import java.io.*;

public class Main {
    static int arr[][] = null;
    static int accRow[][] = null;

    /**
     *
     * @param x1 행
     * @param y1 열
     *
     * @param x2 행
     * @param y2 열
     * @return
     */
    public static int fnMethod(int x1, int y1, int x2, int y2) {
        int temp = 0;

        // 행
        for (int x = x1; x <= x2; x++) {
            temp += accRow[x][y2] - accRow[x][y1 - 1];
        }
        return temp;
    }




    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] NM = br.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        // 입력배열
//        int[][] arr = new int[N+1][N+1];
        arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            String[] numTextArr = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(numTextArr[j-1]);
            }
        }



        // 누적합 배열
//        int[][] accRow = new int[N+1][N+1];
        accRow = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // 행별 누적합
                accRow[i][j] = accRow[i][j - 1] + arr[i][j];
            }
        }


        for (int i = 0; i < M; i++) {
            String[] pArr = br.readLine().split(" ");
            int result = fnMethod(Integer.parseInt(pArr[0]), Integer.parseInt(pArr[1]), Integer.parseInt(pArr[2]), Integer.parseInt(pArr[3]));
            bw.write(result + "\n");
        }

        bw.flush();


    }
}
