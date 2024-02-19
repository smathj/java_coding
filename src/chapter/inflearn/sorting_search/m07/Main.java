package chapter.inflearn.sorting_search.m07;

import java.util.*;


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
public class Main {



    public static class XY {
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
    }

    public void solution(LinkedList<XY> xyList) {



        // X 정렬
        for (int i = 0; i < xyList.size() -1; i++) {
/*
            XY frontObj = xyList.get(i);
            XY backObj = xyList.get(i+1);


            int frontX = frontObj.getX();
            int backX = backObj.getX();

            int frontY = frontObj.getY();
            int backY = backObj.getY();

            // 앞의 객체가 더 큰 x 좌표라면
            if (frontX > backX) {
                xyList.set(i, backObj);
                xyList.set(i+1, frontObj);
            }
            */
            for (int j = i+1; j < xyList.size(); j++) {

                XY frontObj = xyList.get(i);
                XY backObj = xyList.get(j);


                int frontX = frontObj.getX();
                int backX = backObj.getX();

                int frontY = frontObj.getY();
                int backY = backObj.getY();

                // 앞의 객체가 더 큰 x 좌표라면
                if (frontX > backX) {
                    xyList.set(i, backObj);
                    xyList.set(j, frontObj);
                }



            }

        }

        // Y 정렬
        for (int i = 0; i < xyList.size() -1; i++) {
            for (int j = i+1; j < xyList.size(); j++) {
                XY frontObj = xyList.get(i);
                XY backObj = xyList.get(j);


                int frontX = frontObj.getX();
                int backX = backObj.getX();

                int frontY = frontObj.getY();
                int backY = backObj.getY();

                // 앞의 객체가 더 큰 x 좌표라면
                if (frontX == backX && frontY > backY) {
                    xyList.set(i, backObj);
                    xyList.set(j, frontObj);
                }
            }
        }



        for (XY xy : xyList) {
            System.out.println(xy.getX() + " " + xy.getY());
        }





    }

    public static void main(String[] args) {
        Main T = new Main();

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