package chapter.fastcampus.part1.string.m03;

import java.util.*;


// ! 실패
/*

Mississipi

?



zZa

Z

 */
public class Main {


    public static void solve(String param) {
        Map<String, Integer> map = new HashMap<>();


        for (String c : param.split("")) {
            map.put(c.toUpperCase(), map.getOrDefault(c.toUpperCase(), 0) + 1);
        }

//        System.out.println(map);

        Set<String> keySet = map.keySet();
        Collection<Integer> values = map.values();

        int max = 0;
        int duCnt = 0;
        String result = null;

        String[] keyArr = keySet.toArray(new String[keySet.size()]);
        Integer[] valueArr = values.toArray(new Integer[keySet.size()]);


        for (int i = 0; i < valueArr.length; i++) {
            Integer value = valueArr[i];
//            System.out.println("value = " + value);
            if (value >= max) {
                if (value == max) duCnt++;
                max = value;
                result = keyArr[i];
            }
        }

//        System.out.println();
//        System.out.println();
//        System.out.println("max = " + max);
//        System.out.println("duCnt = " + duCnt);
//        System.out.println();
//        System.out.println();

        if (duCnt > 0) {
            System.out.println("?");
        } else {
            System.out.println(result);
        }




    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String param1 = scanner.next();
        solve(param1);

    }

}
