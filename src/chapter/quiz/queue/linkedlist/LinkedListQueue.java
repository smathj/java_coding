package chapter.quiz.queue.linkedlist;

public class LinkedListQueue {

    private Node front = null;      // 큐의 첫번째 위치를 가르킴
    private Node rear = null;       // 큐에서 삽입될 데이터의 위치를 가리키는 변수, -1일땐 빈큐
    private Node peek = null;       // front가 가르키는 데이터 값만 가리킴
    private class Node {
        private Object value;
        private Node next;

        Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }

    public void enqueue(Object value) {
        if (front == null) {
            front = new Node(value);
            peek = front;
            rear = front;
        } else {
            rear.next = new Node(value);
            rear = rear.next;
        }
    }

    public Object dequeue() {
        Object value = peek.getValue();

        Node temp = front;
        front = front.next;
        peek = front;

        temp = null;

        return value;


    }

    public Object peek() {
        return peek.getValue();
    }

    public boolean empty() {
        return peek == null;
    }


    public void printAll() {
        System.out.println("printAll() 호출");
        Node currentNode = this.front;
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
        System.out.println("------------------------------");

    }

}
