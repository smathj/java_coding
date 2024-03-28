import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

        int a, b;

        a = b = 10;
        print(a++, b++);
        System.out.println("[메서드 동작후]a = " + a);
        System.out.println("[메서드 동작후]b = " + b);

    }

    public static void print(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
