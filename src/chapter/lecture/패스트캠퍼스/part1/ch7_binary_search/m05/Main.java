package chapter.lecture.패스트캠퍼스.part1.ch7_binary_search.m05;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        String temp1 = br.readLine();


        // 나무의 수
        long N = Long.parseLong(temp1.split(" ")[0]);

        // 나무 길이
        long M = Long.parseLong(temp1.split(" ")[1]);


        long[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::valueOf)
                .sorted()
                .toArray();


        long count = 0;

//        long h = M;
        long h = 1;

        // h 높이로 나무 자르기
        while (true) {
            long[] clone = arr.clone();

            // h 만큼 빼기
            for (int i = 0; i < clone.length; i++) {
                clone[i] = Math.max(clone[i] - h, 0);
            }

            // 누적합 배열 생성
            for (int i = 1; i < clone.length; i++) {
                long value = clone[i] + clone[i - 1];
                clone[i] = value;
            }


            boolean flag = clone[clone.length - 1] >= M;

            if (flag) {
                h++;
            } else {
                bw.write(String.valueOf(--h));
                bw.flush();
                break;
            }

        }


    }


}
