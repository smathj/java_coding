package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m07_dfs;

import java.util.Scanner;

public class Main {

    static int N;
    static int R;

    static int[][] arr;


    /**
     * 조합의수
     * @param n 서로다른 n 개
     * @param r r 개를 뽑는다
     */
    public static int 조합(int n, int r) {


        // 3C3 = 1 같은 경우
        if (n == r) {
            if (arr[n][r] == 0) {
                return arr[n][r] = 1;
            }
            return arr[n][r];

        // 3C1 = 3 같은 경우
        } else if (n != 1 && r == 1) {
            if (arr[n][r] == 0) {
                 return arr[n][r] = n;
            }
            return arr[n][r];

        // 5C3 = 10 같은 경우
        } else {
//            return 조합(n - 1, r - 1) + 조합(n - 1, r);
//            int result = 조합(n - 1, r - 1) + 조합(n - 1, r);
//            arr[n][r] = result;
//            return arr[n][r];
            return arr[n][r] = 조합(n - 1, r - 1) + 조합(n - 1, r);

        }


    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();   // 서로다른 n 개
        R = sc.nextInt();   // r 개를 뽑는 => 조합의 수



        // n 에 대한 r 매핑 = 조합의 수 결과값
        arr = new int[N+1][N+1];

        // nCr = n-1 C r-1 + n-1 C r
        int result = 조합(N, R);

        System.out.println(result);


    }

}
