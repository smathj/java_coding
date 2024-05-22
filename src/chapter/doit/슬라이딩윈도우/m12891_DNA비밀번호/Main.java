package chapter.doit.슬라이딩윈도우.m12891_DNA비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {


//        Scanner sc = new Scanner(System.in);
//        String[] temp = sc.nextLine().split(" ");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");


        // DNA 문자열 길이
        int S = Integer.parseInt(temp[0]);

        // 부분 문자열의 길이
        int P = Integer.parseInt(temp[1]);

        // 입력 문자열
        String text = br.readLine();
        String[] textArr = text.split("");

        // A, C, G, T
        int[] dnaArr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();


        int i = 0;
        int count = 0;
        // 문자열 길이 - 부분 문자열 길이
        while (i + P <= text.length()) {

//            i += P;
            int[] subTextCheckArr = new int[4];
            for (int j = i; j < i + P; j++) {
                if (textArr[j] == "A") subTextCheckArr[0] = subTextCheckArr[0] + 1;
                if (textArr[j+1] == "C") subTextCheckArr[1] = subTextCheckArr[1] + 1;
                if (textArr[j+2] == "G") subTextCheckArr[2] = subTextCheckArr[2] + 1;
                if (textArr[j+3] == "T") subTextCheckArr[3] = subTextCheckArr[3] + 1;
            }

            System.out.println(Arrays.toString(subTextCheckArr));

            //
            for (int k = 0; k < 4; k++) {
                if ((dnaArr[0] == subTextCheckArr[0]) &&
                        (dnaArr[1] == subTextCheckArr[1]) &&
                        (dnaArr[2] == subTextCheckArr[2]) &&
                        (dnaArr[3] == subTextCheckArr[3])) {
                    count++;
                }
            }

            i++;

        }

        System.out.println(count);


    }

}
