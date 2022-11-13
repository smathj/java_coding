package chapter.string.m02;

import java.util.Scanner;

public class Main02 {

    public String solution(String str) {
        String answer = "";
        
        for (char x : str.toCharArray()) {
            // 소문자인경우
            if (x >= 97 && x <= 122) {
                answer += (char)(x - 32);
            // 대문자인경우
            }  else {
                answer += (char)(x + 32);
            }
        }
        // 아스키넘버 대문자 65 ~ 90 , 소문자 97 ~ 122 서로 32차이남
        return answer;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
