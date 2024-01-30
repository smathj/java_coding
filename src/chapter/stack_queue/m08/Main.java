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


    /**
     * 전반적인 아이디어
     * poll 하고 offer 를 한다면 x 축 평행이동
     * poll 만 한다면 전체사이즈 -1 해서 초기화
     *
     * 뭔가 맵이라든가 클래스로 객체 시킬 수 있을 건데, pure 하게 품
     */
    public void solution(int[] memberArr, int index) {

        System.out.println(Arrays.toString(memberArr));
        System.out.println("최초 타겟의 인덱스 = " + index);


        // Queue 초기화
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < memberArr.length; i++) {
            que.offer(memberArr[i]);
        }

        int pollCount = 0;


        boolean flag = true;


        System.out.println();
        System.out.println();


        while (flag) {
            System.out.println();
            System.out.println();


            System.out.println("que = " + que);
            Integer score = que.poll();
            System.out.println("큐에서 하나를 꺼내본다 => " + score);

            // 나를제외한 큐에서 크거나 같은거 찾는다
            List<Integer> upList = que.stream().filter((roopScore) -> roopScore > score).collect(Collectors.toList());

            System.out.println("upList.size() = " + upList.size());


            if (index > 0) {
                // ! 자리바꾸기
                // 타겟이 맨앞이 아니고 최대값이 아닐때 => 인덱스 감소
                if (upList.size() > 0) {
                    que.offer(score);
                    index--;
                    System.out.println("que = " + que);
                    System.out.println("한칸 당겨진다");

                // ? poll 현행 유지
                // 꺼낸게 최대값이고 타겟이 아님 => index--
                } else if (upList.size() == 0) {
                    index--;
                    pollCount++;
                    System.out.println("que = " + que);
                    System.out.println("pollCount++ = " + pollCount);

                }
                System.out.println("index = " + index);
                continue;
            }

            if (index == 0) {
                // 내가 맨앞이지만, 최대값이 아니므로, 맨 뒤로간다
                if (upList.size() > 0) {

                    que.offer(score);
                    index = que.size() - 1;
                    System.out.println("다시 맨뒤에 넣는다 [2]");
                    System.out.println("que = " + que);
                    System.out.println("index = " + index);

                // 내가 맨앞이자, 나보다 큰값이 없다 => 이때의 pollCount가 타겟의 순서이다
                } else if (upList.size() == 0) {
                    System.out.println("여기다");
                    System.out.println("que = " + que);
                    System.out.println("index = " + index);
                    pollCount++;
                    break;
                }
            }

        }

        System.out.println(pollCount);



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