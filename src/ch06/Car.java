package ch06;

public class Car {
    String color;
    String gearType;
    int door;
    /* STEP CarTest
    Car() { }
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
    */

    /* STEP CarTest2 */
    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    /* STEP CarTest3 */
    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}