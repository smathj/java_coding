package chapter.book.quiz.linkedList;

/**
 * 단일 연결 리스트
 */
public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(int value) {
        this.head = new Node(value, null);
    }

    private class Node {
        private int value;  // 값
        private Node next; // 포인터

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }
    }

    public Node getHead() {
        return head;
    }

    /**
     * 단일 연결 리스트 끝에 노드를 추가
     */
    public void append(int value) {

        // 비어있을때
        if (this.head == null) {
            this.head = new Node(value, null);
            return;
        }

        // 리스트에 노드가 있을때
        Node pointer = this.head;
        // 마지막 노드를 찾아서 pointer 로 초기화한다
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        // pointer 가 마지막 요소이니 여기에 다음 요소로 추가한다
        pointer.next = new Node(value, null);

    }

    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;
        StringBuilder builder = new StringBuilder();    // 동기화 X
        // 다음 요소가 있을때만
        while (pointer.next != null) {
            builder.append(pointer.getValue());
            builder.append(" -> ");
            pointer = pointer.next;
        }
        // 이때 pointer는 마지막 요소 ( 다음 요소가 없다 )
        builder.append(pointer.getValue());
        System.out.println(builder.toString());
    }

    /**
     * 인자 값으로 같은 노드 삭제
     */
    public void delete(int value) {
        Node pointer = this.head;

        // 첫 노드의 값이 인자 값과 같으면
        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;

            removeNode = null;
            return;
        }


        Node temp = pointer;

        // 포인터 변수가 null이 아니면서 인자 값과 달라질 때까지 반복
        while (pointer != null && pointer.getValue() != value) {
            temp = pointer;
            pointer = pointer.next;
        }


        // 마지막 노드를 삭제하는 경우
        // temp : 삭제할 노드의 이전 노드
        // pointer: 삭제할 노드

        // 1. temp가 마지막 노드인경우
        if (pointer.next == null) {
            temp.next = null;

        // 2. temp가 마지막 노드가 아닌 경우 (중간노드)
        } else {
            // 삭제할 노드의 이전 노드의 포인터를
            // 삭제할 노드의 다음 노드로 가르킨다
            temp.next = pointer.next;
        }

        pointer = null;



    }












}
