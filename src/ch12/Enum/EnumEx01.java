package ch12.Enum;

public class EnumEx01 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 ? " + (d1 == d2));
        System.out.println("d1 == d3 ? " + (d1 == d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        //System.out.println("d2 > d3 ? " + (d2 > d3)); //컴파일 오류
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d2)));

        switch(d1) {
            case EAST:
                System.out.println("The Direction is EAST");
                break;
            case WEST:
                System.out.println("The Direction is WEST");
                break;
            case NORTH:
                System.out.println("The Direction is NORTH");
                break;
            default:
                System.out.println("Invalid direction");
        }

        Direction[] dArr = Direction.values();
        for(Direction d: dArr)
            System.out.printf("%s = %d%n", d.name(), d.ordinal());
    }
}
