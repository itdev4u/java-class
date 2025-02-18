package ch07.abstractEx;

public abstract class Animal {
    void eat() {
        System.out.println("동물이 먹습니다.");
    }

    abstract void makeSound();
}
