package chapter.fastcampus.part1.partialsum.m01;

public class XORExample {
    public static void main(String[] args) {

        //? 예제 1: 두 정수 간의 XOR 연산 수행
        int a = 5; // 이진수로는 0101
        int b = 3; // 이진수로는 0011

        //! 0110 -> 4 + 2 = 6
        int result = a ^ b; // XOR 연산 수행
        System.out.println(a + "와 " + b + " 사이의 XOR 연산 결과: " + result);



        //? 예제 2: 동일한 값으로 XOR 연산 수행
        int c = 7; // 이진수로는 0111

        //! 0000 -> 0
        int sameValueXOR = c ^ c; // 동일한 값으로 XOR 연산 수행
        System.out.println(c + "와 " + c + " 사이의 XOR 연산 결과: " + sameValueXOR);


        //? 예제 3: 두 번 XOR 연산 수행 후 원래 값으로 복원
        //! 1010
        int originalValue = 10; // 이진수로는 1010

        //! 1111 -> 15
        int firstXOR = originalValue ^ 5; // 첫 번째 XOR 연산 수행
        // ! 1010 -> 10
        int secondXOR = firstXOR ^ 5; // 두 번째 XOR 연산 수행
        System.out.println("두 번의 XOR 연산 후 원래 값으로 복원됨: " + secondXOR);



    }
}
