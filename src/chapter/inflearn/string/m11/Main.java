package chapter.inflearn.string.m11;

import java.util.Scanner;


class Main {
    public String solution(String param){
        param = param.toUpperCase();

        StringBuilder result = new StringBuilder();
        String beforeStr = "";
        int addCount = 0;

//        System.out.println("param = " + param);

        char[] words = param.toCharArray();

        for (int i = 0; i < words.length ; i++) {
            if (i == 0) {
                result.append(words[i]);
                beforeStr = String.valueOf(words[i]);
                addCount++;
            } else {

                // 글자가 같으면, 숫자를 증가시킴
                if (beforeStr.equals(String.valueOf(words[i]))) {
                    addCount++;

                    if(i == words.length -1 && addCount != 1) result.append(addCount);    // 이전단어의 숫자를 붙여줌
                // 글자가 다르면, 숫자를 붙여주고 초기화함
                } else {
                    if(addCount != 1 ) result.append(addCount);    // 이전단어의 숫자를 붙여줌
                    result.append(words[i]);
                    addCount = 1;               // 숫자 초기화
                    beforeStr = String.valueOf(words[i]);   //

                    if(i == words.length -1 && addCount != 1) result.append(addCount);    // 이전단어의 숫자를 붙여줌
                }


            }

        }
//        System.out.println("result.toString() " + result.toString());


        return result.toString();
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));

    }
}