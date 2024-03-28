package chapter.datastructure.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class Partition {

    public static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void partition(int[] a, int n) {
        int pl = 0;             // 왼쪽 커서
        int pr = n - 1;         // 오른쪽 커서
        int x = a[n / 2];       // 피벗 (가운데 요소)

        // 1. pl이 pr 이하일때만 동작한다
        // 2. pl이 피벗 x 보다 작으면 pl을 한칸씩 전진 시킨다 ++
        // 3. pr이 피벗 x 보다 크면 pr을 한칸씩 후진 시킨다 --
        // 4. pl <= pr 인 경우 pl,pr 포인터가 가르키는 값을 교환한다
        do {
            while(a[pl] < x) pl++;  // pl은 피벗보다 커야하는걸 찾아야하니까 피벗보다 값이 작을때마다 전진 시켜주자 -> 거짓일때가, [최초]로 피벗보다 큰 값이고 여기서 while 문이 종료된다(이때 ++ 연산은 안이루어짐 조심!)
            while(a[pr] > x) pr--;  // pr은 피벗보다 작야아하니까 피벗보다 값이 클때마다 후퇴 시켜주자 -> 거짓일때가, [최초]로 피벗보다 작은 값이고 여기서 while 문이 종료된다(이때 -- 연산은 안이루어짐 조심!)
            if(pl <= pr) {          // 조건을 만족하면 서로 값을 교환한다
                swap(a, pl++, pr--);    // 왜 ++,-- 연산자를 쓴거지 ?
            }

        // pl <= pr 이 거짓이 되면 pl이 pr을 넘어선거고 교환이 끝났다는 뜻이다
        } while (pl <= pr);



        System.out.println("피벗값은 " + x + " 입니다");
        System.out.println();


        // ------------------------------------------------------------------
        // 이상적으로 완료될때가
        // [pr]     [pl] 로 위치해있을꺼다 (pr + 1 = pl)
        // 작은범위   큰범위
        // ------------------------------------------------------------------


        //? 1.
        System.out.println("피벗 이하의 그룹");
        for (int i = 0; i <= pl-1; i++) {               //! a[0] ~ a[pl - 1]
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();




        //? 2.
        // 간격의 차이가 났을때 (바로옆이 아니라 그보다 더 떨어졋을때 겹치는 부분이 생긴다)
        if (pl > pr + 1) {
            System.out.println("피벗과 같은 그룹");
            for (int i = pr + 1; i <= pl - 1; i++) {    //! a[pr + 1] ~ a[pl - 1]
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println();
        }




        //? 3.
        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < n; i++) {              //! a[pr + 1] ~ a[n - 1]
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();


    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("배열을 나눕니다");
//        System.out.print("요소의 수 : ");
//        int nx = sc.nextInt();
//        int[] x = new int[nx];
//        for (int i = 0; i < nx; i++) {
//            System.out.print("x[" + i + "]: ");
//            x[i] = sc.nextInt();
//        }

        int nx = 9;
        int[] x = {1, 8, 7, 4, 5, 2, 6, 3, 9};
        System.out.println(Arrays.toString(x));
        System.out.println();

        partition(x, nx);   // 배열 x를 나눔

    }

}
