package ru.geekbrains.quarter1.java2.lesson1.characters;

import ru.geekbrains.quarter1.java2.lesson1.actions.Movable;

public class Cat implements Movable {

    private int jumpLimit;
    private int runLimit;

    public Cat(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public void jump() {
        Movable.super.jump();
    }

    @Override
    public void run() {
        Movable.super.run();
    }

    @Override
    public boolean run(int runDistance, int runLimit) {
        return Movable.super.run(runDistance, runLimit);
    }

    @Override
    public int getRunLimit() {
        return this.runLimit;
    }

    @Override
    public boolean jump(int jumpDistance, int jumpLimit) {
        return Movable.super.jump(jumpDistance, jumpLimit);
    }

    @Override
    public int getJumpLimit() {
        return this.jumpLimit;
    }
}
