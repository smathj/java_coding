package chapter.fastcampus.part1.bruteforce.m02;


import java.util.Scanner;

/*
3
10
20
1000

1
0
1
 */
public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[50];
        int[] testArr = new int[N];

        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            testArr[i] = k;
//            System.out.println("k = " + k);
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i * (i + 1) / 2;
        }

//        System.out.println(Arrays.toString(arr));

        for (int q = 0; q < N; q++) {
            int testValue = testArr[q];

//            System.out.println("testValue = " + testValue);
            boolean flag = false;
            a:for (int i = 1; i < arr.length; i++) {
                b:for (int j = 1; j < arr.length; j++) {
                    c:for (int k = 1; k < arr.length; k++) {

                        int sum = arr[i] + arr[j] + arr[k];

                        if (testValue == sum) {
                            flag = true;
                            break a;
                        }
                    }
                }
            }
            if(flag) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }


    }
}