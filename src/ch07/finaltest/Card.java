package ch07.finaltest;

public class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 1);
    }

    @Override
    public String toString() {
        return "Card{" +
                "NUMBER=" + NUMBER +
                ", KIND='" + KIND + '\'' +
                '}';
    }
}
