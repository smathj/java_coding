package com.coding.study.lecture.인프런.김영한.자바중급1편.time;

import java.time.temporal.ChronoField;

/**
 * 시간의 필드
 */
public class ChronoFieldMain {

    public static void main(String[] args) {

        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }
        System.out.println();

        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());

    }
}
