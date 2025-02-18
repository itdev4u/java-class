package ch08;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println("Program START");
        try {
            System.out.println("try START");
            Exception e = new Exception("고의로 발생시킨 오류");
            throw e;
            // throw new Exception("고의로 발생시킨 오류");
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program Normal END");
    }
}
