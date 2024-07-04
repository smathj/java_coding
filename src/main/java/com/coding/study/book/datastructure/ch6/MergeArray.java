package chapter.book.datastructure.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 병합정렬 아이디어
 */
public class MergeArray {

    /**
     * 병합 메서드
     * @param a 배열 a
     * @param na 배열 a 의 length
     * @param b 배열 b
     * @param nb 배열 b 의 length
     * @param c 배열 c (병합배열)
     */
    public static void merge(int[] a, int na, int[] b, int nb, int[] c) {

        // 각 배열의 인덱스 포인터
        int pa = 0;
        int pb = 0;
        int pc = 0;

        // c 배열 일부 셋팅하기
        while (pa < na && pb < nb) {
            // 큰놈 넣기
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
        }

        // pa가 덜 진행되었을때
        while (pa < na) {
            // 다음값을 셋팅해주고 1씩 증가 시킨다, 즉 이어 달리기
            c[pc++] = a[pa++];
        }

        // pb가 덜 진행되었을때
        while (pb < nb) {
            // 다음값을 셋팅해주고 1씩 증가 시킨다, 즉 이어 달리기
            c[pc++] = b[pb++];
        }





    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 4, 6, 8, 11, 13};             // 오름 차순 정렬했다고 생각하자
        int[] b = {1, 2, 3, 4, 9, 16, 21};          // 오름 차순 정렬했다고 생각하자
        int[] c = new int[13];


        System.out.println("두 배열을 병합");

        merge(a, a.length, b, b.length, c);

        System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다");
        System.out.println();

        System.out.println("배열 a: ");
        System.out.println(Arrays.toString(a));
        System.out.println();

        System.out.println("배열 b: ");
        System.out.println(Arrays.toString(b));
        System.out.println();

        System.out.println("배열 c: ");
        System.out.println(Arrays.toString(c));
        System.out.println();




    }
}
