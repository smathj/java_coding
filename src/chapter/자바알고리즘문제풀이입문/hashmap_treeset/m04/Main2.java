package chapter.자바알고리즘문제풀이입문.hashmap_treeset.m04;


import java.util.*;


public class Main2 {



    public void solution(String s, String t) {

        // 윈도우용 Map, key: 알파벳, value: 나타난횟수
        // 따라서 map의 size는 t의 길이여야한다 (t.length())
        List<String> list = new ArrayList<>();
        char[] charArray = s.toCharArray();
        int count = 0;

        for (int p1 = 0; p1 < s.length(); p1++) {

            String w1 = String.valueOf(charArray[p1]);
            list.add(w1);
            int p2 = p1+1;

            while (p2 < s.length() &&
                    p2 - p1 < t.length()) {
                String w2 = String.valueOf(charArray[p2]);
                list.add(w2);
                p2++;
            }


            if(list.size() == t.length()) {

//                System.out.println("list = " + list);
                boolean flag = true;



                List<String> tList = Arrays.asList(t.split(""));
//                System.out.println("tList = " + tList);

                Map<String, Integer> m1 = new HashMap();
                Map<String, Integer> m2 = new HashMap();

                for (String s1 : list) {
                    m1.put(s1, m1.getOrDefault(s1, 0) + 1);
                }
                for (String s2 : tList) {
                    m2.put(s2, m2.getOrDefault(s2, 0) + 1);
                }

//                System.out.println("m1 = " + m1);
//                System.out.println("m2 = " + m2);

                for (String k1 : m1.keySet()) {
                    Integer v1 = m1.get(k1);
                    Integer v2 = m2.get(k1);
                    if (v1 != v2) {
                        flag = false;
                        break;
                    }
                }



                if (flag) {
                    count++;
                }

            }

            list.clear();

        }


        System.out.println(count);


    }


    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();

        T.solution(s, t);
    }


}