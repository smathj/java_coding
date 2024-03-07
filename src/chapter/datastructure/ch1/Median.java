package chapter.datastructure.ch1;

import java.util.Scanner;

public class Median {

    public static int md3(int a, int b, int c) {

        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수의 중앙값을 구합니다");
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();

        System.out.println("중앙값은 " + md3(a,b,c) + "입니다");

    }

}
