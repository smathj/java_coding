package chapter.stack_queue.m08;

import java.util.*;
import java.util.stream.Collectors;


/*
5 2
60 50 70 80 90

3


6 3
70 60 90 60 60 60

4
 */
public class Main {


    public void solution(int[] memberArr, int index) {

        System.out.println(Arrays.toString(memberArr));
        System.out.println(index);


        int targetScore = memberArr[index];
        System.out.println("targetScore = " + targetScore);

        // Queue 초기화
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < memberArr.length; i++) {
            que.offer(memberArr[i]);
        }

        int pollCount = 0;
        int roopCount = 0;


        boolean flag = true;

        while (flag) {
            System.out.println("que = " + que);
            Integer score = que.poll();
            List<Integer> collect = que.stream().filter((roopScore) -> roopScore > score).collect(Collectors.toList());
            System.out.println("collect = " + collect);

            if (collect.size() > 0) {
//                System.out.println("더큰게 존재함, 갯수 = " + collect.size());
//                flag = false;
                que.offer(score);   // 제일 뒤로 보내기

            } else {
                pollCount++;

                // 이미 꺼낸게 맥스였던것
                if (score == targetScore) {
                    break;
                }
            }


        }

        System.out.println("pollCount = " + pollCount);





    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int index = kb.nextInt();

        int[] memberArr = new int[size];
        for (int i = 0; i < size; i++) {
            memberArr[i] = kb.nextInt();
        }

        T.solution(memberArr, index);
    }

}