package ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car)fe; 에서 형변환이 생략된 표현이다 (자손 => 조상)
        //car.water(); car 타입의 참조변수로는 water() 호출이 불가
        fe2 = (FireEngine) car; // 형변환 생략 불가(조상 => 자손)
        fe2.water();
    }
}