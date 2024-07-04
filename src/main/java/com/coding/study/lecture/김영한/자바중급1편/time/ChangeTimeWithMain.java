package com.coding.study.lecture.김영한.자바중급1편.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 날짜와 시간을 조작하는 with 메서드
 */
public class ChangeTimeWithMain {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        // 연도만 쓱 바꿈
        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);

        // 이러면 에러 난다 숫자만 바꾸는거지 더하거나 늘리는 개념이 아니다
//        LocalDateTime changedDt2 = dt.with(ChronoField.SECOND_OF_MINUTE, 60);
//        System.out.println("changedDt2 = " + changedDt2);

        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);

        // TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 : " + dt);
        System.out.println("다음 금요일 : " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일 = " + with2);

    }
}
