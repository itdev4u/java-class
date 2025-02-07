package ch07.exception;

public class RuntimeErrorsExample {
    public static void main(String[] args) {
        int array[] = {4, 6, 2};
        /* STEP01 : ArrayIndexOutOfBoundsException */
        //System.out.println("Result : " + array[3]);
        /* STEP02 : ArithmeticException */
        //System.out.println(12/0);
        /* STEP03 : NullPointException */
        String s = null;
        System.out.println(s.length());
    }
}
