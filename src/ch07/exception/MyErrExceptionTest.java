package ch07.exception;

public class MyErrExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyErrException("나의 커스텀 예외 클래스 메시지");
        } catch(MyErrException ex) {
            ex.printMyMessage();
            ex.printStackTrace();
        }
    }
}
