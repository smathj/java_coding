package chapter.array.m04;

import java.util.Scanner;

public class Main {

    // 1 0
    // 1 0 `1 1 2 3 5

    /**
     * 총 항의 수
     */
    public void solution(int param){

        int[] arr = new int[param];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < param; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int param = scanner.nextInt();
        main.solution(param);

    }

}
