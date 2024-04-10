public class Test5 {


    public static void main(String[] args) {
        boolean bool = false;


        int i = 4;

        if (i > 0) {

            System.out.println(true ^ bool);
        } else {
            System.out.println(false ^ bool);
        }

        int i2 = 0;

        if (i2 > 0) {
            System.out.println(true ^ bool);
        } else {
            System.out.println(false ^ bool);
        }

    }


}
