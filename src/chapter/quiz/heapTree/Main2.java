package chapter.quiz.heapTree;

public class Main2 {

    /**
     * 최소 힙 트리 삭제 예제
     * @param args
     */
    public static void main(String[] args) {
        MinHeapTree minHeap = new MinHeapTree(5);
        minHeap.insert(6);
        minHeap.insert(14);
        minHeap.insert(13);
        minHeap.insert(11);
        minHeap.insert(19);

        minHeap.delete();
        minHeap.print();
    }
}
