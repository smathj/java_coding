package chapter.fastcampus.part1.sort.m03;

import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());


        Set<String> set = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            String[] text = br.readLine().split(" ");
            String name = text[0];
            String status = text[1];
            if (status.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }


        String[] array = set.toArray(new String[set.size()]);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }


    }

}
