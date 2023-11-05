package chapter.stack_queue.m01;

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
			if(x=='(') stack.push(x);
			else{
				if(stack.isEmpty()) return "NO";
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