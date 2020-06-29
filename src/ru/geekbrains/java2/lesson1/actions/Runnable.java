package ru.geekbrains.java2.lesson1.actions;

public interface Runnable {

    default void run() {
        System.out.printf(this.getClass().getSimpleName() + "runs!");
    }

    default boolean run(int runDistance, int runLimit) {
        String className = this.getClass().getSimpleName();
        if (runDistance <= runLimit) {
            System.out.println(className + " ran successfully!");
            return true;
        } else {
            System.out.println(className + " cannot run so far.");
            return false;
        }
    }

    int getRunLimit();
}
