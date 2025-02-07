package ch07.exception;

public class FinalTest {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException 발생");
            ex.printStackTrace();
        } finally {
            System.out.println("finally 실행");
        }
    }
}
