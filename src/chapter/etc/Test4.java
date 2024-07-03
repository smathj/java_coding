package chapter.etc;

public class Test4 {

    public static MyClass myClass;

    @FunctionalInterface
    public static interface TestInterface<T> {
        T customize(T t);
    }

    public static class MyClass<T> {
        public String name;
        public TestInterface<T> myInterface;

        public MyClass() {
        }

        public MyClass(String name) {
            this.name = name;
        }

        public <T> void method(TestInterface testInterface) {
            myInterface = testInterface;
        }
    }

    public static void main(String[] args) {

        MyClass myObj = new MyClass();

        TestInterface<String> testInterface = s -> {
            String s1 = s + 100;
            System.out.println("s1 = " + s1);
            return s1;
        };
        testInterface.customize("100");

        myObj.method(testInterface);
        TestInterface myInterface = myObj.myInterface;
        System.out.println("myInterface = " + myInterface);

        myObj.method(o -> {
            int i = Integer.parseInt(String.valueOf(o)) + 100;
            System.out.println("i = " + i);
            return i;
        });

        TestInterface myInterface1 = myObj.myInterface;
        System.out.println("myInterface1 = " + myInterface1);


    }


}
