package chapter.book.자바알고리즘문제풀이입문.stack_queue.m03;

import java.util.*;


/*
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4

4

6
0 0 0 0 0 0
0 0 1 0 3 1
0 2 5 0 1 1
4 2 4 4 2 3
3 5 1 3 1 3
4 2 4 4 2 3
10
1 5 3 5 1 2 1 4 3 4

6

 */
public class Main {
    public void solution(int n, int[][] board, int stackSize, int[] arr) {

//        System.out.println("n = " + n);
//        System.out.println("board = " + Arrays.deepToString(board));
//        System.out.println("stackSize = " + stackSize);
//        System.out.println("arr = " + Arrays.toString(arr));

        Map<Integer, Stack<Integer>> boardMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Stack<Integer> st = new Stack<Integer>();
            boardMap.put((i + 1), st);
        }


        // 제일 오른쪽 배열부터 바닥쌓기
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            // 좌에서 우로
            for (int j = 0; j < n; j++) {
                int v = board[i][j];
                // 이값을 해당 스택꺼내서 넣어주기..
                Stack<Integer> st = boardMap.get(j + 1);
                if (v != 0) {
                    st.push(v);
                }
            }

        }
//        System.out.println("boardMap = " + boardMap);

        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
		int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int mapKeyNum = arr[i];
            Stack<Integer> mapStack = boardMap.get(mapKeyNum);
            if (!mapStack.isEmpty()) {
				int value = mapStack.pop();
				list.add(value);
				st.push(value);

            }
        }

//		System.out.println("list = " + list);
		int a = 0;
		while (a <= stackSize) {
			for (int i = 0; i < list.size(); i++) {
					if (list.size() > i+1 && list.get(i) == list.get(i+1)) {
						List<Integer> left = list.subList(0, i);
						List<Integer> right = list.subList(i+2, list.size());
//                        System.out.println("(i, i+1) = (" + i + "," + (i+1) + ")");
//                        System.out.println("list.get(i) : "+ list.get(i) + ", list.get(i+1) :" + list.get((i+1)));
//                        System.out.println("left = " + left);
//                        System.out.println("right = " + right);
//                        System.out.println("list = " + list);
//                        System.out.println();
						left.addAll(right);
						list = left;
						i = -1;
						count++;
						count++;

					}
			}
			a++;
		}

		System.out.println(count);

	}

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        int stackSize = kb.nextInt();
//		Stack stack = new Stack();
//		Queue queue = new LinkedList();
        int[] arr = new int[stackSize];
        for (int i = 0; i < stackSize; i++) {
//			queue.add(kb.nextInt());
//			stack.push(kb.nextInt());
            arr[i] = kb.nextInt();
        }

        T.solution(n, board, stackSize, arr);
    }

}