package chapter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {


        Queue<Integer> saveQue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("saveQue = " + saveQue);



        try {
            List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
            System.out.println("l1 = " + l1);
            l1.remove(1);
            System.out.println("l1 = " + l1);

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
