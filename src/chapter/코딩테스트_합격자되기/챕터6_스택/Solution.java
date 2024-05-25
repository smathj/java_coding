package chapter.코딩테스트_합격자되기.챕터6_스택;

import java.util.Scanner;
import java.util.Stack;


/**
 * ()()
 * (())()
 * )()(
 * (()(
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println(solution.solution(sc.nextLine()));
    }

    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(') {
                stack.push(c);
            // c == ')'
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character popChar = stack.pop();
                if (popChar == ')') {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
}