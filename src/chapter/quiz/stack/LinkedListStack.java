package chapter.quiz.stack;

public class LinkedListStack {

    private Node head;
    private Node top;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void push(Object data) {
        // 비었을때
        if (head == null) {
            head = new Node(data);
            top = head;
            return;
        }

        // 데이터가 이미 있을때
        Node node = new Node(data);
        top.next = node;
        top = node;
    }

    public Object pop() {
        if (top == null) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // 헤드 노드를 가져온다
        Node temp = head;

        // 제일 위의 데이터만 꺼내와본다
        Object data = this.peek();

        // 헤드의 다음 노드가 null 이라면
        if (temp.next == null) {
            // 제일 위의 데이터를 리턴한다
            // 그러면서 head, top을 null로 초기화해서 빈 스택으로 만들어준다
            head = null;
            top = null;
            return data;
        }

        // 헤드의 다음 노드가 없을때 까지 반복한다
        // top --------- temp
        while (temp.next != null) {
            top = temp;
            temp = temp.next;
//            temp = top.next;
        }

        // temp.next = null 인 거야
        // 그니까 temp 가 top 인 거지

        // top.next인 temp를 null로 초기화한다 ( top.next의 참조를 null로 끊어줌 )
        top.next = null;

        // 여기서는 data = top

        return data;

    }

    public Object peek() {
        return this.top.data;
    }

    public boolean empty() {
        return top == null;
    }

    // 검색
    public boolean contain(Object value) {
        Node currentNode = this.head;

        boolean flag = false;
        for (int i = 0; i < size(); i++) {
            if (currentNode.data == value) {
                flag = true;
                break;
            } else {
                currentNode = currentNode.next;
            }
        }

        return flag;


    }

    // 총 갯수
    public int size() {

        if (empty()) {
            return 0;
        }

        Node currentNode = this.head;
        Node topNode = this.top;
        int count = 1;

        if (currentNode == topNode) {
            return count;
        }

        while (currentNode.next != topNode) {
            currentNode = currentNode.next;
            count++;
        }

        return ++count;


    }

}
