package ch11.vector;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);
        //빈공간을 없앤다. (용량과 크기가 같아진다)
        v.trimToSize();
        System.out.println("+++++ After trimToSize +++++");
        print(v);

        v.ensureCapacity(6);
        System.out.println("+++++ After ensureCapacity(6) +++++");
        print(v);

        v.setSize(7);
        System.out.println("+++++ After setSize(7) +++++");
        print(v);

        v.clear();
        System.out.println("+++++ After clear() +++++");
        print(v);
    }

    private static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}