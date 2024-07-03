package chapter.book.quiz.linkedList.main;

import chapter.book.quiz.linkedList.DLLCircularLinkedList;

public class DLLCircularLinkedListMain {
    public static void main(String[] args) {
        DLLCircularLinkedList list = new DLLCircularLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.printAll();
        System.out.println();

        list.delete(2);
        list.printAll();
        System.out.println();

        list.delete(1);
        list.printAll();
        System.out.println();

        list.delete(4);
        list.printAll();
        System.out.println();

    }
}
