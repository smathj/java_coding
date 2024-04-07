package chapter.quiz.queue.array.main;

import chapter.quiz.queue.array.ArrayQueue;

public class Main {
    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.enqueue(1000);
        arrayQueue.enqueue(2000);
        arrayQueue.enqueue(3000);
        arrayQueue.enqueue(4000);
        arrayQueue.enqueue(5000);

        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.empty());


    }
}
