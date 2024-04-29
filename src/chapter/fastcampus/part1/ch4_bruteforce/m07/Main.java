package chapter.fastcampus.part1.ch4_bruteforce.m07;

import java.util.Scanner;

/**
 * 판화 1730
 */

/*

-----------------------------------------------------------
5
DRDRRUU

|..|.
++.|.
.+-+.
.....
.....

-----------------------------------------------------------
4
RRRDDDDULL

---+
...|
.--+
...|


-----------------------------------------------------------
5
RRDDLLUURRDDLLUUR

+-+..
|.|..
+-+..
.....
.....


 */
public class Main {

    public static int[][] arr = null;
    public static void main(String[] args) {

        // 2 <= N <= 10
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String command = sc.hasNext() ? sc.next() : "";

        // 수직 배열
        boolean[][] passVertical = new boolean[N][N];

        // 수평 배열
        boolean[][] passHorizontal = new boolean[N][N];

        int curR = 0;   // 행
        int curC = 0;   // 열

        for (int i = 0; i < command.length(); i++) {
            char cmd = command.charAt(i);

            // 아래
            if (cmd == 'D') {
                if(curR == N-1) continue;
                // from ~ to  둘다 흔적 남기기
                passVertical[curR][curC] = passVertical[curR + 1][curC] = true;
                curR++;
            }

            // 위
            else if (cmd == 'U') {
                if(curR == 0) continue;
                // from ~ to  둘다 흔적 남기기
                passVertical[curR][curC] = passVertical[curR - 1][curC] = true;
                curR--;
            }

            // 왼쪽
            else if (cmd == 'L') {
                if(curC == 0) continue;
                // from ~ to  둘다 흔적 남기기
                passHorizontal[curR][curC] = passHorizontal[curR][curC - 1] = true;
                curC--;
            }

            // 오른쪽
            else {
                if(curC == N-1) continue;
                // from ~ to  둘다 흔적 남기기
                passHorizontal[curR][curC] = passHorizontal[curR][curC + 1] = true;
                curC++;
            }
        }

        for (int i = 0; i < N; i++) {
            String ans = "";
            for (int j = 0; j < N; j++) {
                if(passVertical[i][j] && passHorizontal[i][j]) ans += "+";
                else if(passVertical[i][j]) ans += "|";
                else if(passHorizontal[i][j]) ans += "-";
                else ans += ".";
            }
            System.out.println(ans);
        }
    }


}