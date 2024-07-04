package chapter.book.자바알고리즘문제풀이입문.stack_queue.m05;

import java.util.Scanner;
import java.util.Stack;


/*
()(((()())(())()))(())
17

 */
public class Main_T {


    public int solution(String str){
   		int cnt=0;
   		Stack<Character> stack=new Stack<>();
   		for(int i=0; i<str.length(); i++){
   			if(str.charAt(i)=='(') stack.push('(');
   			else{
   				stack.pop();
   				if(str.charAt(i-1)=='(') cnt+=stack.size();
   				else cnt++;
   			}
   		}
   		return cnt;
   	}
   	public static void main(String[] args){
        Main_T T = new Main_T();
   		Scanner kb = new Scanner(System.in);
   		String str=kb.next();
   		System.out.println(T.solution(str));
   	}

}