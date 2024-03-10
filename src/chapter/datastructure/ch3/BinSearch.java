package chapter.datastructure.ch3;

import java.util.Scanner;

public class BinSearch {


    public static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl + pr) / 2;    // 중앙 요소의 인덱스, 반복하다보면 중앙 또는 pl과 같아진다 이게 핵심

            if (a[pc] == key) {
                return pc;  // 인덱스 리턴
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;  // 실패 -1 리턴
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];
        System.out.println("오름차순 으로 입력하세요");

        System.out.print("x[0]: ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x["+ i +"]: ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);  // 바로 앞의 요소보다 작으면 다시 입력받는다
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다");
        }
    }

}
