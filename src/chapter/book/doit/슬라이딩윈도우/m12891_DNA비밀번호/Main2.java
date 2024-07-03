package chapter.book.doit.슬라이딩윈도우.m12891_DNA비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {


//        Scanner sc = new Scanner(System.in);
//        String[] temp = sc.nextLine().split(" ");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");


        // DNA 문자열 길이
        int S = Integer.parseInt(temp[0]);

        // 부분 문자열의 길이
        int P = Integer.parseInt(temp[1]);


        String text = br.readLine();

        // A, C, G, T
        int[] dnaArr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();


        int i = 0;
        int count = 0;
        // 문자열 길이 - 부분 문자열 길이
        while (i+P <= text.length()) {

            String subText = text.substring(i, i+P);
//            i += P;
            i++;
            System.out.println("[Before] subText = " + subText);
            // A
            for (int a = 0; a < dnaArr[0]; a++) {
                System.out.println("A존");
                subText = subText.replace("A", "");
            }
            // C
            for (int c = 0; c < dnaArr[1]; c++) {
                System.out.println("C존");
                subText = subText.replace("C", "");
            }
            // G
            for (int g = 0; g < dnaArr[2]; g++) {
                System.out.println("G존");
                subText = subText.replace("G", "");
            }
            // T
            for (int t = 0; t < dnaArr[3]; t++) {
                System.out.println("T존");
                subText = subText.replace("T", "");
            }
            System.out.println("[After] subText = " + subText);
            if("".equals(subText)) {

                count++;
            }

            System.out.println();
            System.out.println();

        }

        System.out.println(count);



    }
}
