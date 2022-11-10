package chapter.string.m01;

import java.util.Scanner;

public class Main {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        System.out.println(str + " " + t);
        // v1.
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        // v2.
        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);



        System.out.print(T.solution(str,c));
    }

}
