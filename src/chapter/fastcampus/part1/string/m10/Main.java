package chapter.fastcampus.part1.string.m10;

import java.io.*;
import java.util.Arrays;

/*
! 시간초과

9
5 12 7 10 9 1 2 3 11
13

3
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 <= an <= 1000000 (1,000,000 백만)
        // 자연수 x 가 주어질때 두수의 합이 x 가 되는
        // ai + aj = x ( 1 <= i < j <= n ) 만족하는
        // (ai, aj) 순서쌍 구하는 프로그램

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];


        String[] splt = br.readLine().split(" ");


        int x = Integer.parseInt(br.readLine());


        for (int i = 0; i < splt.length; i++) {
            arr[i] = Integer.parseInt(splt[i]);
        }


//        System.out.println("n = " + n);
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("x = " + x);
//        System.out.println();


        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int nowValue = arr[i];
            int findValue = x - nowValue;

//            System.out.println("nowValue = " + nowValue);
//            System.out.println("findValue = " + findValue);
            if(nowValue > x) {
                break;
            }

            for (int j = arr.length-1; j > i; j--) {
                int innerValue = arr[j];

                if (innerValue < findValue) {
//                    System.out.println("유기");
                    break;
                }

                if (findValue == innerValue) {
//                    System.out.println("찾았습니다");
                    count++;
                }
            }



//            System.out.println();
        }

        System.out.println(count);





    }
}
