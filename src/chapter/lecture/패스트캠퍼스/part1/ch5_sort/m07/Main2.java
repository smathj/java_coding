package chapter.lecture.패스트캠퍼스.part1.ch5_sort.m07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//! 시간초과
public class Main2 {

    public static void main(String[] args) throws Exception {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        List<Pointer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(v -> Integer.parseInt(v)).toArray();
            int distence = arr[1] - arr[0];
            list.add(new Pointer(arr[0], arr[1], i, distence));

        }



//        List<Pointer> newList = list.get(0).findNexIndex(list);
        System.out.println(list.get(0).findNexIndex(list));

//        for (Pointer pointer : newList) {
//            System.out.println(pointer);
//        }
/*

        int max = 0;
        int cnt = 1;



        for (int i = 0; i < N; i++) {

            Pointer currentPointer = newList.get(i);
            Integer nextIndex = currentPointer.nextIndex;
            int distence = currentPointer.distence;
            cnt = 1;

            // 다음이 없으면 브레이크
            while (nextIndex != null) {
                Pointer nextPointer = newList.get(nextIndex);
                distence += nextPointer.distence;
                nextIndex = nextPointer.nextIndex;
                cnt++;

                // 시간을 다 썻을때는 자동 브레이크
//                if (distence >= N && i < N) {
                if (distence >= N && nextPointer.index+1 < N) {
                    distence -= nextPointer.distence;   // 롤백
                    nextPointer = newList.get(nextPointer.index + 1); // 다음 이어갈수있는거
                    distence += nextPointer.distence;
                    nextIndex = nextPointer.nextIndex;
                }
                // 시간을 다 썻을때는 자동 브레이크
                if (distence >= N) {
                    break;
                }
            }

            max = Integer.max(max, cnt);
        }

        System.out.println(max);
        */

    }

    public static class Pointer {

        public int left;
        public int right;
        public int index;
        public Integer nextIndex;
        public int distence;

        public int cnt;


        public Pointer(int left, int right, int index, int distence) {
            this.left = left;
            this.right = right;
            this.index = index;
            this.distence = distence;
        }

        @Override
        public String toString() {
            return "Pointer{" +
                    "left=" + left +
                    ", right=" + right +
                    ", index=" + index +
                    ", nextIndex=" + nextIndex +
                    ", distence=" + distence +
                    ", cnt=" + cnt +
                    '}';
        }

        public int findNexIndex(List<Pointer> list) {
            for (int i = 0; i < list.size(); i++) {
                final int index =i;
                Pointer nextPointer = list.stream()
                        .filter(pointer -> pointer.index != index)
                        //3,4,5
                        .filter((pointer -> pointer.left >= list.get(index).right))
                        .sorted((o1, o2) -> {
                            return o1.distence - o2.distence;
                        })
                        .sorted((o1, o2) -> {
                            return o1.right - o2.right;
                        })
                        .sorted((o1, o2) -> {
                            return o1.left - o2.left;
                        })
                        .findFirst().orElse(null);
                if (nextPointer != null) {
                    list.get(index).nextIndex = nextPointer.index;
                }
            }

            int max = 0;

            a: for (int i = 0; i < list.size(); i++) {
                Pointer currentPoint = list.get(i);
                Pointer temp = list.get(i);
                int distence = list.get(i).distence;
                int cnt = 1;

                b: while(temp.nextIndex != null) {
                    temp = list.get(temp.nextIndex);
                    distence += temp.distence;
                    cnt++;

                    // 미리 조건을 조회 후 기회 더주기
                    if (temp.nextIndex == null && temp.index != list.size() - 1) {
                        distence -= temp.distence;
                        cnt--;

                        //! 기존 temp의 인덱스에 + 1을 해준다
                        temp = list.get(temp.index + 1);
                        distence += temp.distence;
                        cnt++;

                    }

                }

                currentPoint.cnt = cnt;
                if(cnt >= max) max = cnt;

                if (cnt == list.size() - 1) {
                    max = currentPoint.cnt;
                    break;
                }
            }

//            list.sort((o1, o2) -> o2.cnt - o1.cnt);
//            return list;

            return max;
        }
    }

}
