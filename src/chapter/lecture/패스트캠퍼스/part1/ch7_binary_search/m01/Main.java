package chapter.lecture.패스트캠퍼스.part1.ch7_binary_search.m01;


import java.io.*;
import java.util.Arrays;

/**
 * 내장 함수 사용
 * Arrays.binarySearch
 */
public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = nm[0];
        int M = nm[1];

        String[] baseArr = new String[N];
        String[] dataArr = new String[M];

        for (int i = 0; i < N; i++) {
            baseArr[i] = br.readLine();
        }
        for (int i = 0; i < M; i++) {
            dataArr[i] = br.readLine();
        }

        Arrays.sort(baseArr);
//        System.out.println("N = " + N);
//        System.out.println("M = " + M);
//        System.out.println("baseArr = " + Arrays.toString(baseArr));
//        System.out.println("dataArr = " + Arrays.toString(dataArr));


        int result = myBinarySearch(baseArr, dataArr);
        System.out.println(result);



    }

    private static int myBinarySearch(String[] baseArr, String[] dataArr) {

        int count = 0;

        for (String findData : dataArr) {
            int idx = Arrays.binarySearch(baseArr, findData);
            if(idx >= 0) count++;
        }
        return count;
    }

}
