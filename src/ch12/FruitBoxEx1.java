package ch12;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
        //Box<Grape> grapeBox = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        //fruitBox.add(new Toy());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Toy());

        toyBox.add(new Toy());
        //toyBox.add(new Apple());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}
