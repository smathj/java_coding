package chapter.fastcampus.part1.sort.m04;

import java.util.*;

/**
 * 1302
 * 베스트셀러
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());


        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String book = sc.nextLine();
            map.put(book, map.getOrDefault(book,0) + 1);
        }


        int max = 0;
        String bookName = "";
        List<String> bookList = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value > max) {
                max = value;
                bookName = key;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value == max) {
                bookList.add(key);
            }
        }

        Collections.sort(bookList, (o1, o2) -> {
            return o1.compareTo(o2);
        });

        System.out.println(bookList.get(0));




    }
}
