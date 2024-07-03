package chapter.book.datastructure.ch6;

import java.util.Arrays;

public class ArraysSortTester {
    public static void main(String[] args) {



        int[] x = {6, 4, 3, 7, 1, 9, 8};
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("오름차순으로 정렬합니다");
        System.out.println(Arrays.toString(x));

    }
}

