package chapter.stack_queue.m04;

import java.util.Scanner;
import java.util.Stack;

public class Main_T {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Main_T T = new Main_T();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
