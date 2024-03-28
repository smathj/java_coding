package chapter.fastcampus.part1.sort.m02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_T3 {

    public static class Member {
        int age;
        String name;
        int idx;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            members[i] = new Member();
            members[i].age = sc.nextInt();
            members[i].name = sc.next();
            members[i].idx = i;
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age != o2.age)
                    return o1.age - o2.age;
                return o1.idx - o2.idx;
            }
        });

        for (Member member : members)
            System.out.println(member.age + " " + member.name);
    }
}
