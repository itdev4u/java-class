package ch06;

public class BlockTest {
    //클래스 초기화 블럭
    static {
        System.out.println("static { }");
    }
    //인스턴스 초기화 블럭
    {
        System.out.println("{ }");
    }
    //default 생성자
    public BlockTest()
    {

        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest()");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlcokTest()");
        BlockTest bt2 = new BlockTest();
    }
}
