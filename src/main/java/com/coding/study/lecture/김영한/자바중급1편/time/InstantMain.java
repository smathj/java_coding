package com.coding.study.lecture.김영한.자바중급1편.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class InstantMain {

    public static void main(String[] args) {

        // 생성
        Instant now = Instant.now();    // UTC 기준 (한국의 시간에서 9시간 뺀 시간이 나올거임)
        System.out.println("now = " + now);
        System.out.println();

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);           // LocalDateTime 은 안됨
        long epochSecond = from.getEpochSecond();   // 1970-01-01T00:00:00Z 로 부터 흐른 시간
        System.out.println("from = " + from);
        System.out.println("epochSecond = " + epochSecond);
        System.out.println();

        //
        Instant epochStart = Instant.ofEpochSecond(0);  // 1970-01-01T00:00:00Z 초로부터 0초 흐른 시간 생성
        System.out.println("epochStart = " + epochStart);
        System.out.println();

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        System.out.println();

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
        System.out.println();


/*
        Date laterToDate = Date.from(later);
        System.out.println("laterToDate = " + laterToDate);
        System.out.println();

        long time = laterToDate.getTime();
        System.out.println("time = " + time);
        System.out.println();

        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochSecond(time), ZoneId.of("Asia/Seoul"));
        System.out.println("ldt = " + ldt);
        System.out.println();
        */
    }

    public void re() {
        // 생성
        Instant now = Instant.now();// UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);// 하루
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }




}
