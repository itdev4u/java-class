package ch04;

public class FlowEx01 {
    public static void main(String[] args) {
        int x = 0;
        if(x == 0) System.out.println("x == 0");
        if(x != 0) System.out.println("x != 0");
        if(!(x == 0)) System.out.println("!(x == 0)");
        if(!(x != 0)) System.out.println("!(x != 0)");

        System.out.println("=========================");
        x = 1;
        if(x == 0) System.out.println("x == 0");
        if(x != 0) System.out.println("x != 0");
        if(!(x == 0)) System.out.println("!(x == 0)");
        if(!(x != 0)) System.out.println("!(x != 0)");
    }
}
