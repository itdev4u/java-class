package ch07.abstractEx;

public class AbstractTest {
    public static void main(String[] args) {
        /*
        Animal animal = new Animal() {
            @Override
            void makeSound() {

            }
        };
        */
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        cat.eat();
        dog.makeSound();
        cat.makeSound();
    }
}
