package chapter.book.quiz;

import java.util.Scanner;

/**
 * 하노이 탑 - 1
 */
public class chapter4_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("원반의 개수를 입력해주세요 ");

        int disks = sc.nextInt();

        System.out.println("[결과]");
        topOfHanoi(disks, "A", "B", "C");
    }

    private static void topOfHanoi(int disks, String begin, String middle, String end) {
        if (disks == 1) {
            System.out.println(String.format("1번 원반을 %s 기둥으로 옮깁니다", end));
        } else {
            System.out.println(String.format("%s개 이상의 원반을 구할 수 없습니다", disks));
        }
    }


}
