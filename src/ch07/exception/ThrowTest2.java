package ch07.exception;

public class ThrowTest2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a, b);
        } catch(ArithmeticException ex) {
            //ex.getMessage();
            ex.printStackTrace();
        }

    }

    private static void divide(int a, int b) throws ArithmeticException {
        if(b == 0) throw new ArithmeticException("0으로 나눌 수는 없다.");
        int c = a / b;
        System.out.println(c);
    }
}
