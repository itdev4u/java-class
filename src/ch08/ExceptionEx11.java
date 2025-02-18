package ch08;

public class ExceptionEx11 {
    public static void main(String[] args)  {
        method1();
        System.out.println("Normal END");
    }

    private static void method1() {
        try {
            method2();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void method2() throws Exception {
        throw new Exception();
    }
}
