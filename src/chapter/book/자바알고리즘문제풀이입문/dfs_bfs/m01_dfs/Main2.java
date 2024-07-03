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
public class Main2 {


    static int n;
    static int sum;
    static int sumRoop;

    static String answer = "NO";

    static int[] checkArr;
    static List<Integer> list;

    public void DFS(int v, int index) {

        //! 방금이건 반복문 내에서 이런게 있어야하고, 그건 너비 우선 탐색 BFS 에서 적합하다, while 문 내에서
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        while (!queue.isEmpty()) {

            if (answer.equals("YES")) {
                break;
            }

            int value = queue.poll();

            // 누적합에 증가
            sumRoop += value;

            // 체크
            checkArr[index] = 1;

            if ((sum - sumRoop) == sumRoop) {
                answer = "YES";
                break;
            }

            for (int j = 0; j < list.size(); j++) {
                if (checkArr[j] == 0) {
                    DFS(list.get(j), j);
                }
            }


            // 체크 해제
            checkArr[index] = 0;
            sumRoop -= value;

        }

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        checkArr = new int[11];

        Main2 main = new Main2();

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
