package chapter.datastructure.ch5;

import java.util.Scanner;

/**
 * 유클리드 호제법으로 최대공약수를 구한다.
 */
public class EuclidGCD {

    public static int gcd(int x, int y) {
        // ! 기저 조건
        if (y == 0) {
            return x;
        } else {
            /**
             * 항상 y 를 가로로 보낸다... 이게 핵심같은데
             * 이러면 두번쨰 파라미터가 첫번쨰 파라미터 보다 작게되어
             * 기저조건을 두번째 파라미터로만 제한 하면 된다
             */
            return gcd(y, x % y);

        }
    }

    public static void main(String[] args) {

        // 표준입력
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다");

        System.out.print("정수를 입력하세요: ");
        int x = stdIn.nextInt();
        System.out.print("정수를 입력하세요: ");
        int y = stdIn.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + "입니다");

    }
}
