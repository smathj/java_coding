package chapter.자바알고리즘문제풀이입문.sorting_search.m04;

import java.util.Scanner;


/*

5 9
1 2 3 2 6 2 3 5 7

7 5 3 2 6

 */
public class Main {


    public void solution(int memorySize, int[] arr) {

        int[] memoryArr = new int[memorySize];

        for (int i = 0; i < arr.length; i++) {

            int findIdx = -1;

            for (int j = 0; j < memoryArr.length; j++) {
                if (arr[i] == memoryArr[j]) {
                    findIdx = j;
                }
            }

            // 캐쉬 미스
            if (findIdx == -1) {
                // memoryArr 을 하나씩 뒤로 민다
                // 뒤에서 떙긴다,
                for (int j = memoryArr.length - 1; j >= 1; j--) {
                    memoryArr[j] = memoryArr[j - 1];
                }

            // 캐쉬 히트
            } else {
                // 찾은거 기준으로 뒤에서 땡긴다, findIdx 뒤로는 건들면 안된다
                for (int j = findIdx; j >= 1; j--) {
                    memoryArr[j] = memoryArr[j - 1];
                }
            }
            memoryArr[0] = arr[i];


        }


        for (int i = 0; i < memoryArr.length; i++) {
            System.out.print(memoryArr[i] + " ");
        }


    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int memorySize = kb.nextInt();
        int jobCount = kb.nextInt();

        int[] arr = new int[jobCount];

        for (int i = 0; i < jobCount; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(memorySize, arr);
    }

}