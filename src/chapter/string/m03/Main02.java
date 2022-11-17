package chapter.string.m03;

import java.util.Scanner;

public class Main02 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);   // 나머지부분 부터 끝까지
        }

        // 마지막 단어 처리
        if(str.length() > m ) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
