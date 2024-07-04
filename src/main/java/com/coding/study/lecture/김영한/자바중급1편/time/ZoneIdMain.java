package com.coding.study.lecture.김영한.자바중급1편.time;

import java.time.ZoneId;
import java.time.zone.ZoneRules;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {

        // 사용가능한 ZoneId 들
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
//            System.out.println("availableZoneId = " + availableZoneId);
            // ZoneId (일광절약시, 오프셋 다있다)
            ZoneId zoneId = ZoneId.of(availableZoneId);

            // 해당 ZoneId 의 규칙
            ZoneRules rules = zoneId.getRules();
            System.out.println(zoneId + " | " + rules);
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault() = " + zoneId.systemDefault());

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);

    }
}
