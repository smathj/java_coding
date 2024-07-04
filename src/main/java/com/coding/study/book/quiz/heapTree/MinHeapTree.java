package chapter.book.quiz.heapTree;

/**
 * 최소힙 트리
 */
public class MinHeapTree {

    private int[] heap;
    private int size;
    private int pointer;

    public MinHeapTree(int size) {
        this.size = size;
        this.heap = new int[size + 1];
        this.heap[0] = -1;
        this.pointer = 0;
    }

    /**
     * 루트 노드
     */
    public int getRoot() {
        return heap[1];
    }


    /**
     *  현재 노드의 인덱스로 부모 인덱스 구하기
     */
    private int getParentIndex(int index) {
        if (index < 1) {
            return -1;
        }

        return index / 2;
    }


    /**
     * 부모 노드의 인덱스로
     * 왼쪽 자식 인덱스 구하기
     */
    private int getLeftChildIndex(int index) {
        if (index < 1) {
            return -1;
        }
        return index * 2;
    }


    /**
     * 부모 노드의 인덱스로
     * 오른쪽 자식 인덱스 구하기
     */
    private int getRightChildIndex(int index) {
        if (index < 1) {
            return -1;
        }
        return (index * 2) + 1;
    }


    /**
     * 리프 노드 체크
     */
    private boolean isLeafNode(int index) {
        boolean b1 = getLeftChildIndex(index) > size;
        boolean b2 = getRightChildIndex(index) > size;
        return b1 && b2;
    }


    /**
     * 재배치 메서드
     */
    private void swap(int cureentIndex, int parentIndex) {
        int temp;
        temp = heap[cureentIndex];
        heap[cureentIndex] = heap[parentIndex];
        heap[parentIndex] = temp;
    }


    /**
     * 최소 힙 트리 삽입
     */
    public void insert(int value) {
        heap[++pointer] = value;
        int currentIndex = pointer;

        // 1. 부모 인덱스가 -1 이 아니여야한다
        // 2. 현재 노드가 부모 노드 보다 작을때
        // -> 재배치 한다
        while (heap[getParentIndex(currentIndex)] != -1 &&
               heap[currentIndex] < heap[getParentIndex(currentIndex)]) {

            // 재배치
            swap(currentIndex, getParentIndex(currentIndex));
            // currentIndex 을 currentIndex 의 부모 인덱스로 변경한다
            // 이로써 while 문에서 다시 한번 자기 부모 인덱스와 비교 할 수 있다
            currentIndex = getParentIndex(currentIndex);

        }

    }

    /**
     * 최소 값을 반환하면서 삭제
     */
    public int delete() {
        int result = getRoot();

        // 마지막 노드를 루트로 이동
        heap[1] = heap[size];
        heap[size] = -1;
        size--;

        if (size > 1) {
            rebuild(1);
        }

        return result;
    }

    /**
     * current index 인자 기준으로 heap 재구성
     */
    private void rebuild(int current) {
        // * current index 기준으로 왼쪽 자식과 오른쪽 자식 중 작은 값을 구한다.
        int leftChildIndex = getLeftChildIndex(current);
        int rightChildIndex = getRightChildIndex(current);

        // * 현재 노드가 리프 노드인지 확인
        if (isLeafNode(current)) {
            return;
        }

        int swapIndex = current;

        // * 왼쪽 자식만 존재하는 경우
        // 인덱스는 오른쪽 자식이 더 높은 인덱스를 갖으니까 오른쪽으로 보는거임
        // 근데 그 오른쪽 자식 인덱스 값이 size 보다 작으면 삭제된거라서 왼쪽 자식만 존재한다는 뜻
        if (rightChildIndex > size) {
            if (heap[leftChildIndex] < heap[current]) {
                swapIndex = leftChildIndex;
            }
        // * 왼쪽 자식과 오른쪽 자식 둘다 존재하는 경우
        } else {
            // * current index 기준으로 왼쪽 자식과 오른쪽 자식 중 작은 값을 구한다.
            // 작은 인덱스를 swapIndex 로 지정 한다
            if (heap[leftChildIndex] <= heap[rightChildIndex]) {
                swapIndex = leftChildIndex;
            } else {
                swapIndex = rightChildIndex;
            }
        }

        // * current 가 swap 값 보다 크면 자리를 바꾼다.
        // ex)   10      >       7
        // swapIndex 인덱스의 실제 값이 더 작으면 서로 바꿔주고
        if (heap[current] > heap[swapIndex]) {
            swap(current, swapIndex);   // 바꿔주기
            rebuild(swapIndex); // 재귀로 재 시작
        }



    }


    /**
     * 모든 노드 출력하기
     */
    public void print() {
        for (int i = 1; i <= size; i++) {
            int parent = heap[i];
            int leftChild = 2 * i <= size ? heap[2 * i] : -1;
            int rightChild = (2 * i) + 1 <= size ? heap[(2 * i) + 1] : -1;

            // 왼쪽, 오른쪽 노드 다 있을때
            if (leftChild > -1 && rightChild > -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식: %s, 오른쪽 자식: %s", parent, leftChild, rightChild));

            // 왼쪽 노드만 있을때
            } else if (leftChild > -1 && rightChild == -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식: %s, 오른쪽 자식은 없습니다.", parent, leftChild));

            // 오른쪽 노드만 있을때
            } else if (leftChild == -1 && rightChild > -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식은 없습니다. 오른쪽 자식: %s.", parent, rightChild));

            // 리프 노드 일때
            } else {
                System.out.println(String.format("리프 노드: %s ", parent));

            }

        }
    }


}




























