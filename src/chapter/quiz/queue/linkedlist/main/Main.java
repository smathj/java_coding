package chapter.quiz.queue.linkedlist.main;

import chapter.quiz.queue.linkedlist.LinkedListQueue;

public class Main {

    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.printAll();

        System.out.println(String.format("첫 번째 값을 가져옵니다 => %s", queue.dequeue()));
        System.out.println(String.format("두 번째 값을 가져옵니다 => %s", queue.dequeue()));
        System.out.println(String.format("세 번째 값을 가져옵니다 => %s", queue.dequeue()));
        System.out.println("------------------------------");
        queue.printAll();
        System.out.println(String.format("큐의 현재 값입니다 => %s", queue.peek()));
        System.out.println("------------------------------");
        System.out.println(String.format("네 번째 값을 가져옵니다 => %s", queue.dequeue()));
        System.out.println(String.format("다섯 번째 값을 가져옵니다 => %s", queue.dequeue()));

        if (queue.empty()) {
            System.out.println("------------------------------");
            System.out.println("큐가 비었습니다");
        }

    }
}
