package chapter.자바알고리즘문제풀이입문.recursive_tree_graph.m06;




public class Main_T {

    public static int n;
    public static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                // 인덱스를 출력할거다
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L + 1); // 왼쪽
            ch[L] = 0;
            DFS(L + 1); // 오른쪽
        }
    }

    public static void main(String[] args) {
        Main_T T = new Main_T();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);


    }

}