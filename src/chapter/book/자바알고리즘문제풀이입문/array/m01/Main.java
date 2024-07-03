package chapter.book.자바알고리즘문제풀이입문.array.m01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {
    public List<Integer> solution(int initValue, int[] param){

        List<Integer> result = new ArrayList<>();


        for (int i=0; i < param.length; i++) {

            if (i == 0) {
                result.add(param[i]);
            } else {
                if (param[i] > param[i-1]) {
                    result.add(param[i]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int initValue = kb.nextInt();   // n개의 정수
        int[] intArr = new int[initValue];  // 크기만큼의 배열 생성

        for (int i = 0; i < initValue; i++) {
            intArr[i] = kb.nextInt();
        }


        List<Integer> solution = T.solution(initValue, intArr);
        for (Integer value : solution) {
            System.out.print((int) value + " ");
        }

    }
}