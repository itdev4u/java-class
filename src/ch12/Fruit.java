package ch12;

public class Fruit implements Eatable {
    public String toString() { return "Fruit"; }
}

/*
class Fruit {
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "(" + weight + ")";
    }
}
*/
