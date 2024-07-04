package chapter.book.quiz.algorithm.merge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{5, 2, 30, 11, 9, 17, 12, 24};

        System.out.println(String.format("초기 배열: %s \n", Arrays.toString(arr)));

        mergeSort.merge(arr, 0, arr.length - 1);


        System.out.println("병합 정렬 완료 후: " + Arrays.toString(arr));

    }
}
