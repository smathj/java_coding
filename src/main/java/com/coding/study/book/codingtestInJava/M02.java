package chapter.book.codingtestInJava;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 배열 정렬하기
 */
public class M02 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{4,2,2,1,3,4})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));



    }

    public static int[] solution(int[] arr) {
        // 중복값을 제거
//        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Integer[] result = (Integer[]) Arrays.stream(arr).boxed().distinct().toArray(value -> {
//            System.out.println("value = " + value);
            return new Integer[value];
        });

        // 내림차순 정렬
        Arrays.sort(result, Collections.reverseOrder());
        // int 형 배열로 변경 후 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

}
