package ch08;

public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("에러메시지 : " + e.getMessage());
        }
        System.out.println(6);
    }
}
