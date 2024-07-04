package chapter.book.quiz.linkedList.main;

import chapter.book.quiz.linkedList.CircularLinkedList;

public class CLLDeletionionMain {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.append(11);
        list.append(9);
        list.append(27);
        list.append(41);
        list.append(3);

        System.out.print("원형 단일 연결 리스트: ");
        list.printAll();


        System.out.print("노드 3을 삭제한 원형 단일 연결 리스트: ");
        list.delete(3);
        list.printAll();

        System.out.print("노드 11을 삭제한 원형 단일 연결 리스트: ");
        list.delete(11);
        list.printAll();


        System.out.print("노드 27을 삭제한 원형 단일 연결 리스트: ");
        list.delete(27);
        list.printAll();

    }
}
