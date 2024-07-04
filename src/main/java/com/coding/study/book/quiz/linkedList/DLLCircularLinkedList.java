package chapter.book.quiz.linkedList;

public class DLLCircularLinkedList {

    private Node head;
    private Node tail;

    private class Node {
        private int value;  // 값

        private Node prev; // 이전 포인터
        private Node next; // 다음 포인터

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public int getValue() {
            return value;
        }
    }

    public void append(int value) {

        // 처음 넣을때
        if (this.head == null && this.tail == null) {
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            return;
        }

        // 추가할때
        Node pointer = this.tail;

        pointer.next = new Node(value, pointer, this.head);
        this.tail = pointer.next;
        this.tail.next = this.head;

    }

    public void printAll() {
        Node pointer = this.head;
        StringBuilder builder = new StringBuilder();
        while (pointer != this.tail) {
            builder.append(pointer.getValue());
            builder.append(" <-> ");
            pointer = pointer.next;
        }

        builder.append(pointer.getValue());
        builder.append("(tail) -> ");

        builder.append(this.head.getValue());
        builder.append("(head)");

        System.out.println(builder.toString());
    }

    public void delete(int value) {
        Node pointer = this.head;

        Node removeNode = null;

        // 1. 삭제하는 노드가 head 일때
        if (this.head.getValue() == value) {
            removeNode = this.head;
            this.head = this.head.next;
            this.head.prev = null;
            System.out.println("[맨앞 삭제]removeNode = " + removeNode.getValue());
            System.out.println("[맨앞 삭제]removeNode.next = " + removeNode.next.getValue());
            return;
        }

        // 임시 노드
        Node temp = null;

        // 삭제할 노드를 찾자
        while (pointer.next != this.tail && pointer.getValue() != value) {
            temp = pointer;
            pointer = pointer.next;
            pointer.prev = temp;
            temp.next = pointer;
        }


        // 2-1. 삭제하는 노드가 tail 일때
        if (pointer.next.getValue() == value) {
            removeNode = this.tail;
            //! pointer : 삭제할 노드의 이전 노드
            this.tail = pointer;        // o
            this.tail.next = this.head; // o
            this.tail.prev = temp;      // o
            System.out.println("[마지막 삭제]removeNode = " + removeNode.getValue());
            System.out.println("[마지막 삭제]removeNode.prev = " + removeNode.prev.getValue());
            System.out.println("[마지막 삭제]removeNode.next = " + removeNode.next.getValue());
        // 2-2. 삭제하는 노드가 tail 이 아닐때
        } else {
            removeNode = pointer;
            //! pointer : 삭제할 노드
            temp.next = pointer.next;
            pointer.next.prev = temp;
            System.out.println("[중간 삭제] removeNode = " + removeNode.getValue());
            System.out.println("[중간 삭제] removeNode.prev = " + removeNode.prev.getValue());
            System.out.println("[중간 삭제] removeNode.next = " + removeNode.next.getValue());
        }



    }





































}
