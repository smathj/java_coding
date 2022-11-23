package chapter.string.m05;

import java.util.Scanner;

// 단어 뒤집기
public class Main {

    public char[] solution(String text) {

        char[] charArray = text.toCharArray();

        int from = 0;
        int to = charArray.length -1;

        while (from < to) {
            char left = charArray[from];
            char right = charArray[to];

            char tmp = charArray[from];

            String start = String.valueOf(left);
            String end = String.valueOf(right);

            if(start.matches("^[a-zA-z]]*$") && end.matches("^[a-zA-z]]*$")) {
                // 원본데이터 수정시키기
                charArray[from] = charArray[to];
                charArray[to] = tmp;
            } else {
            }
            from++;
            to--;
//            answer.add()
        }
        return charArray;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String text = kb.nextLine();
        if(text.length() < 100) {
        System.out.println(T.solution(text));
        }
    }
}
