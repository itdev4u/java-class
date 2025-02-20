package ch08;

public class FinallyTest {
    public static void main(String[] args) {
        FinallyTest.method1();
        System.out.println("method1()의 수행을 마치고 main메소드로 돌아왔습니다.");
    }

    private static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            return;
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally블럭이 실행되었습니다.");
        }
    }
}
