package ru.geekbrains.java2.lesson1.actions;

public interface Movable {
    default void jump() {
        System.out.printf(this.getClass().getSimpleName() + "jumps!");
    }

    default boolean jump(int jumpDistance, int jumpLimit) {
        String className = this.getClass().getSimpleName();
        if (jumpDistance <= jumpLimit) {
            System.out.println(className + " jumped successfully!");
            return true;
        } else {
            System.out.println(className + " cannot jump so far.");
            return false;
        }
    }

    int getJumpLimit();

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
