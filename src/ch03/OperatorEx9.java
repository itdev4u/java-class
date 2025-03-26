package ch03;

public class OperatorEx9 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println("shortPi = " + shortPi);

        /* 소수점 넷째 자리에서 반올림 하는 방법 */
        shortPi = (int)(pi * 1000 + 0.5) / 1000f;
        System.out.println("shortPi = " + shortPi);

        /* Math.round() 메소드의 사용으로 반올림 */
        shortPi = Math.round(pi * 1000) / 1000f;
        System.out.println("shortPi = " + shortPi);
    }
}
