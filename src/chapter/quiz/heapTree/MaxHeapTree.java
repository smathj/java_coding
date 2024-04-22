package chapter.quiz.heapTree;

public class MaxHeapTree {
    private int[] heap;
    private int size;
    private int pointer;

    public MaxHeapTree(int size) {
        this.size = size;
        this.heap = new int[size + 1];
        this.heap[0] = -1;
        this.pointer = 0;
    }

    public int getRoot() {
        return heap[1];
    }

    private int getParentIndex(int index) {
        if (index < 1) {
            return -1;
        }

        return index / 2;
    }

    private int getLeftChildIndex(int index) {
        if (index < 1) {
            return -1;
        }

        return 2 * index;
    }

    private int getRightChildIndex(int index) {
        if (index < 1) {
            return -1;
        }

        return (2 * index) + 1;
    }

    private boolean isLeafNode(int index) {
        return getLeftChildIndex(index) > size && getRightChildIndex(index) > size;
    }

    private void swap(int cureentIndex, int parentIndex) {
        int temp;
        temp = heap[cureentIndex];
        heap[cureentIndex] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    public void insert(int value) {
        heap[++pointer] = value;
        int currentIndex = pointer;

        while (heap[getParentIndex(currentIndex)] != -1 && heap[currentIndex] > heap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }

    public int delete() {
        int result = getRoot();

        heap[1] = heap[size];
        heap[size] = -1;
        size--;

        if (size > 1) {
            rebuild(1);
        }

        return result;
    }

    private void rebuild(int current) {
        int leftChildIndex = getLeftChildIndex(current);
        int rightChildIndex = getRightChildIndex(current);

        if (isLeafNode(current)) {
            return;
        }

        // 왼쪽 자식만 존재하는 경우
        int swapIndex = current;
        if (rightChildIndex > size) {
            if (heap[leftChildIndex] > heap[current]) {
                swapIndex = leftChildIndex;
            }
        } else {
            if (heap[leftChildIndex] >= heap[rightChildIndex]) {
                swapIndex = leftChildIndex;
            } else {
                swapIndex = rightChildIndex;
            }
        }

        if (heap[current] < heap[swapIndex]) {
            swap(current, swapIndex);
            rebuild(swapIndex);
        }
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            int parent = heap[i];
            int leftChild = 2 * i <= size ? heap[2 * i] : -1;
            int rightChild = (2 * i) + 1 <= size ? heap[(2 * i) + 1] : -1;

            if (leftChild > -1 && rightChild > -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식: %s, 오른쪽 자식: %s", parent, leftChild, rightChild));
            } else if (leftChild > -1 && rightChild == -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식: %s, 오른쪽 자식은 없습니다.", parent, leftChild));
            } else if (leftChild == -1 && rightChild > -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식은 없습니다. 오른쪽 자식: %s.", parent, rightChild));
            } else {
                System.out.println(String.format("리프 노드: %s ", parent));
            }
        }
    }
}

