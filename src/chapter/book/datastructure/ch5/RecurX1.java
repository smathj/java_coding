package chapter.book.datastructure.ch5;

import java.util.Scanner;

public class RecurX1 {


    /**
     * 재귀함수
     * ! 꼬리 재귀 제거
     */
    public static void recur(int n) {

        while (n > 0) {
            recur(n - 1);           // 헤드 재귀
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        recur(x);

    }
}
