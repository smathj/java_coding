package chapter.inflearn.string.m02;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        
        for (char x : str.toCharArray()) {
            // 소문자인경우
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            // 대문자인경우
            }  else {
                answer += Character.toLowerCase(x);
            }
        }
        // 아스키넘버 대문자 65 ~ 90 , 소문자 97 ~ 122 서로 32차이남
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
