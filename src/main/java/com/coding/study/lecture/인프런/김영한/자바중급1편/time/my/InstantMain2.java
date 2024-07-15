package com.coding.study.lecture.인프런.김영한.자바중급1편.time.my;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class InstantMain2 {

    public static void main(String[] args) {

        // UTC 현재시간을 구한
        Instant nowInstant = Instant.now();
        System.out.println("nowInstant = " + nowInstant);

        // UTC 로부터 Date 객체 생성한다
        Date nowInstantToDate = Date.from(nowInstant);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:zzz");
        System.out.println("nowInstantToDate = " + sdf.format(nowInstantToDate));

        // Date 객체의 타임스탬프 확인
        long time = nowInstantToDate.getTime();
        System.out.println("time = " + time);

        // Date 객체를 다시 UTC로 바꾸고 ZoneId를 추가해서 서울의 시간으로 바꿔본다
//        ZonedDateTime ldt = ZonedDateTime.ofInstant(Instant.ofEpochSecond(time), ZoneId.of("Asia/Seoul"));
        ZonedDateTime ldt = ZonedDateTime.ofInstant(nowInstantToDate.toInstant(), ZoneId.of("Asia/Seoul"));
        System.out.println("ldt = " + ldt);


    }
}
