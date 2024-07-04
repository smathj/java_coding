package chapter.book.자바알고리즘문제풀이입문.stack_queue.m05;

import java.util.Scanner;
import java.util.Stack;


/*
()(((()())(())()))(())
17

 */
public class Main {


    public void solution(String n) {


        String[] split = n.split("");
        Stack<String> st = new Stack<>();
        int result = 0;
        for (int i = 0; i < split.length; i++) {
            String text = split[i];

            if (text.equals("(")) st.push(text);
                // ")" 일떄
            else {
                // "(" 레이저 일떄           ()
                if(split[i-1].equals("(")) {
                    st.pop();
                    result += st.size();
                // ")" 일때 특정파이프의 닫는  ))
                } else {
                    st.pop();
                    result++;
                }
            }

        }

        System.out.println(result);



    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
//        String n = "()(((()())(())()))(())";
        T.solution(n);
    }

}