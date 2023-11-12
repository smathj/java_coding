package chapter.stack_queue.m03;

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
