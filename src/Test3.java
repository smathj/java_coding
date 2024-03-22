import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,};

        int[] arr2 = arr.clone();

        arr[0] = 100;

        System.out.println(Arrays.toString(arr2));

    }
}
