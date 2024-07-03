package chapter.book.자바알고리즘문제풀이입문.string.m06;

import java.util.Scanner;


// * 중복단어 제거 하기
// ksekkset
// kset
public class Main {

    // me.
    public String solution2(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (answer.indexOf(str.charAt(i)) < 0) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    // t1.
    public String solution(String str) {
        String answer = "";

        String[] wordArr = str.split("");
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution2(str));
    }
}
