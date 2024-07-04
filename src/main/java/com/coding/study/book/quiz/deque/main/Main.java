package chapter.book.quiz.deque.main;

import chapter.book.quiz.deque.LinkedListDeque;

public class Main {

    public static void main(String[] args) {

        LinkedListDeque deque = new LinkedListDeque();

        deque.addFirst("100");
        deque.addFirst("200");
        deque.addFirst("300");
        deque.addLast("400");
        deque.addFirst("500");
        deque.addLast("600");
        deque.addFirst("700");

        System.out.println(String.format("삽입 후 : %s", deque.print()));

        deque.removeFirst();
        deque.removeLast();

        System.out.println(String.format("삭제 후 : %s", deque.print()));
    }
}
