package ru.geekbrains.java2.lesson1.characters;

import ru.geekbrains.java2.lesson1.actions.Jumpable;
import ru.geekbrains.java2.lesson1.actions.Runnable;

public class Cat implements Runnable, Jumpable {

    private int jumpLimit;
    private int runLimit;

    public Cat(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public void jump() {
        Jumpable.super.jump();
    }

    @Override
    public void run() {
        Runnable.super.run();
    }

    @Override
    public boolean run(int runDistance, int runLimit) {
        return Runnable.super.run(runDistance, runLimit);
    }

    @Override
    public int getRunLimit() {
        return this.runLimit;
    }

    @Override
    public boolean jump(int jumpDistance, int jumpLimit) {
        return Jumpable.super.jump(jumpDistance, jumpLimit);
    }

    @Override
    public int getJumpLimit() {
        return this.jumpLimit;
    }
}
