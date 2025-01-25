package ch07;

public class VCR {
    boolean power;
    int counter = 0;

    void power() {
        power = !power;
    }

    void play() {
        System.out.println("VCR Play");
    }

    void stop() {
        System.out.println("VCR Stop");
    }

    void rew() {
        System.out.println("VCR rew");
    }

    void ff() {
        System.out.println("VCR FF");
    }
}
