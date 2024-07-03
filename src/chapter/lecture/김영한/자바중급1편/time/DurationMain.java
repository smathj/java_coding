package chapter.lecture.김영한.자바중급1편.time;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {


        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        // 계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간: " + plusTime);

        // 시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("between = " + between);
        System.out.println("차이: " + between.getSeconds() + "초");
        System.out.println("근무 시간: " + between.toHours() + "시간" + between.toMinutesPart() + "분");

        System.out.println();
        System.out.println();
        System.out.println();

        LocalDateTime startLdt = LocalDateTime.of(2024,7,4,10,20,30,111);
        LocalDateTime endLdt = LocalDateTime.of(2024,7,4,11,20,30,111);
        Duration between2 = Duration.between(startLdt, endLdt);
        System.out.println("between2 = " + between2);
        System.out.println("차이: " + between2.getSeconds() + "초");
        System.out.println("근무 시간: " + between2.toHours() + "시간" + between2.toMinutesPart() + "분");

    }
}
