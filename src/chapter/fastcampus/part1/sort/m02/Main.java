package chapter.fastcampus.part1.sort.m02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static class Man {

        public int joinNum;
        public int age;
        public String name;

        public Man(int joinNum, int age, String name) {
            this.joinNum = joinNum;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "joinNum=" + joinNum +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        /*
        온라인 저지에 가입한 사람들의 [나이]와 [이름]이 가입한 순서대로 주어진다.
        이때,
        1. 회원들을 나이가 증가하는 순으로,
        2. 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로
        정렬하는 프로그램을 작성하시오.

        [입력]은 가입순

        [출력]은 나이순,
        나이가 같으면 가입순
         */

        List<Man> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            Man man = new Man(i + 1, Integer.parseInt(split[0]), split[1]);
            list.add(man);
        }


//        for (Man man : list) {
//            System.out.println(man);
//        }

        List<Man> sortList = list.stream().sorted((o1, o2) -> {
            if (o1.age == o2.age) {
                return o1.joinNum - o2.joinNum;
            }
            return o1.age - o2.age;
        }).collect(Collectors.toList());

        for (Man man : sortList) {
            System.out.println(man.age + " " + man.name);
        }

    }
}

