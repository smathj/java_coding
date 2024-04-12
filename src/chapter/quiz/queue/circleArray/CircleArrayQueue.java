package chapter.quiz.queue.circleArray;

/**
 * 원형 큐
 */
public class CircleArrayQueue {

    private Object arr[];
    private int MAX_QUEUE_SIZE;

    // 시작 인덱스
    private int front = 0;

    // 끝 인덱스
    private int rear = 0;


    /**
     * 생성자
     */
    public CircleArrayQueue(int size) {
        /*
        원형 큐는 데이터의 순환을 위해 항상 하나의 배열 공간을 비워 주게 된다
        그래서 원형 큐의 크기는 처음 설정할대 빈 공간을 고려해서 1만큼 크기를 더 늘려줘야한다
         */
        this.MAX_QUEUE_SIZE = size + 1;
        this.arr = new Object[MAX_QUEUE_SIZE];
    }


    /**
     * 데이터 삽입
     */
    public void enqueue(Object v) {
        if ((rear + 1) % MAX_QUEUE_SIZE == front) {
            throw new ArrayIndexOutOfBoundsException();
        }

        rear = (rear + 1) % MAX_QUEUE_SIZE;
        arr[rear] = v;
    }

    /**
     * 데이터 꺼내기
     */
    public Object dequeue() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        front = (front + 1) % MAX_QUEUE_SIZE;
        Object value = arr[front];
        arr[front] = null;

        return value;
    }

    /**
     * 비어있는지 확인
     */
    public boolean empty() {
        return front == rear;
    }


}
