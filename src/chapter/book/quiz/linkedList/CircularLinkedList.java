package chapter.book.quiz.linkedList;

import com.sun.org.apache.xpath.internal.objects.XNull;

public class CircularLinkedList {
    private Node head;  // 제일 앞 노드
    private Node tail;  // 제일 끝 노드

    private class Node {
        private int value;  // 값
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }



    /**
     * 원형 단일 연결 리스트 끝에 노드 추가
     */
    public void append(int value) {
        if (this.head == null && this.tail == null) {
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            return;
        }


        Node pointer = this.tail;

        // 마지막 위치에 새 노드 삽입
        pointer.next = new Node(value);

        // tail은 새로 삽입한 노드를 재할당
        this.tail = pointer.next;

        // tail의 next 포인터를 head로 연결하여 원형 연결 리스트 조건 만족시킴
        this.tail.next = this.head;

    }

    /**
     * 원형 단일 연결 리스트 노드 삭제
     */
    public void delete(int value) {
        Node pointer = this.head;

        // 삭제하는 노드가 head 노드 일때
        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;
            removeNode = null;
            return;
        }


        // 포인터가 tail이 아니며 값이 다를 때까지 반복
        Node temp = null;
        // 1. 말둘이면 x
        // 2. 값이 같으면 x
        while (pointer.next != this.tail && pointer.getValue() != value) {
            temp = pointer;
            pointer = pointer.next;
        }

        //! 삭제할 노드가 pointer 이다
        //! pointer 는 가장 멀리 있을때가 tail 노드의 이전 노드이다
        //! 그게 아니라면 중간에 있는 노드이다
        //! pointer.next는 tail 일 수 있지만(null이 아니면)
        //! pointer 는 tail일 수 없다 (next보다 이전이니까)
        //? pointer.next 은 tail 이거나 아니거나 두개의 경우가 존재한다
        // 삭제할 노드가 tail일 경우 앞 노드를 tail로 재할당하고 next를 head로 연결
        if (pointer.next.getValue() == value) {
            this.tail = pointer;
            this.tail.next = this.head;
        // 중간의 요소면 끌어댕기기 한칸
        } else {
            //! pointer : 삭제할 노드
            // 1 -> 2 -> 3
            // 1    ->   3
            temp.next = pointer.next;
        }
        pointer = null;




    }



    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while (pointer != this.tail) {
            builder.append(pointer.getValue());
            builder.append(" -> ");
            pointer = pointer.next;
        }

        builder.append(pointer.getValue());
        builder.append("(tail) -> ");

        builder.append(this.head.getValue());
        builder.append("(head)");

        System.out.println(builder.toString());

    }
}
