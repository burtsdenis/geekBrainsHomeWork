package ru.geekbrains.java1.lesson6;
import java.util.concurrent.ThreadLocalRandom;

public class Dog extends Animal {
    public static int dogsCount;

    public Dog(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
        dogsCount++;
    }

    public Dog(String name) {
        super(name);
        runLimit = ThreadLocalRandom.current().nextDouble(500, 600);
        swimLimit = ThreadLocalRandom.current().nextDouble(10, 15);
        jumpLimit = ThreadLocalRandom.current().nextDouble(0.4, 1.4);
        dogsCount++;
    }
}