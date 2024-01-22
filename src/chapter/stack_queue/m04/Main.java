package chapter.stack_queue.m04;

import java.util.*;


/*
352+*9-
12

 */
public class Main {


    //  3*(5+2)-9 로 만들어야해
    public void solution(String n) {



        Stack<Integer> st = new Stack<>();
        String tmp = "";

        String[] split = n.split("");
        for (String s : split) {

            boolean isNumber = s.matches("\\d");

            if (isNumber) {
                st.push(Integer.parseInt(s));
            } else {
//                System.out.println("연산자 기호 = " + s);
                Integer rt = st.pop();
                Integer lt = st.pop();
                int size = st.size();
//                System.out.println("스택 사이즈 = " + size);
                Integer result = null;
                if(s.equals("+")) result = lt + rt;
                if(s.equals("-")) result = lt - rt;
                if(s.equals("*")) result = lt * rt;
                if(s.equals("/")) result = lt / rt;
                st.push(result);
//                System.out.println("현재스택상황 = " + st);

            }
        }

        Integer result = st.pop();
        System.out.println(result);

    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String n = kb.next();
        T.solution(n);
    }

}