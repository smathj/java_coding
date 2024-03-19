package chapter.doit.m1546;


import java.util.Scanner;

// ! 평균 구하기
/*
---------------------------------------------------
3
40 80 60

75.0
---------------------------------------------------
3
10 20 30

66.666667

---------------------------------------------------
4
1 100 100 100

75.25
---------------------------------------------------
4
10 20 0 100

32.5
---------------------------------------------------
9
10 20 30 40 50 60 70 80 90

55.55555555555556
 */
public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scoreArr = new int[n];

        for (int i = 0; i < n; i++) {
            scoreArr[i] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(scoreArr));

        int max = 0;
        int sum = 0;

        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }

//        System.out.println("max = " + max);
//        System.out.println("sum = " + sum);
        double avg = (sum * 100.0) / max / n;
//        System.out.println("avg = " + avg);

        System.out.println(avg);


    }


}
