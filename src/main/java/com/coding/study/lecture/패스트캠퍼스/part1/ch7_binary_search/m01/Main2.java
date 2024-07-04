package com.coding.study.lecture.패스트캠퍼스.part1.ch7_binary_search.m01;


import java.io.*;
import java.util.Arrays;

/**
 * 이분 검색
 */
public class Main2 {

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

        for (String findText : dataArr) {

            int lt = 0;
            int rt = baseArr.length - 1;
            int mid = (lt + rt) / 2;
            String ltText = baseArr[lt];
            String rtText = baseArr[rt];
            String midText = baseArr[mid];



            while (lt <= rt) {
                mid = (lt + rt) / 2;
                midText = baseArr[mid];
                int midCompare = midText.compareTo(findText);

                System.out.println("midText = " + midText);
                System.out.println("findText = " + findText);
//                System.out.println("ltText = " + ltText);
//                System.out.println("rtText = " + rtText);
                System.out.println("midCompare = " + (midCompare > 0 ? "양수" : "음수"));
                if (midCompare < 0) {
                    lt = mid + 1;
                } else if (midCompare > 0) {
                    rt = mid - 1;
                } else {
                    count++;
                    break;
                }

            }

        }
        return count;
    }

}
