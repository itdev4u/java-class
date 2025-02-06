package ch07.polymopism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("이병헌");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        Customer customerChoi = new VIPCustomer(10101, "최민식", 100);
        customerChoi.bonusPoint = 1000;
        System.out.println(customerChoi.showCustomerInfo());
        System.out.println("========== 할인율과 보너스 포인트 계산 ==========");

        int price = 10000;
        int leePrice = customerLee.calcPrice(price);
        int choiPrice = customerChoi.calcPrice(price);

        System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원 지불하셨습니다.");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerChoi.getCustomerName() + "님이 " + choiPrice + "원 지불하셨습니다.");
        System.out.println(customerChoi.showCustomerInfo());
    }
}
