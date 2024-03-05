package chapter.fastcampus.part1.string.m10;

import java.util.Scanner;


/*

9
5 12 7 10 9 1 2 3 11
13

3
 */
public class MainT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int X = sc.nextInt();


        // N+1 = 100001
        // 값을 인덱스로 사용할거라서 + 1을 더했다
        boolean[] exist = new boolean[100001];

        for (int i = 0; i < N; i++) {
            // 값을 인덱스로 사용할거임
            exist[a[i]] = true;
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            // 현재 반복문의 주체는 a[i]
            // 찾는값 pairValue = a[j]
            int pairValue = X - a[i];

            // 범위 체크
            if(0 <= pairValue && pairValue <= 100000)
                // 값을 인덱스로하는 배열에 존재하면 된다
                ans += exist[pairValue] ? 1 : 0;
        }

//        문제에서 서로 다른 자연수라했으니
//        i,j 가 뒤집힌 j,i 순서쌍을 제외하기 위해서 2로 나누기만 하면된다
        System.out.println(ans / 2);




    }
}
