package chapter.book.datastructure.ch2;

/**
 * 1,000 이하의 소수를 나열 (버전1)
 */
public class PrimeNumber3 {

    public static void main(String[] args) {

        int counter = 0;                // 나눗셈 횟수
        int ptr = 0;                    // 찾은 소수의 개수
        int[] prime = new int[500];     // 소수를 저장하는 배열

        prime[ptr++] = 2;               // 2는 소수이니까 저장, 하고 갯수 1개 증가
        prime[ptr++] = 3;               // 3는 소수이니까 저장, 하고 갯수 1개 증가


        /**
         * 소수라고 말하려면
         * 어떤 정수 n이 제곱근 이하의 어떤 소수로도 나누어 져서는 안된다
         *
         * 예를들어 100 이면
         * 100의 제곱근은 10이다
         * 10 이하의 소수는
         * 2,3,5 이다
         * 2,3,5 어떤 수로도 나누어 지지 않으면 그 정수(여기서 100)은 소수인거다
         *
         * 정수가 9이면
         * 제곱근은 3
         *
         * 3이하의 소수는 2,3
         *
         * 정수 9는 3으로 나누어 지기때문에 소수가 아니다
         */

        // 주체가 되는 수
        for (int n = 5; n <= 1000; n+=2) {  // 조사 대상을 홀수로만 홀수 + 2 = 홀수

            boolean flag = false;

            // 소수
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {    // 나누어 떨어지면 소수가 아님
                    flag = true;
                    break;                  // 더이상 반복이 불필요
                }
            }

            if (!flag) {
                prime[ptr++] = n;   // 소수 배열에 저장
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("소수 갯수 = " + ptr);
        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);

    }
}
