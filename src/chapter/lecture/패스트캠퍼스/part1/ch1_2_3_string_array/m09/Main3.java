package chapter.lecture.패스트캠퍼스.part1.ch1_2_3_string_array.m09;

import java.io.*;


/*
----------------------------------------------------------------
10
5
2
3
1
4
2
3
5
1
7


1
1
2
2
3
3
4
5
5
7
----------------------------------------------------------------

 */
public class Main3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int size = Integer.parseInt(br.readLine());
        // 인덱스가 숫자이고
        // 그떄의 값이 갯수이다
        int[] arr = new int[10001];


        // 입력
        for (int i = 0; i < size; i++) {
            int valueAndIndex = Integer.parseInt(br.readLine());
//            System.out.println("valueAndIndex = " + valueAndIndex);
            arr[valueAndIndex]++;
        }

        // 정렬
//        System.out.println(Arrays.toString(arr));


        // 출력
        for (int i = 1; i <= 10000; i++) {
            while (arr[i]-- > 0) {
                bw.write(i + "\n");
            }
        }
        bw.flush();




    }

}
