package ch07;

public class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        /*
        this.x = x;
        this.y = y;
        */
        super(x, y);
        this.z = z;
    }

    @Override
    String getLocation() {
        return "( x : " + x + ", y : " + y + ", z : " + z + ")";
    }
}
