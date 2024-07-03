package chapter.book.datastructure.ch4;

// * 스택을 직접 만들기

public class IntStack {

    private int[] stk;      // 스택용 배열
    private int capacity;   // 스택 용량
    private int ptr;        // 스택 포인터

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    // 생성자
    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];    // 스택 본체용 배열을 생성한다
        } catch(OutOfMemoryError e) {   // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 푸쉬
    public int push(int x) throws OverflowIntStackException {
        if(ptr >= capacity) throw new OverflowIntStackException();
        return stk[ptr++] = x;  // 스택의 현재에 파라미터 x를 넣고 포인터를 다음으로 이동
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) throw new EmptyIntStackException();
        return stk[--ptr];  // 포인터를 1 감소하고 그값을 리턴
    }

    public int peek() throws EmptyIntStackException {
        if(ptr <= 0) throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(int x) {
        for (int i = ptr-1; i >= 0; i--) {  // 꼭대기 부터 선형검색
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }

    }

}
