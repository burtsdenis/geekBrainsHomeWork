package ru.geekbrains.lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends Animal {
    public static int catsCount;

    public Cat(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
        catsCount++;
    }

    public Cat(String name) {
        super(name);
        runLimit = ThreadLocalRandom.current().nextDouble(200, 300);
        swimLimit = 0;
        jumpLimit = ThreadLocalRandom.current().nextDouble(2,4);
        catsCount++;
    }
}
