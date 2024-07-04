package chapter.book.doit.etc.m11660;


import java.util.Scanner;

// ! 시간초과
// ! 구간 합 구하기 5
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
public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자의 갯수
        int N = sc.nextInt();

        // 정답 횟수
        int M = sc.nextInt();

        // 2차원 표 (행렬)
//        int[][] arr = new int[N + 1][N + 1];
        int[][] sumArr = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                int v = sc.nextInt();
                sum += v;
                sumArr[i][j] = sum;
//                arr[i][j] = v;
            }
        }

//        System.out.println(Arrays.deepToString(sumArr));

        for (int i = 1; i <= M; i++) {
            int x1 = sc.nextInt();  // 행
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();  // 행
            int y2 = sc.nextInt();

            int answer = 0;
            for (int x = x1; x <= x2; x++) {
                answer += sumArr[x][y2] - sumArr[x][y1 - 1];
            }
            System.out.println(answer);
/*
            if (x1 == x2 && y1 == y2) {
                System.out.println(sumArr[x1][y2] - sumArr[x1][y1 - 1]);
            } else {
                int answer = 0;
                for (int x = x1; x <= x2; x++) {
                    answer += sumArr[x][y2] - sumArr[x][y1 - 1];
                }
                System.out.println(answer);
//                System.out.println(sumArr[x1][y2] - sumArr[x1][y1-1] + (sumArr[x2][y2] - sumArr[x2][y1-1]));
            }
*/
        }



    }


}
