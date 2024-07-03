package chapter.lecture.패스트캠퍼스.part1.ch7_binary_search.m00;

import java.io.*;
import java.util.Arrays;

/**
 * 바이너리 서치 이용해서 해보자고
 */
public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] baseArr = br.readLine().split(" ");

        int[] baseIntArr = Arrays.stream(baseArr)
                .mapToInt(value -> Integer.parseInt(value))
                .sorted()
                .toArray();

        int M = Integer.parseInt(br.readLine());
        String[] findArr = br.readLine().split(" ");


        for (String findText : findArr) {
            int result = 0;
            int index = Arrays.binarySearch(baseIntArr, Integer.parseInt(findText));
            if(index >= 0) result = 1;
            bw.write(result + "\n");
        }
        bw.flush();

    }

}
