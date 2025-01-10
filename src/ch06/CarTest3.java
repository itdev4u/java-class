package ch06;

public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println("c1 : " + c1.toString());
        System.out.println("c2 : " + c2.toString());

        c1.door = 100;
        System.out.println("c1 변경 후");
        System.out.println("c1 : " + c1.toString());
        System.out.println("c2 : " + c2.toString());
    }
}
