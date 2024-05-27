package chapter.이주만에_통과하는_알고리즘_코딩테스트.완전탐색.m1816;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] arr = new long[N];
        String[] result = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < N; i++) {
            long value = arr[i];

            for (int num = 2; num <= 1_000_000; num++) {

                /*
                백만 까지 , 약수를 발견하면 그건 적절한 비밀번호가 아니다
                 */
                if (value % num == 0) {
                    result[i] = "NO";
                    break;
                }

                /*
                여기로 왓다는 것은 백만 이하에서 약수가 발견 안되었다는 것이다
                그렇다면 백만보다 큰 숫자에서는 약수가 언젠간 발견된다
                 */
                if (num == 1_000_000) {
                    result[i] = "YES";
                }
            }
        }


        for (String text : result) {
            System.out.println(text);
        }

    }
}
