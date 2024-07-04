package com.coding.study.lecture.김영한.자바중급1편.time.my;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.MacAlgorithm;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.util.Date;

/**
 * JWT 쓸대 시간을 늘리고 했었는데 그걸 해보자
 * 내기억에 JWT 라이브러리는 Date 타입을 받았다
 */
public class JwtTokenTimeMain {

    public static String createToken() {
        String secretKey = "66650E3CBCF3E6E1DB2F5D3CDCAB8B9AED0198DE0C060064E270C2199329F1B85191162AA80AD0C4EC79A38E2E475186E9E7F0BBAD38D05A9C732F5B5B5E7B2C";

        byte[] secretKeyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        SecretKey key = Keys.hmacShaKeyFor(secretKeyBytes);// 512 바이트이면 SHA-512 동작한다


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");

        // 현재 순간 (UTC 기준)
        Instant instant = Instant.now();


        // 생성일
        // Date 타입으로 만들시,자동으로 UTC 시간으로 변환해서 만든다
        // 하지만 표현하기를 offset 이 반영된것 처럼 나타낸다 => 이를 이용한다, jwt 라이브러리가 Date 타입을 쓰니
        Date createDate = Date.from(instant);
        String startDateText = sdf.format(createDate);
        System.out.println("startDateText = " + startDateText);


        // 만료일

        // 30초
//        Instant plusInstant = instant.plus(30, ChronoUnit.SECONDS);

        // 30초 (메서드 다름)
//        Instant plusInstant = instant.plusSeconds(30);

        // 5분
        Duration duration = Duration.ofMinutes(5);
        Instant plusInstant = instant.plus(duration);

        Date endDate = Date.from(plusInstant);    // 30초 후
        String endDateText = sdf.format(endDate);
        System.out.println("endDateText = " + endDateText);

        MacAlgorithm hs512 = Jwts.SIG.HS512;
        String token = Jwts.builder()
                .subject("토큰제목")
                .issuedAt(createDate)   // Date 타입만 받음 -> 사실은 UTC 시간이 들어있다
                .expiration(endDate)    // Date 타입만 받음 -> 사실은 UTC 시간이 들어있다
                .claim("userId", "1111")
                .claim("password", "2222")
                .signWith(key, hs512)  // 서명
                .issuer("ksj")
                .compact();


        System.out.println("token");
        System.out.println(token);

        return token;
    }

    public static void main(String[] args) {

        String token = createToken();

    }
}
