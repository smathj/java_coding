package chapter.book.quiz.heapTree;

public class Main1 {

    /**
     * 최소 힙 트리 삽입 예제
     * @param args
     */
    public static void main(String[] args) {
        MinHeapTree minHeap = new MinHeapTree(6);
        minHeap.insert(14);
        minHeap.insert(11);
        minHeap.insert(6);
        minHeap.insert(12);
        minHeap.insert(5);
        minHeap.insert(3);

        minHeap.print();
    }
}
