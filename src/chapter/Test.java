package chapter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {


        Queue<Integer> saveQue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("saveQue = " + saveQue);


        System.out.println("saveQue = " + saveQue);
        System.out.println();
        for (Integer i : saveQue) {
            System.out.println("i = " + i);
        }
        System.out.println();
        System.out.println("saveQue = " + saveQue);


    }
}
