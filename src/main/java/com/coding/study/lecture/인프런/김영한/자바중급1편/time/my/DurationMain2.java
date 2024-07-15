package com.coding.study.lecture.인프런.김영한.자바중급1편.time.my;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationMain2 {


    public static void main(String[] args) {


        LocalDateTime nowLdt = LocalDateTime.now();
        LocalDateTime afterLdt = nowLdt.plusHours(1)
                .plusMinutes(25)
                .plusSeconds(50)
            ;


        Duration duration = Duration.between(nowLdt, afterLdt);
        System.out.println("duration = " + duration);

        // "시간" 단위로의 차이, 60을 못넘는 분은 다 무시한다
        long hours = duration.toHours();


        // "분" 단위로의 차이 (배치 프로그램에서 쓸만함)
        long minutes = duration.toMinutes();

        // "초" 단위로의 차이
        long seconds = duration.toSeconds();

        System.out.println("hours = " + hours);
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + seconds);


        System.out.println(

        );
        long hours2 = ChronoUnit.HOURS.between(nowLdt, afterLdt);
        System.out.println("hours2 = " + hours2);
        long minutes2 = ChronoUnit.MINUTES.between(nowLdt, afterLdt);
        System.out.println("minutes2 = " + minutes2);
        long seconds2 = ChronoUnit.SECONDS.between(nowLdt, afterLdt);
        System.out.println("seconds2 = " + seconds2);
    }

}
