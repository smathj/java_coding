package chapter.lecture.김영한.자바중급1편.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {

        // 모든 날짜 클래스는 불변이다, 항상 리턴을 받아라
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d = " + ofDate);

    }

}
