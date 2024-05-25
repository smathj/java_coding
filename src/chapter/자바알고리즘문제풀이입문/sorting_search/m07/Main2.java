package chapter.자바알고리즘문제풀이입문.sorting_search.m07;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



// ! Time Out
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
public class Main2 {



    public static class XY implements Comparable<XY> {
        public int x;
        public int y;
        @Override
        public String toString() {
            return "XY{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int compareTo(XY xy) {
            if (this.getX() == xy.getX()) {
                return this.getY() - xy.getY();
            } else {
                return this.getX() - xy.getX();
            }
        }
    }

    public void solution(List<XY> xyList) {
        Collections.sort(xyList);
        for (XY xy : xyList) {
            System.out.println(xy.getX() + " " + xy.getY());
        }





    }

    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int[] arr = new int[size * 2];
        for (int i = 0; i < (size * 2); i++) {
            arr[i] = kb.nextInt();
        }

        LinkedList<XY> xyList = new LinkedList<>();

        for (int i = 1; i < (size * 2); i=i+2) {
            xyList.add(new XY(arr[i - 1], arr[i]));
        }

        T.solution(xyList);
    }

}