package chapter.book.datastructure.ch5;

import chapter.book.datastructure.ch4.IntStack;

import java.util.Scanner;

public class RecurX2 {


    /**
     * 재귀함수
     * ! 헤드 재귀 제거
     */
    public static void recur(int n) {

        IntStack s = new IntStack(n);

        while (true) {

            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }

            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;

        }
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();

        recur(x);

    }
}
