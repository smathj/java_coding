package chapter.quiz.stack.main;

import chapter.quiz.stack.LinkedListStack;

public class Main {
    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        System.out.println("스택이 비었나요 ? : " + (stack.empty() ? "예" : "아니요"));
        System.out.println("갯수(0) : " +  stack.size());
        System.out.println();


        stack.push("1");
        System.out.println("1을 푸쉬합니다");
        System.out.println("갯수(1) : " +  stack.size());
        System.out.println("contain(2)? : " + stack.contain("2"));
        System.out.println("스택이 비었나요 ? : " + (stack.empty() ? "예" : "아니요"));
        System.out.println();

        stack.push("2");
        System.out.println("2을 푸쉬합니다");
        System.out.println("갯수(2) : " +  stack.size());
        System.out.println();

        stack.push("3");
        System.out.println("3을 푸쉬합니다");
        System.out.println("갯수(3) : " +  stack.size());
        System.out.println();


        System.out.println("contain(1)? : " + stack.contain("1"));
        System.out.println("contain(2)? : " + stack.contain("2"));
        System.out.println("contain(3)? : " + stack.contain("3"));
        System.out.println();


        System.out.print("pop 합니다 : ");
        System.out.println(stack.pop());
        System.out.println();

        System.out.print("pop 합니다 : ");
        System.out.println(stack.pop());
        System.out.println();

        System.out.print("pop 합니다 : ");
        System.out.println(stack.pop());
        System.out.println();

        System.out.println("갯수(0) : " +  stack.size());
        System.out.println();

        System.out.println("스택이 비었나요 ? : " + (stack.empty() ? "예" : "아니요"));
        System.out.println();


    }
}
