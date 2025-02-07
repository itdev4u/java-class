package ch07.exception;

public class ThrowsTest {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        try {
            throw new ClassNotFoundException("method1 에러발생");
        } catch(ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void method2() {
        try {
            throw new ArithmeticException("method2 에러발생");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void method3() {
        try {
            throw new NullPointerException("method3 에러발생");
        } catch(NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}