package chapter.book.datastructure.ch2;

/**
 * 1,000 이하의 소수를 나열 (버전1)
 */
public class PrimeNumber1 {

    public static void main(String[] args) {

        int counter = 0;    // 나눗셈 횟수

        // 주체가 되는 수
        for (int n = 2; n <= 1000; n++) {

            // 소수
            int i;
            for (i = 2; i < n; i++) {   // i가 1일때 , n일때는 제외한 루프이니, 나누어 떨어지는게 단 한번나오면 끝임
                counter++;
                if (n % i == 0) {   // 나누어 떨어지면 소수가 아니다
                    break;          // 반복은 더이상 불필요하다
                }
            }

            if (n == i) {   // 마지막까지 나누어떨어지지 않았음
                System.out.println(n);
            }
        }

        System.out.println("나눗셈을 수행한 횟수: " + counter);

    }
}
