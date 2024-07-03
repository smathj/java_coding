package chapter.etc;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        System.out.println((char) 62);

        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);

        int jinbub = 64;
        String[] valueArr = new String[jinbub];

        for (int i = 0; i < jinbub; i++) {
            if (i >= 10) {
                valueArr[i] = String.valueOf((char) (65 + i - 10));
            } else {
                valueArr[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " 는 : " + valueArr[i]);
        }

        for (int i = 0; i < valueArr.length; i++) {
            String text = valueArr[i];
            System.out.println("text = " + text);
        }

    }
}
