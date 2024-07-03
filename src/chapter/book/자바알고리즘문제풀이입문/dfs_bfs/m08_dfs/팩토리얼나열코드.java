package chapter.book.자바알고리즘문제풀이입문.dfs_bfs.m08_dfs;

public class 팩토리얼나열코드 {

    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;

        // 4!의 모든 경우의 수 출력
        System.out.println("4!의 모든 경우의 수:");
        BFS(new int[n], 0);
    }

    public static void BFS(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n) {
            for (int val : arr) {
                System.out.print(val);
            }
            System.out.println();
        }

        for (int value = 1; value <= n; value++) {
            if (contains(arr, value, idx)) continue;
            arr[idx] = value;
            BFS(arr, idx + 1);
            arr[idx] = 0;
        }
    }


    /**
     * arr 배열에 val 값이 idx 이전의 인덱스에 존재하는지
     * 존재하면 true, 안하면 false
     */
    public static boolean contains(int[] arr, int val, int idx) {
        for (int i = 0; i < idx; i++) {
            if (arr[i] == val) return true;
        }
        return false;
    }


}
