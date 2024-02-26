package chapter.fastcampus.part1.string.m03;

import java.util.*;

/*

Mississipi

?



zZa

Z

 */
public class Main2 {


    public static void solve(String param) {

        int[] count = new int[26];

//        System.out.println(Arrays.toString(count));

        for (int i = 0; i < param.length(); i++) {
            count[param.charAt(i) - 'A']++;
        }

//        System.out.println(Arrays.toString(count));

//        System.out.println( (char)('A' + 25));

        // 등장 횟수의 최대값
        int maxCount = -1;

        // 결론으로 출력할 알파벳
        char maxAlphabet = '?';

        for (int i = 0; i < 26; i++) {

            if(count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char) ('A' + i); // 'A' 로부터 떨어진 거리만큼 더해주면 해당 알파벳 !
//                System.out.print((char) ('A' + count[i]) + " ");
//                System.out.print(maxAlphabet + " ");
            } else if (maxCount == count[i]) {
                maxAlphabet = '?';
            }
        }

        System.out.println(maxAlphabet);



    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String param1 = scanner.next().toUpperCase();
//        String param1 = scanner.next();
        solve(param1);

    }

}
