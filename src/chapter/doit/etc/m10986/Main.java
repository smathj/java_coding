package chapter.doit.etc.m10986;


import java.util.Arrays;
import java.util.Scanner;

// !
// ? 나머지합
/*
---------------------------------------------------
5 3
1 2 3 1 2

7

 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 항의 갯수
        int N = sc.nextInt();

        // M으로 나누어 떨어져야한다
        int M = sc.nextInt();

        // 2차원 표 (행렬)
        int[] arr = new int[N + 1];
        int[] sumArr = new int[N + 1];

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            sumArr[i] = sum;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sumArr));
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i+1; j <= N; j++) {
                int value = sumArr[j] - sumArr[i];
                if (value % M == 0) {
                    System.out.println("찾았음");
                    System.out.println("sumArr["+ j + "] = " + sumArr[j]);
                    System.out.println("sumArr["+ i + "] = " + sumArr[i]);
                    cnt++;
                }
            }
            System.out.println();
        }
        System.out.println("cnt = " + cnt);



    }


}


