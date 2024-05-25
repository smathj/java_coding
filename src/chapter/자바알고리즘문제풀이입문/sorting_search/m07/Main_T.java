package chapter.자바알고리즘문제풀이입문.sorting_search.m07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/*

▣ 입력예제 1
5
2 7
1 3
1 2
2 5
3 6

▣ 출력예제 1
1 2
1 3
2 5
2 7
3 6
 */
public class Main_T {


    public static class Point implements Comparable<Point> {
        public int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point o : arr) System.out.println(o.x + " " + o.y);
    }
}

