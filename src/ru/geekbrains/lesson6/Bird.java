package ru.geekbrains.lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Bird extends Animal {
    public static int birdsCount;

    public Bird(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
        birdsCount++;
    }

    public Bird(String name) {
        super(name);
        runLimit = ThreadLocalRandom.current().nextDouble(5, 10);
        swimLimit = 0;
        jumpLimit = ThreadLocalRandom.current().nextDouble(0.1, 0.3);
        birdsCount++;
    }
}