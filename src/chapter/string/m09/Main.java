package chapter.string.m09;

import java.util.Scanner;

// x >= 48 && x <= 57 <- 0 ~ 9 ( char ) 아스키넘버
class Main {
    public int solution(String s){
        //int answer=0;
        String answer="";
        for(char x : s.toCharArray()){
            //if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
            if(Character.isDigit(x)) answer+=x; // * Character.isDigit(x) 숫자인지 검사함
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}