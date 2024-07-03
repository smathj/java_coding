package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m01_dfs;

import java.util.*;

//! 정답
/*

4
1 2 3 4

YES

4
1 2 3 6

5
2 3 4 5 6
 */
public class Main2_re {


    static int n;
    static int sum;
    static int sumRoop;

    static String answer = "NO";

    static int[] checkArr;
    static List<Integer> list;

    public void DFS(int v, int index) {

            if(sumRoop > sum / 2)
                return;

            if (answer.equals("YES")) {
                return;
            }

            // 누적합에 증가
            sumRoop += v;

            // 체크
            checkArr[index] = 1;

            if ((sum - sumRoop) == sumRoop) {
                answer = "YES";
            }

            for (int j = 0; j < list.size(); j++) {
                if (checkArr[j] == 0) {
                    DFS(list.get(j), j);
                }
            }


            // 체크 해제
            checkArr[index] = 0;
            sumRoop -= v;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        checkArr = new int[11];

        Main2_re main = new Main2_re();

        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            list.add(v);
            sum += v;
        }

        main.DFS(list.get(0), 0);
        System.out.println(answer);


    }
}
