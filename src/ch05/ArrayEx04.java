package ch05;

public class ArrayEx04 {
    public static void main(String[] args) {
        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        result[0] = 'T';
        System.out.println("result : " + result);
        System.out.println("abc : " + abc);
        System.out.println("nun : " + num);
    }
}
