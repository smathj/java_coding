package chapter.book.자바알고리즘문제풀이입문.stack_queue.m01;

import java.util.Scanner;
import java.util.Stack;

/*
(()(()))(()

NO

)(())(
NO

((())())())(
NO
 */
public class Main_T {
	public String solution(String str){
		String answer="YES";
		Stack<Character> stack=new Stack<>();
		for(char x : str.toCharArray()){

			if( x=='(' ) stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				/*
				이 스택의 맨 위에 있는 개체를 제거하고 해당 개체를 이 함수의 값으로 반환합니다.
				반환: 이 스택의 맨 위에 있는 개체( Vector 개체의 마지막 항목)입니다.
				던지기: EmptyStackException – 이 스택이 비어 있는 경우.
				 */
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

    public static void main(String[] args) {
        Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));

    }
}