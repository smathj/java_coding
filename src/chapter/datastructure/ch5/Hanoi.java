package chapter.datastructure.ch5;

import java.util.Scanner;

public class Hanoi {


    /**
     * no 개의 원반을 x번 기둥에서 y번 기둥으로 옮긴다
     * @param no 원반의 갯수
     * @param x 출발 기둥
     * @param y 목표 기둥
     */
    public static void move(int no, int x, int y) {

        int mid = 6 - x - y;

        // ! (1) 그륩을 시작 기둥에서 중간 기둥으로
        // 바닥의 원반을 제외하고 나머지를 중간 기둥으로 옮긴다
        if (no > 1) {
            move(no - 1, x, mid);
        }

        // ! (2) 바닥의 원반을 시작 기둥에서 목표 기둥으로

        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

        // ! (3) 그륩을 중간 기둥에서 목표 기둥으로
        // 바닥의 원반을 제외한 그룹을 중간기둥에서 목표기둥으로 옮긴다
        if (no > 1) {
            move(no - 1, mid, y);
        }

    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = stdIn.nextInt();
        move(n, 1, 3);

    }
}
