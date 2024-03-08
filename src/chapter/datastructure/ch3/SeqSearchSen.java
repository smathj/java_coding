package chapter.datastructure.ch3;

import java.util.Scanner;

/*
7
6
4
3
2
1
2
8
2


 */
public class SeqSearchSen {

    public static int seqSearchSen(int[] a, int n, int key) {

        int i = 0;

        // 보초
        a[n] = key;

        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }

        // 보초로서 검색 성공한거면 -1, 아니면 1
        return i == n ? -1 : 1;



    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요소의수: ");
        int num = sc.nextInt();

        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = seqSearchSen(x, num, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다");
        }

    }
}
