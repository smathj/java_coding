package chapter.book.자바알고리즘문제풀이입문.stack_queue.m03;

import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(2);
        list.add(1);

        System.out.println("list = " + list);

        list.remove(1);
        list.remove(1);
        System.out.println("list = " + list);
    }
}
