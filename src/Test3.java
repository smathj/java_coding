import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String a2 = "a";
        System.out.println(a.compareTo(b)); // 사전순 (리턴값은 음수)
        System.out.println(b.compareTo(a)); // 역순 (리턴값은 양수)
        System.out.println(a.compareTo(a2));    // 동일

    }

    public static void print(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
