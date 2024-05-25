package chapter.패스트캠퍼스.part1.ch4_bruteforce.m06;


import java.util.Scanner;

/**
 * 10250
 * ACM 호텔
 */

/*
1
6 12 10


----------------------

2
6 12 10
30 50 72



402
1203


 */
public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] hArr = new int[N];    // 테스트 케이스 별 층수
        int[] wArr = new int[N];    // 테스트 케이스 별 방의갯수
        int[] uArr = new int[N];    // 테스트 케이스 별 손님번호


        for (int i = 0; i < N; i++) {
            hArr[i] = sc.nextInt();
            wArr[i] = sc.nextInt();
            uArr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int roomNo = userSetting(hArr[i],wArr[i],uArr[i]);
            System.out.println(roomNo);
        }


    }

    private static int userSetting(int H, int W, int U) {


        int roomSettingCount = 0;   // 손님 배정 횟수
        int h = 1;                  // 층
        int w = 1;                  // 방

        //? 방
        a: for (w = 1; w <= W; w++) {
            //! 층
            b: for (h = 1; h <= H; h++) {
                roomSettingCount++;
                if (U == roomSettingCount) {
                    break a;
                }
            }
        }

        int result = h * 100 + w;
        return result;


    }


}


