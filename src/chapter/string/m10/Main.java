package chapter.string.m10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// x >= 48 && x <= 57 <- 0 ~ 9 ( char ) 아스키넘버
class Main {
    public String solution(String param){
        //int answer=0;
        String baseText = param.split(" ")[0];
        String flag = param.split(" ")[1];

        StringBuilder result = new StringBuilder();
        int index1 = 0;
        int index2 = 0;

         List<Boolean> locationIndex = new ArrayList<>();
         List<Integer> locationOutput = new ArrayList<>();
        for (int i = 0; i < baseText.length(); i++) {
            if (flag.equals(String.valueOf(baseText.charAt(i)))) {
                locationIndex.add(true);
            } else {
                locationIndex.add(false);
            }
        }
        System.out.println("locationIndex = " + locationIndex);

        for (int i = 0; i < locationIndex.size(); i++) {
            // 1. 내가 true일때
            if(locationIndex.get(i)) {
                result.append("0 ");
                continue;
            }

            // 2. 내왼쪽 또는 오른쪽이 true일때  ( 단 왼쪽은 최소 인덱스 0, 오른쪽 최대 인덱스 마지막 인덱스 )
            if((i-1 < 0 ) && locationIndex.get(i-1)) {

            }

            // 2. 내왼쪽 또는 오른쪽이 true일때  ( 단 왼쪽은 최소 인덱스 0, 오른쪽 최대 인덱스 마지막 인덱스 )
            if((i-1 < 0 ) && locationIndex.get(i-1)) {

            }


        }


        return "";
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}