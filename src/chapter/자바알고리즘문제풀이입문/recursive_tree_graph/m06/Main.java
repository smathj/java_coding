package chapter.자바알고리즘문제풀이입문.recursive_tree_graph.m06;

public class Main {

    public static final int N = 3;
    public static final int[] arr = new int[N+1];



    public static void DFS(int num) {
        // 기저조건 (재귀 종료 영역)
        if (num == N + 1) {
            // 다 끝난거임
            String temp = "";
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] == 1)
                    temp += i + " ";
            }

            if(temp.length() > 0)
                System.out.println(temp);

        // 재귀 영역
        // 사용한다, 사용안한다
        } else {

            // 다시 재귀 호출하여
            // 현재 노드를 사용하고 그다음 자식 노드를 사용 or 미사용
            arr[num] = 1;
            DFS(num+1);

            // 다시 재귀 호출하여
            // 현재 노드를 사용 하지않고 그다음 자식 노드를 사용 or 미사용
            arr[num] = 0;
            DFS(num+1);
        }
    }


    public static void main(String[] args) {

        DFS(1);

    }
}
