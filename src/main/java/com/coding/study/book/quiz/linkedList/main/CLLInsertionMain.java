package chapter.book.quiz.linkedList.main;

import chapter.book.quiz.linkedList.CircularLinkedList;

public class CLLInsertionMain {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.append(11);
        list.append(9);
        list.append(27);
        list.append(41);
        list.append(3);

        System.out.print("원형 단일 연결 리스트: ");
        list.printAll();



    }
}
