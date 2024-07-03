package chapter.etc;

public class Test3 {

    public static MyClass myClass;

    @FunctionalInterface
    public static interface MyInterface<T> {

        void customize(T t);

        static <T> MyInterface<T> withDefaults() {
            return (t) -> {};
        }

    }

    public static class MyClass {
        public String name;

        public MyClass() {
        }

        public MyClass(String name) {
            this.name = name;
        }
    }


    public static<T> T getOrApply(T t) {
        System.out.println("t = " + t);
        return t;
    }


    // myInterface: MyInterface<Object>
    // T: Object
    public <T> void formLogin(MyInterface<T> myInterface) {

        // myInterface.customize 리턴 void 이다
        myInterface.customize((T) getOrApply(new MyClass()));

    }

    public static void main(String[] args) {
/*
        String a = "a";
        String b = "b";
        String a2 = "a";
        System.out.println(a.compareTo(b)); // 사전순 (리턴값은 음수)
        System.out.println(b.compareTo(a)); // 역순 (리턴값은 양수)
        System.out.println(a.compareTo(a2));    // 동일
        */
        Test3 obj = new Test3();

        // MyInterface.withDefaults() 은 람다식 인데 리턴 타입이 MyInterface<T>
//        MyInterface<Object> objectMyInterface = MyInterface.withDefaults();

        obj.formLogin(MyInterface.withDefaults());


    }


}
