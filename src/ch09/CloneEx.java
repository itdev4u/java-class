package ch09;

public class CloneEx {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();
        System.out.println("original : " + original);
        System.out.println("copy : " + copy);
        original.x = 4;
        copy.x = 5;
        System.out.println("original : " + original);
        System.out.println("copy : " + copy);
    }
}
