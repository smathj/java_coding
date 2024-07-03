package chapter.book.이주만에_통과하는_알고리즘_코딩테스트.완전탐색.m14568;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 사람 3명 A,B,C
        int[] cntArr = new int[3];

        // 사탕의 갯수
        int candyCnt = sc.nextInt();

        int resultCount = 0;

        for (int a = 1; a < candyCnt; a++) {
            cntArr[0] = a;

            for (int  b = 1;  b < candyCnt;  b++) {
                cntArr[1] = b;

                for (int c = 1; c < candyCnt; c++) {
                    cntArr[2] = c;

                    boolean flag = true;

                    // 남는 사탕 체크
                    if ((cntArr[0] + cntArr[1] + cntArr[2]) != candyCnt) {
                        flag = false;
                    }

                    // C는 B 보다 2개 이상
                    if (!(cntArr[2] >= cntArr[1] + 2)) {
                        flag = false;
                    }

                    // Zero
                    if (cntArr[0] == 0 || cntArr[1] == 0 || cntArr[2] == 0) {
                        flag = false;
                    }

                    // A 는 홀수개면 안된다
                    if (cntArr[0] % 2 != 0) {
                        flag = false;
                    }

                    if (flag) {
                        resultCount++;
                    }


                }
            }
        }
        System.out.println(resultCount);





    }
}
