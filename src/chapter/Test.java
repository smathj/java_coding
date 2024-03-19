package chapter;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        String text = "가가가 나나 다다 라 마마마마 바 사";
        StringTokenizer stringTokenizer = new StringTokenizer(text);

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            System.out.println("token = " + token);

        }

    }
}
