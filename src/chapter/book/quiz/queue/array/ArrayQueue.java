package chapter.book.quiz.queue.array;

public class ArrayQueue {

    private Object[] arr;
    private int MAX_QUEUE_SIZE;
    private int front;  // 큐의 첫번째 위치를 가르킴
    private int rear;   // 큐에서 삽입될 데이터의 위치를 가리키는 변수, -1일땐 빈큐
    private int peek;   // front가 가르키는 데이터 값만 가리킴

    public ArrayQueue(int size) {
        this.arr = new Object[size];
        this.MAX_QUEUE_SIZE = size;
        this.front = 0;
        this.rear = -1;
        this.peek = this.front;
    }

    /**
     * 큐에 데이터 넣음
     */
    public void enqueue(Object value) {
        if (MAX_QUEUE_SIZE - 1 == rear) {
            throw new StackOverflowError();
        }

        arr[++rear] = value;
    }

    /**
     * 큐에 데이터를 꺼낸다
     */
    public Object dequeue() {
        if (front >= MAX_QUEUE_SIZE) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Object value = arr[peek];
        peek = ++front; // front을 1증가키시고 그값을또 peek에 담아서 같은 값을 같게 한다

        return value;

    }

    /**
     *  큐의 데이터 값만 가져오기
     */
    public Object peek() {
        return arr[peek];
    }

    /**
     * 큐가 가득 찻는지
     */
    public boolean isFull() {
        return MAX_QUEUE_SIZE - 1 == rear;
    }

    public boolean empty() {
        return rear == (MAX_QUEUE_SIZE -1);
    }



}
