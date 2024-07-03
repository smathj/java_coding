package chapter.book.자바알고리즘문제풀이입문.string.m11;

import java.util.Scanner;

public class Main_RE {
    public String solution(String s){

        String answer = "";
        int cnt = 1;

        s = s + " ";

        for (int i = 0; i < s.length() - 1; i++) {

            // 현재, 다음이 같은지 체크
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            }  else {
                answer += s.charAt(i);
                // cnt가 1이냐 아니냐
                if (cnt > 1) {
                    answer += cnt;
                } else {
                    cnt = 1;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
