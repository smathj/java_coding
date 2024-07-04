package chapter.book.이주만에_통과하는_알고리즘_코딩테스트.완전탐색.m19532;

import java.util.Scanner;

public class Main {


    /**
     * 직선을 처음으로 표현했다
     */
    public static void myMethod(int a, int b, int c, int d, int e , int f) {

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((a * x) + (b * y) == c && (d * x) + (e * y) == f) {
                    System.out.println(x + " " + y);
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        myMethod(a,b,c,d,e,f);



    }
}
