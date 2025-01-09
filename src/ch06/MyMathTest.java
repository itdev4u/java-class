package ch06;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.add(5L, 3L);
        long result2 = mm.substract(5l, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("result : " + result);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
    }
}