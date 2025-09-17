package reminder.ch12.ex02;


import reminder.ch12.Apple;
import reminder.ch12.Fruit;
import reminder.ch12.FruitBox;
import reminder.ch12.Grape;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        //FruitBox<Grape> grapeBox2 = new FruitBox<Apple>();
        //FruitBox<Toy> toyBox = new FruitBox<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        //fruitBox.add(new Toy());
        appleBox.add(new Apple());
        //appleBox.add(new Grape());
        grapeBox.add(new Grape());

        System.out.println("fruitBox : " + fruitBox);
        System.out.println("appleBox : " + appleBox);
        System.out.println("grapeBox : " + grapeBox);
    }
}
