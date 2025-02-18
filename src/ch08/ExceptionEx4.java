package ch08;

public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch(ArithmeticException e) {
            System.out.println(5);
        }
        System.out.println(6);
        System.out.println("+++++++++++++++++++");
        try {
            System.out.println("A");
            System.out.println("B");
            System.out.println(0/0);
            System.out.println("C");
        } catch(ArithmeticException e) {
            System.out.println("D");
        }
        System.out.println("E");
    }
}
