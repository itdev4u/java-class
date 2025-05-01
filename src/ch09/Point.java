package ch09;

public class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    /*
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    */
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch(CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return obj;
    }
}
