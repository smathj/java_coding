package chapter.book.doit.etc.m11659;


import java.util.Scanner;

// ! 구간 합 구하기 4
/*
---------------------------------------------------
5 3
5 4 3 2 1
1 3
2 4
5 5

12
9
1

 */
public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자의 갯수
        int N = sc.nextInt();

        // 정답 횟수
        int M = sc.nextInt();

        // 숫자 배열
        int[] arr = new int[N + 1];

        // 구간합 Sn
        int[] sumArr = new int[N + 1];
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();  // 입력
            sum += arr[i];
            sumArr[i] = sum;
        }

//        System.out.println("N = " + N);
//        System.out.println("M = " + M);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(sumArr));


        // 구간 케이스
        for (int i = 1; i <= M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
//            System.out.println("from = " + from);
//            System.out.println("to = " + to);
            System.out.println(sumArr[to] - sumArr[from - 1]);
        }



    }


}
