package ch06;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1 : " + p1.toString());
        System.out.println("p2 : " + p2.toString());
        System.out.println("p3 : " + p3.toString());
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}
