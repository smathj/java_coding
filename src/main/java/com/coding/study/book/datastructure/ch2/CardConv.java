package chapter.book.datastructure.ch2;

import java.util.Scanner;

/**
 * 진수 변환
 * 입력 받은 10 진수를 2진수 ~ 36진수로 기수 변환하여 출력하는 프로그램
 */
public class CardConv {

    // 정수 값 x 를 r 진수로 변환하여 배열 d 에 아랫자리부터 넣어 두고 자릿수를 반환한다
    public static int cardConv(int x, int r, char[] d) {

        int digits = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";  // 36 진수까지 대비되는 문자열 준비

        do {
            d[digits++] = dchar.charAt(x % r);  // x를 r로 나눈 나머지
            x /= r;                             // x를 r로 나눈 몫
        } while (x != 0);


        // 역순 정렬
        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - 1 - i];
            d[digits - 1 - i] = t;
        }

        return digits;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no;     // 변환하는 정수
        int cd;     // 기수(진수)
        int dno;    // 변환 후의 자릿수
        int retry;  // 다시 한번?
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다");

        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);    // no를 cd진수로 변환

            System.out.println(cd + " 진수로");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다");

            System.out.print("한번 더 할까요? (1...예/0...아니요): ");
            retry = sc.nextInt();
        } while (retry == 1);


    }

}
