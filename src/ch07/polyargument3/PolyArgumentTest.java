package ch07.polyargument3;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        /*
        Product tv = new Tv();
        Product com = new Computer();
        Product audio = new Audio();
         */
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
