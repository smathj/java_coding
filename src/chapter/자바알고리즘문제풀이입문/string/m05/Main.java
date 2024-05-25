package chapter.자바알고리즘문제풀이입문.string.m05;

import java.util.Scanner;


// 단어 뒤집기
public class Main {

    public String solution(String text) {
        String answer;
        char[] charArray = text.toCharArray();

        int from = 0;
        int to = charArray.length -1;

        while (from < to) {
            char left = charArray[from];
            char right = charArray[to];

            String start = String.valueOf(left);
            String end = String.valueOf(right);

            if(!start.matches("^[a-zA-z]]*$")) {
//            if(!Character.isAlphabetic(left)) {
                from++;
            } else if(!end.matches("^[a-zA-z]]*$")) {
//            } else if(!Character.isAlphabetic(right)) {
                to--;
            } else {
                char tmp = charArray[from];
                charArray[from] = charArray[to];
                charArray[to] = tmp;
                from++;
                to--;
            }
        }
        answer = String.valueOf(charArray);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String text = kb.next();
        System.out.println(T.solution(text));
    }
}
