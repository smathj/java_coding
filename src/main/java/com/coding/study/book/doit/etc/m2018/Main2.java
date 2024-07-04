package chapter.book.doit.etc.m2018;


import java.util.Scanner;

// !
// ? 나머지합
/*
---------------------------------------------------
5 3
1 2 3 1 2

7

 */
public class Main2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자연수
        int N = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        int count = 0;
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;

        while (startIndex <= endIndex) {
            if (sum == N) {
                count++;
                endIndex++;
                if(endIndex > N) break;
                sum = sum + arr[endIndex];

            } else if (sum > N) {
                sum = sum - arr[startIndex];
                startIndex++;
            } else if (sum < N) {
                endIndex++;
                sum = sum + arr[endIndex];
            }
        }

        System.out.println(count);



    }


}


