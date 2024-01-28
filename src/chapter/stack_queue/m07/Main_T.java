package chapter.stack_queue.m07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;


/*
CBA
CBDAGE

YES


AKSDE
KSDEYBCEGS

NO
 */
public class Main_T {


    /**
     * @param p1 필수 과목 순서
     * @param p2 수업 설계
     */
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);
        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }


    public static void main(String[] args) {
        Main_T T = new Main_T();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }

}