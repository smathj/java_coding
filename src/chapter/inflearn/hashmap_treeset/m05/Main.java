package chapter.inflearn.hashmap_treeset.m05;

import java.util.*;
import java.util.stream.Collectors;

/*
10 3
13 15 34 23 45 65 33 11 26 42

143


60 20
38 46 54 33 34 23 48 50 23 26 46 47 25 48 35 48 32 30 50 28 39 34 24 28 26 53 18 24 52 41 41 33 23 52 27 22 45 30 52 19 40 48 45 23 21 45 19 20 38 21 19 21 31 40 53 27 49 48 30 32

141
 */
public class Main {
    public void solution(int n, int k, int[] arr) {

        int kMax = -1;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int l = 0; l < arr.length; l++) {
                int b = arr[l];
                if (l == i) {
                    continue;
                }

                for (int q = 0; q < arr.length; q++) {
                    int c = arr[q];
                    if (q == l || q == i) {
                        continue;
                    }

                    set.add(a + b + c);
                }
            }
        }

        List<Integer> collect = set.stream().sorted(((o1, o2) -> o2.compareTo(o1)))
                .collect(Collectors.toList());

//        System.out.println("set = " + set);
//        System.out.println("collect = " + collect);

        if (collect.size() >= k) {
            kMax = collect.get(k - 1);
        }
        System.out.println(kMax);


    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        T.solution(n, k, arr);
    }


}










