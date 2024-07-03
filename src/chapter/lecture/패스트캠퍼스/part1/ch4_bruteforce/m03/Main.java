package chapter.lecture.패스트캠퍼스.part1.ch4_bruteforce.m03;


import java.io.IOException;
import java.util.*;

/**
 * 진법 변환 5 (11005)
 */

/*
60466175 36

ZZZZZ
 */
public class Main {


    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        String[] valueArr = new String[36];

        for (int i = 0; i < 36; i++) {
            if (i >= 10) {
                valueArr[i] = String.valueOf((char) (65 + i - 10));
            } else {
                valueArr[i] = String.valueOf(i);
            }
        }

//        for (int i = 0; i < valueArr.length; i++) {
//            String text = valueArr[i];
//            System.out.println("text = " + text);
//        }

        List<String> list = new ArrayList<>();
        int roopMock = N;
        while (true) {
            int mock = roopMock / B;
            int rest = roopMock % B;
            roopMock = mock;
//            list.add(String.valueOf(rest)); // 나머지 대입
            list.add(valueArr[rest]); // 나머지 대입

//            System.out.println("몫 : " + mock);
//            System.out.println("나머지 : " + rest);
            if (mock == 0) {
//                System.out.println("몫이 0이 되었습니다");
                break;
            }
//            System.out.println();
        }

        Collections.reverse(list);
        String join = String.join("", list);
        System.out.println(join);


        // 알파벳 대문자 13개 , 소문자 13개 , 26개


//        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
//        bf.flush();


    }
}
