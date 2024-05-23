package chapter.doit.슬라이딩윈도우.m11003_최솟값찾기;

import java.io.*;
import java.util.*;

/**
 * 틀렷음 ㅠㅠ 그래도 많이 따라갓다
 */
public class Main {

    public static class Node {
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
        int[] arr = new int[N];

        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        LinkedList<Node> list = new LinkedList<>();

//        System.out.println("(L-1) = " + (L-1));

        // 기본 L-1 개 셋팅
        for (int j = 0; j <L-1 ; j++) {
            list.add(new Node(j+1, arr[j]));
        }

        // 누락된거
        for (int j = 0; j <L-1 ; j++) {
            bw.write(list.getFirst().value + " ");
        }


        // 이미 L-1 개 까진 셋팅되어있다
        for (int j = L-1; j < N ; j++) {
            Node currentNode = new Node(j+1, arr[j]);
            Node lastNode = list.getLast();




            // 1. 마지막 요소랑 현재 후보 비교
            // 1-1 현재 후보가 더 크면 추가 (오름차순 됨)
            if (currentNode.value > lastNode.value) {
                list.addLast(currentNode);
            // 1-2 현재 후보가 더 작으면 , 마지막 요소 삭제 후 현재 후보 추가
            } else {
                list.removeLast();
                list.addLast(currentNode);
            }

            // 2. 마지막 요소 인덱스 - 처음 요소 인덱스 + 1 = L 여야 연속된 거고
            //                                         >    이면 맨앞 요소 제거해야함
            int lastIndex = list.getLast().index;
            int firstIndex = list.getFirst().index;
            if ((lastIndex - firstIndex) + 1 > L) {
                list.removeFirst();
            }



            // 덱의 처음 값을 Di로 지정
            bw.write(list.getFirst().value + " ");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
