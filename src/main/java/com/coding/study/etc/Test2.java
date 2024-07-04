package com.coding.study.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

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


        int targetJinbub = 63;
        int targetNumber = 3000512;

        int tmp = targetNumber;    // 몫 임시변수
        List<String> restList = new ArrayList<>();
        while (true) {
            if (tmp == 0) {
                break;
            }
            int v1 = tmp;
            tmp = v1 / targetJinbub;
            System.out.println("tmp = " + tmp);
            // 나머지
            int rest = v1 % targetJinbub;
//            restList.add(String.valueOf(rest));
            restList.add(valueArr[rest]);

        }


        String reverseText = String.join("", restList);
        System.out.println("reverseText = " + reverseText);


        Collections.reverse(restList);


        String pureText = String.join("", restList);
        System.out.println("pureText = " + pureText);


        if (pureText.equals(reverseText)) {
            System.out.println("회문인 수가 맞습니다");
        } else {
            System.out.println("회문인 수가 아닙니다");
        }



    }
}
