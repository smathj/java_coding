package chapter.lecture.패스트캠퍼스.part1.ch5_sort.m06;


import java.io.*;
import java.util.*;

public class Main2 {

    public static class Point {
        public int data;
        public int inputIndex;
        public int cnt;

        public Point() {
        }

        public Point(Integer data, Integer inputIndex) {
            this.data = data;
            this.inputIndex = inputIndex;
        }

        public Point(Integer data, Integer inputIndex, Integer cnt) {
            this.data = data;
            this.inputIndex = inputIndex;
            this.cnt = cnt;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "data=" + data +
                    ", inputIndex=" + inputIndex +
                    ", cnt=" + cnt +
                    '}';
        }


    }
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int C = Integer.parseInt(split[1]);


        String[] arr = br.readLine().split(" ");


        Map<Integer, Point> map = new HashMap<>();
        List<Point> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(arr[i]);
            if(num > C) continue;
            Point point = map.getOrDefault(num, new Point(num, i));
            if(point.cnt == 0) point.cnt = 1;
            else point.cnt++;
            map.put(num, point);
        }

        for (Point point : map.values()) {
            list.add(point);
        }

        Collections.sort(list, (p1, p2) -> {
            // 등장 횟수가 같으면 inputIndex 오름 차순
            if (p1.cnt == p2.cnt) {
                return p1.inputIndex - p2.inputIndex;
            }
            // 많이 등장한 내림차순
            return p2.cnt - p1.cnt;
        });


        for (Point point : list) {
            Integer cnt = point.cnt;
            for (int i = 0; i < cnt; i++) {
                bw.write(point.data + " ");
            }
        }

        bw.flush();


    }
}
