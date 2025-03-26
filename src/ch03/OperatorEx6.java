package ch03;

public class OperatorEx6 {
    public static void main(String[] args) {
        int a = 1000000;

        int result = a * a / a;
        int result2 = a / a * a;

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}
