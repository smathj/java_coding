package chapter.book.quiz.linkedList.main;

import chapter.book.quiz.linkedList.DoubleLinkedList;

public class DLLDeletionMain {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.append(1);
        doubleLinkedList.append(3);
        doubleLinkedList.append(2);
        doubleLinkedList.append(20);
        doubleLinkedList.append(19);

        System.out.print("원본 이중 연결 리스트: ");
        doubleLinkedList.printAll();

        doubleLinkedList.delete(1);
        System.out.print("노드 1을 삭제한 이중 연결 리스트: ");
        doubleLinkedList.printAll();

        doubleLinkedList.delete(2);
        System.out.print("노드 2을 삭제한 이중 연결 리스트: ");
        doubleLinkedList.printAll();

        doubleLinkedList.delete(19);
        System.out.print("노드 19을 삭제한 이중 연결 리스트: ");
        doubleLinkedList.printAll();

    }
}
