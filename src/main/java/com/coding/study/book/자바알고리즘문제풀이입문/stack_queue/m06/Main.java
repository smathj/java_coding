package chapter.book.자바알고리즘문제풀이입문.stack_queue.m06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/*
8 3

7
 */
public class Main {


    public void solution(Queue<Integer> que, Integer keyword) {
//        System.out.println("que = " + que);
//        System.out.println("keyword = " + keyword);
        while (que.size() != 1) {
//            System.out.println("[while] que = " + que);
            for (int pollCount = 1; pollCount <= keyword; pollCount++) {
                Integer princeNum = que.poll(); // 왕자 하나 꺼낸다(꺼내는 횟수가 왕자의 순서)
                if (pollCount != keyword) {
                    que.offer(princeNum);
                }
            }
        }
//        System.out.println("[end] que = " + que);
        System.out.println(que.poll());
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();

        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= count; i++) {
            que.offer(i);
        }

        int keyword = kb.nextInt();
        T.solution(que, keyword);
    }

}