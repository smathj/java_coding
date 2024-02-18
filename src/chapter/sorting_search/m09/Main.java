package chapter.sorting_search.m09;

import java.util.*;


/*
9 3
1 2 3 4 5 6 7 8 9

17


10 3
6 5 8 5 6 8 7 6 6 7

24


100 10
8 6 7 6 8 7 8 9 5 7 5 7 5 7 7 7 8 5 7 9 7 5 9 8 6 6 8 7 5 5 5 8 7 5 9 7 8 6 6 8 5 9 7 5 7 8 9 7 5 7 5 8 9 5 8 9 6 9 7 6 7 6 9 7 6 9 7 5 7 5 6 8 5 7 9 9 6 8 9 6 5 8 6 9 6 8 8 6 9 7 8 8 7 7 6 8 6 9 5 9


73
 */


public class Main {


    /**
     * 한장당 DVD 사이즈와, 곡 정보를 받아서
     * 그 조건에 맞는 실제 필요한 DVD 갯수를 리턴한다
     */
    public static int count(int dvdSize, int[] arr) {
        int requireDvdCount = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] <= dvdSize) {
                sum += arr[i];
            } else {
                requireDvdCount++;
                sum = arr[i];
            }

        }

//        System.out.println("requireDvdCount = " + requireDvdCount);

        return requireDvdCount;

    }

    public void solution(int musicCount, int dvdCount, int[] arr) {

//        System.out.println("음악 갯수 = " + musicCount);
//        System.out.println("디비디 갯수 = " + dvdCount);
//        System.out.println(Arrays.toString(arr));

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

//        System.out.println("lt = " + lt);
//        System.out.println("rt = " + rt);


        // 9 ~ 45
        int answer = 0;

        while (lt <= rt) {
//            System.out.println("==================================");
//            System.out.println("lt = " + lt);
//            System.out.println("rt = " + rt);
            int mid =( lt + rt) / 2;  // 1개의 dvd 용량
//            System.out.println("mid = " + mid);
            // dvd 카운트 보다 작거나 같을때 -> 아~, 용량을 더 줄여도 되겠네
            if (count(mid, arr) <= dvdCount) {
                answer = mid;
                rt = mid -1;
            // dvd 갯수를 넘어 슬때 -> 아~ 용량을 더 키워야겠구나
            } else {
                lt = mid + 1;
            }
//            System.out.println("answer = " + answer);
//            System.out.println("==================================");
//            System.out.println();
//            System.out.println();
        }

//        System.out.println("answer = " + answer);



        System.out.println(answer);







    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int musicCount = kb.nextInt();
        int dvdCount = kb.nextInt();

        int[] arr = new int[musicCount];
        for (int i = 0; i < musicCount; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(musicCount, dvdCount, arr);
    }

}