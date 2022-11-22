package chapter.string.m04;

import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기
public class Main2 {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            char[] s = x.toCharArray();

            int lt = 0;
            int rt = x.length() - 1;    // 마지막 글자의 인덱스로 표현하기위해 -1

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++) {
            str[i] = kb.next();
        }

        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
