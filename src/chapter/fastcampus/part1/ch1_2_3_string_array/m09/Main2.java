package chapter.fastcampus.part1.ch1_2_3_string_array.m09;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


/*
----------------------------------------------------------------
10
5
2
3
1
4
2
3
5
1
7


1
1
2
2
3
3
4
5
5
7
----------------------------------------------------------------

 */
public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬 - 날먹
        Arrays.sort(arr);

        for (int i : arr) {
            bw.write(i + "\n");

        }

        bw.flush();

    }

}
