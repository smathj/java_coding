package chapter.string.m12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {
    public String solution(int count, String param){

        String answer = "";
        String word = "";
        List<String> wordList = new ArrayList<>();
        
        // [#] : 35 => 1
        // [*] : 42 => 0
        for (int i = 0; i < param.length(); i++) {
            char charValue = (char) param.charAt(i);
            int intValue = (int) charValue;
            if (intValue == 35) {
                word += "1";
            } else if (intValue == 42) {
                word += "0";
            }

            if (word.length() == 7) {
                wordList.add(word);
                word = "";
            }
        }


        for (String password : wordList) {

            int binaryValue = Integer.parseInt(password, 2);
            char passwordChar = (char) binaryValue;
            answer += String.valueOf(passwordChar);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int count=kb.nextInt();   // 4, 4 x 7 = 28
        String str=kb.next();   // 4, 4 x 7 = 28
        System.out.println(T.solution(count, str));

    }
}