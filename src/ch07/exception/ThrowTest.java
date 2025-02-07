package ch07.exception;

public class ThrowTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        divide(a, b);
    }

    private static void divide(int a, int b) throws ArithmeticException {
        if(b == 0) throw new ArithmeticException("0으로 나눌 수는 없다.");
        int c = a / b;
        System.out.println(c);
    }
}
