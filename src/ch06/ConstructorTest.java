package ch06;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        //기본 생성자가 없어서 오류가 발생
        //Data2 d2 = new Data2();
        Data2 ds = new Data2(3);

    }
}
