package chapter.hashmap_treeset.m04;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
bacaAacba
abc

3

AbcDecbDc
bcD

3

AGSDEGEWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyz
WetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabt

180
 */
public class Main {



    public void solution(String s, String t) {

        // 윈도우용 Map, key: 알파벳, value: 나타난횟수
        // 따라서 map의 size는 t의 길이여야한다 (t.length())
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        char[] charArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        int count = 0;

        for (int p1 = 0; p1 < s.length(); p1++) {

            map.put(String.valueOf(charArray[p1]), map.getOrDefault(charArray[p1], 0) + 1);


            int p2 = p1+1;

            while (p2 < s.length() && p2 - p1 < t.length()) {

                map.put(String.valueOf(charArray[p2]), map.getOrDefault(charArray[p2], 0) + 1);
                p2++;
            }
//            System.out.println("map = " + map);

            String collect = map.keySet().stream().collect(Collectors.joining(""));


//            if(!collect.equals(t) && collect.length() == t.length()) {
            if(collect.length() == t.length()) {
                String[] split = collect.split("");
//                System.out.println("collect = " + collect);

                boolean flag = true;
                for (String w : split) {
                    if (!t.contains(w)) flag = false;
                }

                if (flag) {
                    count++;
                }

            }

            map.clear();
        }


        System.out.println(count);


    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();

        T.solution(s, t);
    }


}