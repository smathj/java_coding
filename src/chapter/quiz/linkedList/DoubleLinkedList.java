package chapter.quiz.linkedList;

/**
 * 이중 연결 리스트
 */
public class DoubleLinkedList {

    private Node head;

    public DoubleLinkedList() {
    }

    public DoubleLinkedList(int value, Node head) {
        this.head = new Node(value, head, null);
    }

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

    public Node getHead() {
        return head;
    }

    /**
     * 이중 연결 리스트 끝에 노드를 추가
     */
    public void append(int value) {

        // 비어있을때
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        // 리스트에 노드가 있을때
        Node pointer = this.head;

        // 마지막 노드를 찾아서 pointer 로 초기화한다
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        // pointer 마지막 노드


        Node newNode = new Node(value);

        // newNode 이전 노드를 현재의 마지막 노드인 pointer 로 지정
        newNode.prev = pointer;

        // pointer 다음 노드를 추가한 노드로 지정
        pointer.next = newNode;



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


        Node prevNode = pointer;

        // 포인터 변수가 null이 아니면서 인자 값과 달라질 때까지 반복
        while (pointer != null && pointer.getValue() != value) {
            prevNode = pointer;
            pointer = pointer.next;
        }

        //! prevNode : 삭제할 노드의 이전 노드
        //! pointer : 삭제할 노드
        //! temp : 삭제할 노드의 다음 노드

        // ------------------------------------
        //    →→→→→→→→→→→→→→→→→→→→→→→→→↓
        //    ↑                        ↓
        // prevNode      pointer     temp
        // 이전노드       삭제할노드    다음노드
        //    ↑                        ↓
        //    →→→→→→→→→→→→→→→→→→→→→→→→→↓
        // ------------------------------------

        // 삭제할 노드의 다음 노드를 temp 에 담아둠 -> 오른쪽 시작점
        Node temp = pointer.next;

        if (pointer.next == null) {
            // 삭제할 노드의 다음 노드를 null로 초기화
            prevNode.next = null;
        } else {
            temp.prev = prevNode;
            prevNode.next = pointer.next;
        }
        pointer = null;



    }

    /**
     * 인자 값으로 앞 노드의 값을 알아내기
     */
    public void printPrevNode(int value) {

        // 아무것도 없을때
        if (this.head == null) {
            System.out.println("이중 연결 리스트가 비어 있습니다.");
            return;
        }

        // 인자값이 헤드의 값일때
        if (this.head.getValue() == value) {
            System.out.println(String.format("노드 %s 의 앞 노드는 존재하지 않습니다", value));
            return;
        }

        Node pointer = this.head;
        // pointer가 찾고자하는 값이 아닐때
        while (pointer != null && pointer.getValue() != value) {
            // pointer 를 pointer 의 다음 노드로 초기화
            pointer = pointer.next;
        }

        // pointer 는 현재 찾고자 하는 값의 노드이거나 null임
        if (pointer == null) {
            System.out.println(String.format("노드 %s 은 존재하지 않습니다", value));
        } else {
            System.out.println(String.format("노드 %s 의 앞 노드의 값은 %s 입니다", value, pointer.prev.getValue()));
        }









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
            builder.append(" <-> ");
            pointer = pointer.next;
        }
        builder.delete(builder.lastIndexOf(" <-> "), builder.length());
        System.out.println(builder.toString());
    }









}
