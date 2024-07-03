package chapter.lecture.김영한.자바중급1편.time;

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


        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);           // LocalDateTime 은 안됨
        long epochSecond = from.getEpochSecond();   // 1970-01-01T00:00:00Z 로 부터 흐른 시간
        System.out.println("from = " + from);
        System.out.println("epochSecond = " + epochSecond);


        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);

        Date laterToDate = Date.from(later);
        System.out.println("laterToDate = " + laterToDate);
        long time = laterToDate.getTime();
        System.out.println("time = " + time);
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochSecond(time), ZoneId.of("Asia/Seoul"));
        System.out.println("ldt = " + ldt);
    }
}
