package chapter.doit.슬라이딩윈도우.m12891_DNA비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_T {

    static int[] acgtArr;
    static int[] myWindowArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int S = Integer.parseInt(st.nextToken());   // 전체 문자 길이
        int P = Integer.parseInt(st.nextToken());   // 부분 문자 길이

        int count = 0;
        char[] inputArr = new char[S];  // 입력 문자 배열
        acgtArr = new int[4];           // A, C, G, T 만족해야하는 갯수 정보가 있는 배열
        myWindowArr = new int[4];       // 윈도우 배열
        checkSecret = 0;                // A, C, G, T 만족 횟수 , 4이면 정답 문자임

        inputArr = bf.readLine().toCharArray();

        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < 4; i++) {
            acgtArr[i] = Integer.valueOf(st.nextToken());
            if (acgtArr[i] == 0) {
                checkSecret++;  // A,C,G,T 만족하면 checkSecret == 4인데, 0 개만 만족하는건 항상 만족하는거니 1씩 증가
            }
        }

        // * c1
        // 초기 P " 부분 문자열 " 처리 부분
        for (int i = 0; i < P; i++) {
            Add(inputArr[i]);  // 한글자씩 체크해서 checkSecret 을 1씩
        }

        if (checkSecret == 4) {
            count++;
        }

        // * c2 ( c1 이어 달리기 )
        // 슬라이딩 윈도우 처리 부분
        for (int i = P; i < S; i++) {
            int j = i - P;  // j가 시작점, i가 끝점
            Add(inputArr[i]);
            Remove(inputArr[j]);
            if (checkSecret == 4) {
                count++;
            }
        }

        System.out.println(count);
        bf.close();



    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myWindowArr[0] == acgtArr[0]) {
                    checkSecret--;
                }
                myWindowArr[0]--;
                break;

            case 'C':
                if (myWindowArr[1] == acgtArr[1]) {
                    checkSecret--;
                }
                myWindowArr[1]--;
                break;

            case 'G':
                if (myWindowArr[2] == acgtArr[2]) {
                    checkSecret--;
                }
                myWindowArr[2]--;
                break;

            case 'T':
                if (myWindowArr[3] == acgtArr[3]) {
                    checkSecret--;
                }
                myWindowArr[3]--;
                break;

        }
    }

    // 새로 들어온 문자를 처리하는 함수
    private static void Add(char c) {
        switch (c) {
            case 'A':
                myWindowArr[0]++;
                if (myWindowArr[0] == acgtArr[0]) {
                    checkSecret++;
                }
                break;

            case 'C':
                myWindowArr[1]++;
                if (myWindowArr[1] == acgtArr[1]) {
                    checkSecret++;
                }
                break;

            case 'G':
                myWindowArr[2]++;
                if (myWindowArr[2] == acgtArr[2]) {
                    checkSecret++;
                }
                break;

            case 'T':
                myWindowArr[3]++;
                if (myWindowArr[3] == acgtArr[3]) {
                    checkSecret++;
                }
                break;

        }
    }
}
