package ru.geekbrains.java2.lesson1.obstacles;


import ru.geekbrains.java2.lesson1.actions.Jumpable;
import ru.geekbrains.java2.lesson1.actions.Runnable;

public class Obstacles {

    public boolean passTheObstacle(Jumpable jumpable, Runnable runnable) {
        if (this instanceof TheWall) {
            return jumpable.jump(((TheWall) this).height, jumpable.getJumpLimit());
        } else if (this instanceof Treadmill) {
            return runnable.run(((Treadmill) this).length, runnable.getRunLimit());
        }
        return false;
    }
}
