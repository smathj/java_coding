package chapter.book.datastructure.ch6;

import chapter.book.datastructure.ch4.IntStack;

import java.util.Arrays;

/**
 * 퀵정렬 - 비 재귀
 */
public class QuickSort2 {

    public static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void quickSort(int[] arr, int left, int right) {

        IntStack lstack = new IntStack(right - left + 1);   // 나눌 범위의 왼쪽 끝 인덱스를 저장하는 스택
        IntStack rstack = new IntStack(right - left + 1);   // 나눌 범위의 오른쪽 끝 인덱스를 저장하는 스택

        lstack.push(left);
        rstack.push(right);

        while (!lstack.isEmpty()) {

            int pl = lstack.pop();            // 왼쪽 커서
            int pr = rstack.pop();            // 오른쪽 커서
            int x = arr[(pl + pr) / 2];       // 피벗 (가운데 요소)


            // 진행과정 출력 - 재귀로 호출될걸 생각하면 여기서 작성할 수 있다
            System.out.println("피벗 = " + x);
            System.out.printf("arr[%d]~arr[%d]: {", pl, pr);
            for (int i = left; i < pr; i++) {
                System.out.printf("%d, ", arr[i]);
            }
            System.out.printf("%d}\n", arr[pr]);
            System.out.println();

            // 진행과정 출력 끝


            // 1. pl이 pr 이하일때만 동작한다
            // 2. pl이 피벗 x 보다 작으면 pl을 한칸씩 전진 시킨다 ++
            // 3. pr이 피벗 x 보다 크면 pr을 한칸씩 후진 시킨다 --
            // 4. pl <= pr 인 경우 pl,pr 포인터가 가르키는 값을 교환한다
            do {
                while(arr[pl] < x) pl++;  // pl은 피벗보다 커야하는걸 찾아야하니까 피벗보다 값이 작을때마다 전진 시켜주자 -> 거짓일때가, [최초]로 피벗보다 큰 값이고 여기서 while 문이 종료된다(이때 ++ 연산은 안이루어짐 조심!)
                while(arr[pr] > x) pr--;  // pr은 피벗보다 작야아하니까 피벗보다 값이 클때마다 후퇴 시켜주자 -> 거짓일때가, [최초]로 피벗보다 작은 값이고 여기서 while 문이 종료된다(이때 -- 연산은 안이루어짐 조심!)
                if(pl <= pr) {          // 조건을 만족하면 서로 값을 교환한다
                    swap(arr, pl++, pr--);    // 왜 ++,-- 연산자를 쓴거지 ?
                }

            // pl <= pr 이 거짓이 되면 pl이 pr을 넘어선거고 교환이 끝났다는 뜻이다
            } while (pl <= pr);

            if(left < pr) {
                // left ~~~ pr    범위
                lstack.push(left);
                rstack.push(pr);

            }
            if(right < pl) {
                // pl   ~~~ right 범위
                lstack.push(pl);
                rstack.push(right);
            }
        }





    }

    public static void main(String[] args) {

        int n = 9;
        int[] arr = {5, 8, 4, 2, 6, 1, 3, 9, 7,};
        System.out.println(Arrays.toString(arr));
        System.out.println();

        quickSort(arr, 0, n-1);   // 배열 x를 나눔
        System.out.println("오름차순으로 정렬했습니다");

        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < n; i++) {
//            System.out.println("arr[" + i + "] = " + arr[i]);
//        }

    }

}
