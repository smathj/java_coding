package com.coding.study.lecture.인프런.김영한.자바중급1편.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {

        /**
         * Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: SecondOfMinute
         */
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}
