package chapter.book.자바알고리즘문제풀이입문.array.m02;

import java.util.Scanner;


class Main {
    public int solution(int initValue, int[] param){

        int max = param[0];
        int count = 0;

        for (int i=0; i < param.length; i++) {
            if (i == 0) {
                count += 1;

            } else {

                if(param[i] > max) {
                    max = param[i];
                    count += 1;
                }
            }

        }

        return count;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int initValue = kb.nextInt();       // n개의 정수
        int[] intArr = new int[initValue];  // 크기만큼의 배열 생성

        for (int i = 0; i < initValue; i++) {
            intArr[i] = kb.nextInt();
        }

        System.out.println(T.solution(initValue, intArr));

    }
}