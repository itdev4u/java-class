package ch07.polymopism;

public class VIPCustomer extends Customer {
    private int agentID;
    private double salesRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * salesRatio);
        return price;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
    }
}
