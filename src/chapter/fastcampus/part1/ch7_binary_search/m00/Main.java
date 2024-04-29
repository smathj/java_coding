package chapter.fastcampus.part1.ch7_binary_search.m00;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] baseArr = br.readLine().split(" ");

        int[] baseIntArr = Arrays.stream(baseArr)
                .mapToInt(value -> Integer.parseInt(value))
                .sorted()
                .toArray();
//        int[] baseIntArr = new int[baseArr.length];
//        for (int i = 0; i < baseArr.length; i++) {
//            baseIntArr[i] = Integer.parseInt(baseArr[i]);
//        }

        // 정렬
//        Arrays.sort(baseIntArr);

        int M = Integer.parseInt(br.readLine());
        String[] findArr = br.readLine().split(" ");


        for (String findText : findArr) {
            int result = myBinarySearch(baseIntArr, Integer.parseInt(findText));
            bw.write(result + "\n");
        }

        bw.flush();


    }

    static public int myBinarySearch(int[] baseArr, int findText) {
        int lt = 0;
        int rt = baseArr.length - 1;
        int findValue = findText;
        while (lt <= rt) {
            int ltValue = baseArr[lt];
            int rtValue = baseArr[rt];
            int mid = (lt + rt) / 2;
            int midValue = baseArr[mid];

            if (midValue > findValue) {
                rt = mid - 1;
            } else if(midValue < findValue) {
                lt = mid + 1;
            } else {
                return 1;
            }
        }

        return 0;


    }

}
