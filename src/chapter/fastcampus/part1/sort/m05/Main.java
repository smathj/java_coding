package chapter.fastcampus.part1.sort.m05;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] positionArr = br.readLine().split(" ");

        Set<Integer> set = new HashSet<>(N);


        for (String position : positionArr) {
            set.add(Integer.parseInt(position));
        }


        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        Map<String, Integer> map = new HashMap<>();
        for (int j = 0; j < list.size(); j++) {
            Integer value = list.get(j);
            map.put(String.valueOf(value), j);
        }

        for (String s : positionArr) {
            bw.write(map.get(s) + " ");
        }

        bw.flush();

        bw.close();
        br.close();



    }
}
