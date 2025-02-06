package ch07.polymopism;

import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이병헌");
        Customer customerChoi = new Customer(10011, "최민식");
        Customer customerHa = new GoldCustomer(10012, "하정우");
        Customer customerJo = new GoldCustomer(10013, "조진웅");
        Customer customerKim = new VIPCustomer(10014, "김성균", 10);

        customerList.add(customerLee);
        customerList.add(customerChoi);
        customerList.add(customerHa);
        customerList.add(customerJo);
        customerList.add(customerKim);

        System.out.println("===== 고객정보 출력 =====");
        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("===== 할인율과 보너스 포인트 결과 출력 =====");

        int price = 10000;
        for(Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하였습니다.");
            System.out.println(customer.showCustomerInfo());
        }
    }


}
