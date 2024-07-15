package com.coding.study.lecture.인프런.김영한.자바중급1편.time.my;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class JwtTokenTimeMain2 {



    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("instant = " + instant);
        long instantEpochSecond = instant.getEpochSecond();
        System.out.println("instantEpochSecond = " + instantEpochSecond);

        // 생성일
        // Date 타입으로 만들시,자동으로 UTC 시간으로 변환해서 만든다
        Date createDate = Date.from(instant);
        // toString 에서 TimeZone zi = date.getZone(); 로 시스템의 디폴트로 존이 잡힌다
        System.out.println("createDate = " + createDate);
        long createDateTimeEpochSecond = createDate.getTime();
        System.out.println("createDateTimeEpochSecond = " + createDateTimeEpochSecond);

        // 출력되는거에 속지마라, 실제로는
        System.out.println("instantEpochSecond == createDateTimeEpochSecond => " + (instantEpochSecond == createDateTimeEpochSecond));

        ZonedDateTime zdt1 = ZonedDateTime.now();
        Instant instant1 = Instant.from(zdt1);
        System.out.println("instant1 = " + instant1);
        System.out.println("instant1.getEpochSecond() = " + instant1.getEpochSecond());

        // 1초 추가
        ZonedDateTime zdt2 = zdt1.plusSeconds(1);
        Instant instant2 = Instant.from(zdt2);
        System.out.println("instant2 = " + instant2);
        System.out.println("instant2.getEpochSecond() = " + instant2.getEpochSecond());

        Date date1 = Date.from(instant1);
        System.out.println("date1.getTime() = " + date1.getTime());

        Date date2 = Date.from(instant2);
        System.out.println("date2.getTime() = " + date2.getTime());

        System.out.println("date1.equals(date2) = " + date1.equals(date2));

        System.out.println("date1.getTime() == date2.getTime()  = " + (date1.getTime() == date2.getTime()));

        System.out.println("zdt1.isEqual(zdt2) == " + zdt1.isEqual(zdt2));
    }
}
