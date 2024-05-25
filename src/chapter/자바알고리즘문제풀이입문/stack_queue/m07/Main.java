package chapter.자바알고리즘문제풀이입문.stack_queue.m07;

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
public class Main {


    /**
     *
     * @param p1 필수 과목 순서
     * @param p2 수업 설계
     */
    public void solution(String p1, String p2) {

        Queue<String> que = new LinkedList<>();
        Stream.of(p1.split("")).forEach((text) -> que.offer(text));

//        System.out.println("que = " + que);
//        System.out.println("p2 = " + p2);


        String[] subjectArr = p2.split("");
        for (String subject : subjectArr) {
            // 순환 글자가 que에 들어있냐?
            if (que.contains(subject)) {
                // 큐에 헤드가 현재 그 과목이냐
                if (que.peek().equals(subject)) {
//                    System.out.println("[일치함] subject = " + subject);
                    que.poll();
                } else {
                    break;
                }
            }
        }
//        System.out.println("que = " + que);

        if (que.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String p1 = kb.next();
        String p2 = kb.next();
        T.solution(p1, p2);
    }

}