package ch12.Generic;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        //FruitBox<Grape> grapeBox2 = new FruitBox<Apple>(); /* 오류 타입 불일치 */
        //FruitBox<Toy> toyBox = new FruitBox<Toy>();        /* 오류 */

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        //appleBox.add(new Grape()); /* 오류 : Grape는 Apple의 자손이 아님 */
        grapeBox.add(new Grape());

        System.out.println("fruitBox : " + fruitBox);
        System.out.println("appleBox : " + appleBox);
        System.out.println("grapeBox : " + grapeBox);
    }
}
