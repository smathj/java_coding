package chapter.lecture.패스트캠퍼스.part1.ch4_bruteforce.m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 11068
 * 회문인 수
 */
public class Main {
    static String[] valueArr = null;

    private static void makeJinBub(int jinbub) {
        valueArr = new String[jinbub];

        for (int i = 0; i < jinbub; i++) {
            if (i >= 10) {
                valueArr[i] = String.valueOf((char) (65 + i - 10));
            } else {
                valueArr[i] = String.valueOf(i);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int jinbub = 64;
        makeJinBub(jinbub); // 64 진법의 숫자 생성기

        // 테스트 케이스 반복문
        for (int i = 0; i < N; i++) {

            int num = sc.nextInt();

            int result = 0;
            // num을 2진법 부터 64진법으로 출력한다
            for (int j = 2; j <= 64; j++) {
                result = printJinbub(num, j);
                if(result == 1) break;
            }

            if (result == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }


    private static int printJinbub(int num, int jinbub) {
        int targetJinbub = jinbub;
        int targetNumber = num;

        int tmp = targetNumber;    // 몫 임시변수
        List<String> restList = new ArrayList<>();
        while (true) {
            if (tmp == 0) {
                break;
            }
            int v1 = tmp;
            tmp = v1 / targetJinbub;
//            System.out.println("tmp = " + tmp);
            // 나머지
            int rest = v1 % targetJinbub;
            restList.add(valueArr[rest]);

        }

//        System.out.println("restList = " + restList);

        String reverseText = String.join("", restList);
        Collections.reverse(restList);
        String pureText = String.join("", restList);

        if (pureText.equals(reverseText)) {
//            System.out.println("회문인 수가 맞습니다");
            return 1;
        } else {
//            System.out.println("회문인 수가 아닙니다");
            return 0;
        }

    }

}
