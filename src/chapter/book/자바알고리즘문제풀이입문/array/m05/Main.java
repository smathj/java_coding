package chapter.book.자바알고리즘문제풀이입문.array.m05;

import java.util.Scanner;

/**
 * 시간제한 1초
 */
public class Main {

    public void solution(int param){

        int count = 0;

        for (int i = 2; i <= param; i++) {

            if (i == 2 || i == 3) {
                count++;
                continue;
            // 2의 배수도 x, 3의 배수도 x
            } else if(i % 2 != 0 && i % 3 != 0) {
                count++;
                continue;
            }

        }

        System.out.println(count);

    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int param = scanner.nextInt();
        main.solution(param);

    }

}
