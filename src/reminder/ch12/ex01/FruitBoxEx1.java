package reminder.ch12.ex01;

import reminder.ch12.*;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Grape> grapeBox = new Box<Grape>();
        Box<Toy> toyBox = new Box<Toy>();
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        //fruitBox.add(new Toy());
        System.out.println("fruitBox : " + fruitBox);

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println("appleBox : " + appleBox);

        grapeBox.add(new Grape());
        //grapeBox.add(new Apple());
        //grapeBox.add(new Fruit());
        System.out.println("grapeBox : " + grapeBox);

        toyBox.add(new Toy());
        System.out.println("toyBox : " + toyBox);
    }
}
