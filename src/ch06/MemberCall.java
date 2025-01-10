package ch06;

/**
 * 코딩 중
 */
public class MemberCall {
    static int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //static int cv2 = iv;
    //static int cv2 = new MemberCall().iv;

    static void staticMethod() {
        System.out.println(cv);
        System.out.println(iv);
    }

    void instanceMethod() {

    }

    public static void main(String[] args) {
        staticMethod();
    }
}
