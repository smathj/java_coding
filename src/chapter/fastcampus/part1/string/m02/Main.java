package chapter.fastcampus.part1.string.m02;

import java.util.*;

/*

aabbcc
xxyybb

8

 */
public class Main {


    public static void solve(String param1, String param2) {


        int result = 0;


//        System.out.println("param1 = " + param1);
//        System.out.println("param2 = " + param2);

        String[] param1Arr = param1.split("");
        String[] param2Arr = param2.split("");

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String param : param1Arr) {
            map1.put(param, map1.getOrDefault(param, 0) + 1);
            set.add(param);
        }
        for (String param : param2Arr) {
            map2.put(param, map2.getOrDefault(param, 0) + 1);
            set.add(param);
        }

//        System.out.println("map1 = " + map1);
//        System.out.println("map2 = " + map2);
//        System.out.println("set = " + set);

        for (String word : set) {

            Integer v1 = map1.getOrDefault(word, 0);
            Integer v2 = map2.getOrDefault(word, 0);
            int count = Integer.max(v1, v2) - Integer.min(v1, v2);
            result += count;

        }


        System.out.println(result);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String param1 = scanner.nextLine();
        String param2 = scanner.nextLine();
        solve(param1, param2);

    }

}
