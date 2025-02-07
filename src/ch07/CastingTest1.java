package ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        //car.water(); car 타입의 참조변수로는 water() 호출이 불가
        fe2 = (FireEngine) car;
        fe2.water();
    }
}