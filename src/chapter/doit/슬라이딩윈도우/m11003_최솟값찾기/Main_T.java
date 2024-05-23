package chapter.doit.슬라이딩윈도우.m11003_최솟값찾기;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_T {

    static class Node {
        public int index;
        public int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "index=" + index +
                    ", value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());


        Deque<Node> mydeque = new LinkedList<>();

        // 이미 L-1 개 까진 셋팅되어있다
        for (int i = 1; i <= N ; i++) {

            int now = Integer.parseInt(st.nextToken());

            // 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄인다
            // 덱이 안비어있고 마지막 값이 현재 들어올 값보다 클때  -> 마지막 값을 지워둠
            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                mydeque.removeLast();
            }

            mydeque.addLast(new Node(i, now));

            //! 범위에서 벗어난 값은 덱에서 제거
            // * 강사 표현
//            if (mydeque.getFirst().index + L <= i) {

            // * 나는 이 표현이 더 편해
            if (mydeque.getLast().index - mydeque.getFirst().index + 1 > L ) {
                mydeque.removeFirst();
            }

            // 덱의 처음 값을 Di로 지정
            bw.write(mydeque.getFirst().value + " ");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
