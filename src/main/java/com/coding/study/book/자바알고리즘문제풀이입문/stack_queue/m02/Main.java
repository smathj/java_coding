package chapter.book.자바알고리즘문제풀이입문.stack_queue.m02;

import java.util.*;

/*
(A(BC)D)EF(G(H)(IJ)K)LM(N)

EFLM
 */
public class Main {
    public String solution(String str) {

		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == ')') {
				// 쭉 제거
				// 기저조건 : stack.pop() 이 '(' 를 뽑으면 멈춘다
				while (stack.pop() != '(') {

				}
			} else {
				stack.push(x);	// '(' 도 같이들어감
			}


		}
		for (Character character : stack) {
			answer += character;
		}

		return answer;


	}

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

		String text = kb.next();

		System.out.println(T.solution(text));


    }
}