package chapter;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);

        String[] valueArr = new String[36];

        for (int i = 0; i < 36; i++) {
            if (i >= 10) {
                valueArr[i] = String.valueOf((char) (65 + i - 10));
            } else {
                valueArr[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i < valueArr.length; i++) {
            String text = valueArr[i];
            System.out.println("text = " + text);
        }

    }
}
