package chapter.패스트캠퍼스.part1.ch1_2_3_string_array.m08;

import java.util.*;


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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int banCount = scanner.nextInt();

        Map<Integer, Integer[]> map = new HashMap<>();

        // v1
/*
        a:
        for (int i = 1; i <= banCount; i++) {
            Integer[] temp = new Integer[20];
            b:
            for (int j = 0; j < 21; j++) {
                int val = scanner.nextInt();
                if (j != 0) temp[j - 1] = val;
            }
            map.put(i, temp);
        }
*/
        // v2
        a:
        for (int i = 0; i < banCount; i++) {
            Integer[] temp = new Integer[20];
            int ban = scanner.nextInt();
            b:
            for (int j = 0; j < 20; j++) {
//                System.out.println("(i,j) = " + "(" + i + "," + j + ")");
                int val = scanner.nextInt();
                temp[j ] = val;
            }
            map.put(ban, temp);
        }

        List<Integer> banList = new ArrayList<>(map.keySet());
        for (Integer ban : banList) {

            // 테스트용으로 1반 데이터
            Integer[] firstBanArr = map.get(ban);


            // 같은 크기의 배열
            List<Integer> dataList = new ArrayList<>();


            int count = 0;

            for (Integer score : firstBanArr) {


                // 빈배열이면 바로 둔다
                if (dataList.size() == 0) {
                    dataList.add(score);
                    continue;
                }

                Integer lastScore = dataList.get(dataList.size() - 1);


                // 자기 앞에 자기보다 키가 큰 학생이 없다면 그냥 그 자리에 서고 차례가 끝난다.
                if (score > lastScore) {
                    dataList.add(score);

                    // 자기 앞에 자기보다 키가 큰 학생이 한 명 이상 있다면 그중 가장 앞에 있는 학생(A)의 바로 앞에 선다
                } else {
                    for (int i = 0; i < dataList.size(); i++) {
                        // dataList 에 하나밖게없을때
                        if (dataList.size() == 1) {
                            dataList.add(0, score);
                            count++;
                            break;
                            // dataList 에 여러개 데이터가 있을때
                        } else {
                            // 현재 스코어보다 큰 인덱스의 -1 이 내가 들어가고자하는 인덱스이다
                            if (dataList.get(i) > score) {
                                if ((i - 1) < 0) {
                                    count += dataList.size();
                                    dataList.add(0, score);
                                } else {
                                    dataList.add(i - 1, score);
                                    count += dataList.size() - (i - 1);
                                }

                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(ban + " " + count);
        }
    }

}
