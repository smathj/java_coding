package chapter;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.add(0, 10);
        System.out.println("list = " + list);

    }
}
