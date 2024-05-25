package chapter.패스트캠퍼스.part1.ch5_sort.m05;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class MainT {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[][] xs = new int[N][2];
        for (int i = 0; i < N; i++) {
            xs[i][0] = Integer.parseInt(inputs[i]); // 값
            xs[i][1] = i;                           // 입력 순서
        }

        Arrays.sort(xs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] -o2[0];    // 오름 차순
            }
        });


        int[] ans = new int[N];
        int idx = 0;
        ans[xs[0][1]] = idx;    // 제일 왼쪽이니 거리가 0이다 (인덱스가 0이다)

        for (int i = 1; i < N; i++) {
            // 이전 좌표와 값이 다르면 거리를 1증가시켜준다(인덱스를 1증가시킨다)
            if (xs[i][0] != xs[i - 1][0]) {
                idx++;
            }
            // 출력 배열에
            // 기존 입력 순서에 "거리"(인덱스) 값으로 초기화 해준다
            ans[xs[i][1]] = idx;
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++)
            bw.write(ans[i] + " ");
        bw.flush();
    }

}
