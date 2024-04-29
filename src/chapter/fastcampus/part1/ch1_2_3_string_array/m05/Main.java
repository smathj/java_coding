package chapter.fastcampus.part1.ch1_2_3_string_array.m05;

import java.util.Scanner;


/*
-----------------------------------------------
20:00:00
04:00:00

08:00:00
-----------------------------------------------
12:34:56
14:36:22

02:01:26
-----------------------------------------------
20:10:01
04:00:00

07:49:59
-----------------------------------------------
10:32:32
14:36:22

07:49:59
//-----------------------------------------------
10:32:32
10:32:32


-----------------------------------------------
 */
public class Main {


    public static Integer getSecond(String nowTime, String targetTime) {
        String[] arr1 = nowTime.split(":");
        int h1 = Integer.parseInt(arr1[0]) * 3600;
        int m1 = Integer.parseInt(arr1[1]) * 60;
        int s1 = Integer.parseInt(arr1[2]);

        int sum1 = h1 + m1 + s1;

        String[] arr2 = targetTime.split(":");
        int h2 = Integer.parseInt(arr2[0]) * 3600;
        int m2 = Integer.parseInt(arr2[1]) * 60;
        int s2 = Integer.parseInt(arr2[2]);

        int sum2 = h2 + m2 + s2;

        // 24 시로 만들고나서 ... 타겟 초를 더한다
//        if (h1 > h2) {
        if (sum1 >= sum2) {
//            System.out.println("1");
            return (24 * 3600) - sum1 + sum2;
        } else {
//            System.out.println("2");
            return sum2 - sum1;
        }

    }

    public static String getTimeString(Integer time, Integer minute, Integer second) {

        String result = "";

        if (time <= 9) {
            result += "0" + time;
        } else {
            result += String.valueOf(time);
        }
        if (minute <= 9) {
            result += ":0" + minute;
        } else {
            result += ":" + minute;
        }
        if (second <= 9) {
            result += ":0" + second;
        } else {
            result += ":" + second;
        }

        return result;


    }

    public static void solve(String nowTime, String targetTime) {

//        System.out.println("nowTime = " + nowTime);
//        System.out.println("targetTime = " + targetTime);

        int nowSecond = getSecond(nowTime, targetTime);
//        System.out.println("nowSecond = " + nowSecond);

        // 나누어 몫을 시간으로 삼는다
        int time = nowSecond / 3600;

//        System.out.println(time + "시간");

        // 나머지를 구해 분으로 삼는다
        int minute = (nowSecond % 3600) / 60;
//        System.out.println(minute + "분");

        // 나머지를 구해 초으로 삼는다
//        int second = (nowSecond % 3600) % 60;
        int second = (nowSecond) % 60;
//        System.out.println(second + "초");

        String result = getTimeString(time, minute, second);
        System.out.println(result);




    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nowTime = scanner.nextLine();
        String targetTime = scanner.nextLine();
        solve(nowTime, targetTime);

    }

}
