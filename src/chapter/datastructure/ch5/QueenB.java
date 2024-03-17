package chapter.datastructure.ch5;

// 이게 뭐하는짓인지 몰겠다...
public class QueenB {

    public static int[] pos = new int[8];  // 각 열에 있는 퀸의 위치

    // * 각 열에 있는 퀸의 위치를 출력
    public static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    // * i 열에 퀸을 배치

    /**
     * @param i i 열
     */
    public static void set(int i) {
        /**
         * j 열
         */
        for (int j = 0; j < 8; j++) {
            pos[i] = j; // 퀸을 j행에 배치
            if (i == 7) {
                print();
            } else {
                set(i + 1);
            }
        }
    }


    public static void main(String[] args) {

        set(0); // 0열에 퀸을 배치

    }

}
