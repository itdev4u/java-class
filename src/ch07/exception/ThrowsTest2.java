package ch07.exception;

public class ThrowsTest2 {
    public static void main(String[] args) {
        try {
            method1();
            method2();
            method3();
        } catch (ClassNotFoundException | ArithmeticException | NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException("method1 에러발생");
    }

    private static void method2() throws ArithmeticException {
        throw new ArithmeticException("method2 에러발생");
    }

    private static void method3() throws NullPointerException {
        throw new NullPointerException("method3 에러발생");
    }
}