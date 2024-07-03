package chapter.lecture.패스트캠퍼스.part1.ch1_2_3_string_array.m08;

import java.util.Scanner;


/*
----------------------------------------------------------------
4
1 900 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919
2 919 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900
3 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919 900
4 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900 919

1 0
2 190
3 19
4 171


----------------------------------------------------------------

 */
public class Main_T {


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while (P-- > 0) {
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++)
                h[i] = sc.nextInt();

            int cnt = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (h[j] > h[i]) {
                        int myH = h[i];
                        for (int k = i; k > j; k--) {
                            h[k] = h[k - 1];
                            cnt++;
                        }
                        h[j] = myH;
                        break;
                    }
                }
            }
            System.out.println(T + " " + cnt);
        }
    }

}
