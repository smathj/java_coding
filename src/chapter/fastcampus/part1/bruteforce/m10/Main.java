package chapter.fastcampus.part1.bruteforce.m10;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 오답
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if(word.length() > 50) continue;
            set.add(word);
        }

        List<String> tmpList = set.stream().collect(Collectors.toList());

        Collections.sort(tmpList, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.charAt(0) - o2.charAt(0);
            }
            return o1.length() - o2.length();
        });


        for (String s : tmpList) {
            bw.write(s + "\n");
        }

        bw.flush();



    }
}
