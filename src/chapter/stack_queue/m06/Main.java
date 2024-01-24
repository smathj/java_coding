package chapter.stack_queue.m06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/*
8 3

7
 */
public class Main {


    public void solution(Queue<Integer> que, Integer keyword) {

        System.out.println("que = " + que);
        System.out.println("keyword = " + keyword);


        int pollCount = 0;
        int resultSize = 0;





        // 게임횟수는 1명만 남겨야하니 전체인원 -1 회 진행
        int queSize = que.size();
        int testSize = que.size();
        for (int k = 0; k < queSize - 1; k++) {
            Queue<Integer> saveQue = new LinkedList<>();

            for (int i = 0; i < testSize; i++) {

                Integer poll = k == 0 ? que.poll() : saveQue.poll();
                int roopCount = i + 1;
                System.out.println("외치는 숫자 = " + roopCount + ", 왕자번호 = " + poll);

                if (roopCount != keyword) {
                    saveQue.offer(poll);
                } else {
                    System.out.println("⬆️ 제거");
                }

            }
            testSize = saveQue.size();


        }


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