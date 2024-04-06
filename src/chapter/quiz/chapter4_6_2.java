package chapter.quiz;

/**
 * 하노이 탑 - 2
 */
public class chapter4_6_2 {
    public static void main(String[] args) {

        int disks = 3;
        System.out.println("원반의 개수를 입력해주세요 : 3");


        System.out.println("[결과]");
        topOfHanoi(disks, "A", "B", "C");
    }


    private static void topOfHanoi(int disks, String A, String B, String C) {

        // 기저조건
        if (disks == 1) {
            System.out.println(String.format("1번 원반을 %s 기둥으로 옮깁니다", C));
            return;
        }

        // 마지막 원반을 제외한 나머지를 A -> B 로 옮긴다
        topOfHanoi(disks - 1, A, C, B);

        // A에 혼자 남겨진 원반을 C로 옮긴다 A -> C
        System.out.println(String.format("%s번 원반을 %s 기둥으로 옮깁니다", disks, C));

        // B에 있는 모든 원반을 C로 옮긴다 B -> C
        topOfHanoi(disks - 1, B, A, C);

    }


}
