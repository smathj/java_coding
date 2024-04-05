package chapter.quiz;

import java.util.Scanner;

/**
 * 하노이 탑 - 2
 */
public class chapter4_6 {
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
            return;
        }

        // 첫번쨰 기둥에서 두번쨰 기둥으로 보내는 재귀
        topOfHanoi(disks - 1, begin, end, middle);

        // disk -1 이였으니 현재 disk를 세번쨰 기둥으로 보낸다
        System.out.println(String.format("%s번 원반을 %s 기둥으로 옮깁니다", disks, end));

        // 두번째 기둥에서 세번째 기둥으로 보내는 재귀
        topOfHanoi(disks - 1, middle, begin, end);

    }


}
