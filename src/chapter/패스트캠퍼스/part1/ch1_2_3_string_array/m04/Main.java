package chapter.패스트캠퍼스.part1.ch1_2_3_string_array.m04;

import java.util.*;


/*
! 틀림 메모리
-----------------------------------------------
ababababa
aba

2
-----------------------------------------------
a a a a a
a a

2
-----------------------------------------------
ababababa
ababa

1
-----------------------------------------------
aaaaaaa
aa

3
-----------------------------------------------

 */
public class Main {


    public static void solve(String param, String search) {

//        System.out.println("param = " + param);
//        System.out.println("search = " + search);

        int count = 0;
        for (int lt = 0; lt < param.length()-1; lt++) {
            for (int rt = lt + 1; rt < param.length(); rt++) {
                String substring = param.substring(lt, rt);
                if (search.equals(substring)) {
//                    System.out.println("substring = " + substring);
                    lt = rt;
                    count++;
                }

            }

        }

        System.out.println(count);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String param1 = scanner.nextLine();
        String search = scanner.nextLine();
        solve(param1, search);

    }

}
