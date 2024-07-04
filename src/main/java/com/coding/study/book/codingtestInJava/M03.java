package chapter.book.codingtestInJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class M03 {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(solution(new int[]{5, 0, 2, 7})));


    }

    public static int[] solution(int[] numbers) {

        HashSet<Integer> hash = new HashSet<>();

        // 서로 다른 인덱스만 뽑아서 조합해야한다
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j)
                    hash.add(numbers[i] + numbers[j]);
            }
        }


        int[] answer = new int[hash.size()];
        Iterator<Integer> itr = hash.iterator();
        int i = 0;
        while (itr.hasNext()) {
            answer[i] = itr.next();
            i++;
        }

        Arrays.sort(answer);
        return answer;
    }

}
