package ru.geekbrains.quarter1.java1.lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Animal {
    public static int horsesCount;

    public Horse(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
        horsesCount++;
    }

    public Horse(String name) {
        super(name);
        runLimit = ThreadLocalRandom.current().nextDouble(1500, 2000);
        swimLimit = ThreadLocalRandom.current().nextDouble(100, 200);
        jumpLimit = ThreadLocalRandom.current().nextDouble(3, 4);
        horsesCount++;
    }
}
