package chapter.lecture.패스트캠퍼스.part1.ch7_binary_search.m02;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < N + 1 ; i++) {
            list.add(arr[i]);
        }


        int max = 0;
        // 시간초과 코드
        // 1000 * 1000 * 1000 = 10^9
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.size(); k++) {
                    int sum = list.get(i) + list.get(j) + list.get(k);
                    if (list.contains(sum)) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);


    }
}
