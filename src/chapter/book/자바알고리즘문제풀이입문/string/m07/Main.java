package chapter.book.자바알고리즘문제풀이입문.string.m07;

import java.util.Scanner;


// * 회문 문자열
// gooG
// YES
public class Main {

    // me.
    public String solution2(String str) {

        String reverseStr = "";
        String[] split = str.split("");
        for (int i = split.length - 1; i >= 0; i--) {
//            System.out.println(i + " : " + split[i]);
            reverseStr += split[i].toLowerCase();
        }

        if (str.toLowerCase().equals(reverseStr)) {
            return "YES";
        } else {
            return "NO";
        }
    }


/*
    // t1.
    public String solution(String str){
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
        }
        return answer;
    }
    // t2.
    public String solution(String str){
        String answer="NO";
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }
*/

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution2(str));
    }
}
