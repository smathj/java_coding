package chapter.book.자바알고리즘문제풀이입문.string.m11;

import java.util.Scanner;

public class Main_T {
    public String solution(String s){

        String answer="";

        s=s+" ";

        int cnt=1;

        for(int i=0; i<s.length()-1; i++){

            // * 현재와 다음을 비교
            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;  // * 같은문자가 연속한다면 cnt를 ++
            }
            else {
                // * 다른문자가 나왓다면 answer에 글자 추가
                answer+=s.charAt(i);
                if(cnt>1) {
                    // * 1보다 큰수일때는 글자를 붙인다
                    answer+=String.valueOf(cnt);
                }
                // * 아닌경우에는 (1일때) 그냥 cnt 초기화후 다음 진행
                cnt=1;
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