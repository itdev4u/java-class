package ch07.access;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        /* private 이므로 접근이 불가 */
        //t.hour = 13;
        /* setter를 통해서 접근 */
        //t.setHour(13);
        t.setHour(t.getHour() + 20);
        System.out.println(t);
    }
}
