package chapter.자바알고리즘문제풀이입문.array.m03;

import java.util.Scanner;


public class Main {

    /**
     *
     * @param count         게임 횟수
     * @param v1StrArr      철수의 패
     * @param v2StrArr      영희의 패
     * @return
     */
    public void solution(int count, int[] v1StrArr, int[] v2StrArr){

        String answer = "";
        for (int i = 0; i < count; i++) {
            // 1: 가위, 2: 바위, 3: 보
            Integer v1 = v1StrArr[i];
            Integer v2 = v2StrArr[i];

            // 철수가 영희보다 클때 (승리 => A)
            // 철수가 영희보다 작을때 (패배 => B)
            // 철수가 영희랑 같을때  (동점 => D)

            // 철수 가위(1) -> 영희 보(3) or 가위(1) - else
            // 철수 바위(2) -> 영희 가위(1) or 바위(2) - else
            // 철수 보(3)   -> 영희 바위(2) or 보(3) - else

            // 철수 가위
            if (v1 == 1) {
                if (v2 == 3) {
                    answer = "A";
                } else if (v2 == 1) {
                    answer = "D";
                } else {
                    answer = "B";
                }
            }

            if (v1 == 2) {
                if (v2 == 1) {
                    answer = "A";
                } else if (v2 == 2) {
                    answer = "D";
                } else {
                    answer = "B";
                }
            }


            if (v1 == 3) {
                if (v2 == 2) {
                    answer = "A";
                } else if (v2 == 3) {
                    answer = "D";
                } else {
                    answer = "B";
                }
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();

        int[] v1Arr = new int[count];
        int[] v2Arr = new int[count];

        for (int i = 0; i < count; i++) {
            v1Arr[i] = kb.nextInt();
        }
        for (int i = 0; i < count; i++) {
            v2Arr[i] = kb.nextInt();
        }


        T.solution(count, v1Arr, v2Arr);




    }
}