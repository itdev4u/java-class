package ch08;

public class ExceptionEx10 {
    public static void main(String[] args) throws Exception {
        method1();
        System.out.println("Normal END");
    }

    private static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        throw new Exception();
    }
}
