package com.coding.study.lecture.패스트캠퍼스.part1.ch5_sort.m07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//? 정답
public class Main3 {

    public static class Pointer {
        public int start;
        public int end;

        public Pointer(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws Exception {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        Pointer[] arr = new Pointer[N];

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            int start = Integer.parseInt(split[0]);
            int end = Integer.parseInt(split[1]);
            arr[i] = new Pointer(start, end);
        }

        // 회의 끝나는 시간 오름차순
        //   - 끝나는 시간이 같을때는, 시작시간 오름 차순
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.end == o2.end) {
                return o1.start - o2.start;    
            }
            return o1.end - o2.end;    
        });

        int cnt = 0;
        int tempEnd = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i].start >= tempEnd) {
                cnt++;
                tempEnd = arr[i].end;
            }
        }

        System.out.println(cnt);

    }



}
