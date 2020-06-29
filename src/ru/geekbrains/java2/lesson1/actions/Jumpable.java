package ru.geekbrains.java2.lesson1.actions;

public interface Jumpable {

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

}
