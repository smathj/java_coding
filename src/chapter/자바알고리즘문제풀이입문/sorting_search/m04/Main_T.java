package chapter.자바알고리즘문제풀이입문.sorting_search.m04;

import java.util.Scanner;


/*

5 9
1 2 3 2 6 2 3 5 7

7 5 3 2 6

 */
public class Main_T {


    /**
     *
     * @param size 캐시 메모리 사이즈
     * @param n 작업의 갯수
     * @param arr 작업의 배열
     * @return
     */
    public int[] solution(int size, int n, int[] arr) {

        // 캐쉬 배열 생성
        int[] cache = new int[size];

        // 작업배열에서 작업을 하나씩 꺼낸다
        for (int x : arr) {

            // pos 초기화
            int pos = -1;

            // 캐쉬 배열에 작업이 있는지 찾고, 있다면 pos를 작업 인덱스로 초기화한다
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;

            // cache miss
            if (pos == -1) {

                // 캐쉬 배열의 제일 끝부터 1번 인덱스까지 <-- 방향으로 반복 (땡기기위해서 방향이 우에서 좌로간다)
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1]; // 앞의값이 뒤의값으로
                }


            // cache hit
            } else {
                // 매칭된 인덱스부터 1번 인덱스까지 <-- 방향으로 땡긴다 (cache miss와는 시작 지점이 다르다)
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1]; // 앞의값이 뒤의값으로
                }
            }

            // cache miss/hit 상관없이 땡겨졋으니 제일 앞에값을 넣는다
            // hit : 이미 있던값을 넣어 제일앞에 최신화
            // miss : 새로운값을 제일앞에 최신화
            cache[0] = x;

        }
        return cache;
    }

    public static void main(String[] args) {
        Main_T T = new Main_T();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
}

