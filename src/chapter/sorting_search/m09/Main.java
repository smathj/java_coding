package chapter.sorting_search.m09;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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



    public void solution(int musicCount, int dvdCount, int[] arr) {

//        System.out.println("musicCount = " + musicCount);
//        System.out.println("dvdCount = " + dvdCount);
//        System.out.println(Arrays.toString(arr));


        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
//        System.out.println("전체 뮤직 시간 총합 = " + sum);
        System.out.println("전체 노래시간을 DVD 갯수로 나누었을때 한 DVD 당 최소 시간 = " + sum / dvdCount);
        int maxTime = sum / dvdCount;

        ArrayList<Integer> timeList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) timeList.add(arr[i]);

//        Collections.sort(timeList, (o1, o2) -> o2 - o1);
//        System.out.println(timeList);

        List<Integer> maxList = new ArrayList<>();
        int result = 0;




        a: for (int lt = 0; lt < timeList.size() - 1; lt++) {

            int lv = timeList.get(lt);
            System.out.println("[lv] = " + lv);
            int roopSum = lv;

            b: for (int rt = lt+1; rt < timeList.size(); rt++) {

                int rv = timeList.get(rt);
                System.out.println("rv = " + rv);
                roopSum += rv;

                if (roopSum > maxTime) {
//                    if(rt != timeList.size() -1) roopSum -= rv;
                    lt = rt -1;
//                    lt = rt;
//                    lt = rt + 1;
                    maxList.add(roopSum);
                    System.out.println("[break] roopSum = " + roopSum);
                    continue a;
                }
            }
            System.out.println();
        }

        System.out.println("maxList = " + maxList);
//        System.out.println(result);

        Integer i = maxList.stream().min((o1, o2) -> o1 - o2).get();
        System.out.println(i);




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