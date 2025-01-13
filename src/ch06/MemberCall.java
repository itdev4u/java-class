package ch06;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //Error. 클래스변수는 인스턴스 변수를 사용할 수 없음.
    //static int cv2 = iv;
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
        //Error. 클래스메소드에서 인스턴수 변수를 사용불가
        //System.out.println(iv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        //인스턴스 메소드에서는 인스턴스 변수 바로 사용가능
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        //Error. 클래스메소드에서 인스턴스 메소드를 호출할 수 없음
        //instanceMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        //인스턴스메소드에서는 클래스메소드, 인스턴스메소드 모두 호출가능
        staticMethod1();
        instanceMethod1();
    }
}
