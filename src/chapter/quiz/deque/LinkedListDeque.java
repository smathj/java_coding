package chapter.quiz.deque;



/**
 * 연결 리스트 기반의 Deque(덱,디큐)
 */
public class LinkedListDeque {

    private class Node {

        Object data = null;
        Node next = null;

        Node(Object data) {
            this.data = data;
        }

        private Object getValue() {
            return data;
        }
    }


    //! 양방향으로 데이터 삽입에 대한 위치 값
    private Node front = null;

    //! 양방향으로 데이터 삭제에 대한 위치 값
    private Node rear = null;


    /**
     * 맨앞에 추가
     */
    public void addFirst(Object data) {
        // 전달받은 데이터로 새로운 노드 객체 생성
        Node node = new Node(data);

        // 데이터가 없다면
        if (front == null) {
            front = node;
            rear = front;   // 이건 왜 이렇게할까 ?
            return;
        }

        // 기존의 front 을 temp에 담아둔다
        Node temp = front;
        // 전달 받은 데이터로 만든 노드 객체를 front에 대입해준다
        front = node;
        // 새로운 front의 다음 노드로 기존의 front을 나타내는 temp 를 지정한다
        front.next = temp;

    }

    /**
     * 맨뒤에 추가
     */
    public void addLast(Object data) {
        Node node = new Node(data);

        // 비어있다면
        if (front == null) {
            front = node;
            rear = front;
            return;
        }

        rear.next = node;

        rear = rear.next;


    }

    /**
     * 제일 앞 노드 삭제
     */
    public Object removeFirst() {

        if (front == null && rear == null) {
            throw new ArrayIndexOutOfBoundsException();
        }


        Object value = front.getValue();
        front = front.next;

        if (front == rear) {
            front = null;
            rear = null;
        }

        return value;
    }

    /**
     * 제일 뒤 노드 삭제
     */
    public Object removeLast() {

        if (front == null && rear == null) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // 맨뒤의 값을 value 에 담는다
        Object value = rear.getValue();

        Node temp = front;

        // 어차피 제일 끝가지 돌아야하므로 break 문을 직접 쓰진 않아도 되네
        while (temp != null) {
            if (temp.next != rear) {
                temp = temp.next;
                continue;
            }

            rear = temp;
            rear.next = null;
        }

        if (front == rear) {
            front = null;
            rear = null;
        }

        return value;
    }


    /**
     * 출력 메서드
     */
    public String print() {
        String datas = "";
        Node temp = front;

        while (temp != null) {
            Object value = temp.getValue();
            temp = temp.next;

            if (temp == null) {
                datas += value;
            } else {
                datas += String.format("%s->", value);
            }
        }

        return datas;

    }





















}
