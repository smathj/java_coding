package chapter.lecture.패스트캠퍼스.part1.ch5_sort.m04;

import java.util.Arrays;
import java.util.Scanner;

public class Main_T1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] titles = new String[N];

        for (int i = 0; i < N; i++) {
            titles[i] = sc.next();
        }


        Arrays.sort(titles);

        String maxTitle = titles[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < N; i++) {
            if(!titles[i].equals(titles[i-1]))
                currentCount = 0;
            currentCount++;

            // currentCount가 maxCount 보다 클때
            if (maxCount < currentCount ||
                    // currentCount가 maxCount 보다 같을때 는
                    (maxCount == currentCount &&
                            // titles[i]와 maxTitle 는 사전순(오름차순)일때
                            // titles[i] 이 a라면
                            // maxTitle 이 b 라는 것
                            titles[i].compareTo(maxTitle) < 0)) {
                maxCount = currentCount;
                maxTitle = titles[i];
            }

        }

        System.out.println(maxTitle);



    }
}
