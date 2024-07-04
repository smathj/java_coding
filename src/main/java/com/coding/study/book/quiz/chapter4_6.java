package chapter.book.quiz;

import java.util.Scanner;

/**
 * 하노이 탑 - 2
 */
public class chapter4_6 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.printf("원반의 개수를 입력해주세요 ");
//        int disks = sc.nextInt();
        int disks = 3;
        System.out.println("원반의 개수를 입력해주세요 : 3");


        System.out.println("[결과]");
        topOfHanoi(disks, "A", "B", "C");
    }

    /**
     *
     * @param disks 원반(번호)
     * @param A 기둥 A
     * @param B 기둥 B
     * @param C 기둥 C
     */
    private static void topOfHanoi(int disks, String A, String B, String C) {

        // 기저조건
        if (disks == 1) {
            System.out.println(String.format("1번 원반을 %s 기둥으로 옮깁니다", C));
            return;
        }

        // 첫번쨰 기둥에서 두번쨰 기둥으로 보내는 재귀
        //! 현재 원반을 제외한 나머지 원반을
        //! 기둥 A 에서 B로 보낸다 (재귀)
        topOfHanoi(disks - 1, A, C, B);

        //! 현재 disk를 기둥 C로 보낸다
        System.out.println(String.format("%s번 원반을 %s 기둥으로 옮깁니다", disks, C));

        // 두번째 기둥에서 세번째 기둥으로 보내는 재귀
        //! 현재 원발을 제외한 나머지 원발을
        //! 기둥 B에서 C로 보낸다 (재귀)
        topOfHanoi(disks - 1, B, A, C);

    }


}

