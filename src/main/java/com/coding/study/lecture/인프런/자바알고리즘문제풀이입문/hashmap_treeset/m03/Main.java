package chapter.book.자바알고리즘문제풀이입문.hashmap_treeset.m03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
7 4
20 12 20 10 23 17 10

3 4 4 3
 */
public class Main {

    // v1. timeout
/*

	 public void solution(int n, int k, int[] arr){


		// 7 - 4 = 3 (인덱스)
		for (int p1 = 0; p1 <= n - k; p1++) {
			Map<Integer, Integer> map =new HashMap<>();
			map.put(arr[p1], 1);
//			System.out.print(arr[p1] + " > ");
			for (int p2 = (p1+1); p2 < (p1+1) + k - 1; p2++) {
//				System.out.print(arr[p2] + " ");
				map.put(arr[p2], map.getOrDefault(arr[p2], 0) + 1);
			}
//			System.out.println(map);
			System.out.print(map.size() + " ");
		}
	}
*/

    // v2.
    public void solution(int n, int k, int[] arr) {


        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int p1 = 0; p1 < k - 1; p1++) {
            map.put(arr[p1], map.getOrDefault(arr[p1], 0) + 1);
        }

        int lt = 0;

        for (int p2 = k - 1; p2 < n; p2++) {

            // 현재 루프를 위한
            map.put(arr[p2], map.getOrDefault(arr[p2], 0) + 1); // 4
            result.add(map.size()); // 기록

            // 다음 루프를 위한 준비
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);

            lt++;

        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }


    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(n, k, arr);
    }
}