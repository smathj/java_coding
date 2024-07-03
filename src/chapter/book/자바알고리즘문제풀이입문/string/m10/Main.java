package chapter.book.자바알고리즘문제풀이입문.string.m10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Main {
    public String solution(String param, String flag){
        String[] baseTextArr = param.split("");
        StringBuilder result = new StringBuilder();

        List<String> textList = Arrays.asList(baseTextArr);

        for (int i = 0; i < baseTextArr.length; i++) {
            String nowText = baseTextArr[i];
            int endIndex = baseTextArr.length -1;
            int minLeftNum = 1;
            int minRightNum = 1;
            boolean left = false;
            boolean right = false;

            // 바로일치
            if (flag.equals(nowText)) {
//                System.out.println("minLeftNum :" + minLeftNum + ", minRightNum :" + minRightNum + ", left : " + left + ", right : " + right );
                result.append(0);
                continue;
            }


            // 왼쪽으로 탐색
            while (i - minLeftNum >= 0) {
                if (flag.equals(baseTextArr[i - minLeftNum])) {
//                    result.append((minLeftNum) + " ");
                    left = true;
                    break;
                } else {
                    minLeftNum += 1;
                }
            }

            // 오른쪽으로 탐색
            while(i + minRightNum <= endIndex) {
                if (flag.equals(baseTextArr[(i + minRightNum)])) {
                    right = true;
                    break;
                } else {
                    minRightNum += 1;
                }
            }

//            System.out.println("minLeftNum :" + minLeftNum + ", minRightNum :" + minRightNum + ", left : " + left + ", right : " + right );

            // 왼쪽으로만 탐색한경우
            if(left == true && right == false) {
                result.append(minLeftNum);
            // 오른쪽으로만 탐색한경우
            } else if(left == false && right == true) {
                result.append(minRightNum);
            // 양방향으로 탐색한경우
            } else {
                int min = minLeftNum >= minRightNum ? minRightNum : minLeftNum;
                result.append(min);
            }
        }



        return result.toString();
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        String flag=kb.next();
        String[] strArr = T.solution(str,flag).split("");
        for (String text : strArr) {
            int x = Integer.parseInt(text);
            System.out.print(x+" ");
        }
    }
}