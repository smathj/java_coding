package chapter.book.datastructure.ch5;

import java.util.Scanner;

public class Recur {

    // * 재귀함수
    public static void recur(int n) {

        if (n > 0) {
            recur(n - 1);           // 헤드 재귀
            System.out.println(n);
            recur(n - 2);           // 꼬리 재귀
        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        recur(x);

    }
}
