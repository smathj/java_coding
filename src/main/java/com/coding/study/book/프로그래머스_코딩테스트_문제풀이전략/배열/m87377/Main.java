package chapter.book.프로그래머스_코딩테스트_문제풀이전략.배열.m87377;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static class Point {
        public final long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public Point intersection(long a1,long b1,long c1,long a2,long b2,long c2) {
        // 교점 구해서 반환한다
        // 교점은 정수가 아닐 수있다 Not int
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        // 정수면 1로 나누면 0이다, 그게아니면 정수가 아니다, 소수
        if(x % 1 != 0 || y % 1 != 0)
            return null;

        return new Point((long) x, (long) y);
    }

    public Point getMinimumPoint(List<Point> points) {
        // 가장 작은 좌표 찾기
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point point : points) {
            if(point.x < x) x = point.x;
            if(point.y < y) y = point.y;
        }

        return new Point(x, y);
    }

    public Point getMaximumPoint(List<Point> points) {
        // 가장 큰 좌표 찾기
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point point : points) {
            if(point.x > x) x = point.x;
            if(point.y > y) y = point.y;
        }

        return new Point(x, y);
    }

    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i+1; j < line.length; j++) {
                // 두 직선의 교점 구하기
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if (intersection != null) {
                    points.add(intersection);
                }
            }

        }

        Point minimumPoint = getMinimumPoint(points);
        Point maximumPoint = getMaximumPoint(points);
        // 좌표 가로 길이 ('길이'니까 차이에 1 더한다)
        int width = (int) (maximumPoint.x - minimumPoint.x + 1);

        // 좌표 세로 길이 ('길이'니까 차이에 1 더한다)
        int height = (int) (maximumPoint.y - minimumPoint.y + 1);

        // 높이 마다 가로가 있으니 [height][width] 순서
        char[][] arr = new char[height][width];

        // 점을 표현하는 . 마킹
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point point : points) {
            int x = (int) (point.x - minimumPoint.x);   // 열
            int y = (int) (maximumPoint.y - point.y);   // 행
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        Main main = new Main();

        int[][] line = new int[5][5];

        line[0] = new int[]{2, -1, 4};      // 2x-y=4
        line[1] = new int[]{-2, -1, 4};     // -2x-y=4
        line[2] = new int[]{0, -1, 1};      // y=-1
        line[3] = new int[]{5, -8, -12};    // 5x-8y=-12
        line[4] = new int[]{5, 8, 12};      // 5x-8y=12

        System.out.println(Arrays.toString(main.solution(line)));


    }

}
