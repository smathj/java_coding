package chapter.lecture.패스트캠퍼스.part1.ch5_sort.m07;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

//! 시간초과
public class Main {

    public static void main(String[] args) throws Exception {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        int N = Integer.parseInt(br.readLine());

        List<Pointer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(v -> Integer.parseInt(v)).toArray();
            list.add(new Pointer(arr[0], arr[1], i));
        }


        Collections.sort(list, (o1, o2) -> {
            return o1.right - o2.right;
        });

        Collections.sort(list, (o1, o2) -> {
            return o1.left - o2.left;
        });

        for (Pointer pointer : list) {
            System.out.println(pointer);
        }

        int max = 0;

        for (int i = 0; i < N; i++) {
            int cnt = 1;
            int fromValue = list.get(i).right;  // 6

            final int fivalFromValue = fromValue;
            final int fivalFromIndex = i;

            Integer findIndex = list.stream()
                    .filter(pointer -> pointer.index != fivalFromIndex && pointer.left >= fivalFromValue)
                    .findFirst()
                    .map(pointer -> pointer.index).orElse(null);
            System.out.println("findIndex = " + findIndex);
            if(findIndex == null) continue;

            for (int j = findIndex; j < list.size(); j++) {
                Pointer nextPointer = list.get(j);
                if (nextPointer.left >= fromValue) {
                    fromValue = nextPointer.right;
                    cnt++;
                }
            }

            /*
            for (int j = i+1; j < list.size(); j++) {
                Pointer nextPointer = list.get(j);
                if (nextPointer.left >= fromValue) {
                    fromValue = nextPointer.right;
                    cnt++;
                } else {
                    continue;
                }
            }
            */

            if(cnt >= max) max = cnt;
        }

        System.out.println(max);

    }

    public static class Pointer {

        private int left;
        private int right;
        private int index;


        public Pointer(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public Pointer(int left, int right, int index) {
            this.left = left;
            this.right = right;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Pointer{" +
                    "left=" + left +
                    ", right=" + right +
                    ", index=" + index +
                    '}';
        }
    }

}
