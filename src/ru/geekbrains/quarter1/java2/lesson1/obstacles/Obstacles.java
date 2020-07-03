package ru.geekbrains.quarter1.java2.lesson1.obstacles;


import ru.geekbrains.quarter1.java2.lesson1.actions.Movable;

public class Obstacles {

    public boolean passTheObstacle(Movable movable) {
        if (this instanceof TheWall) {
            return movable.jump(((TheWall) this).height, movable.getJumpLimit());
        } else if (this instanceof Treadmill) {
            return movable.run(((Treadmill) this).length, movable.getRunLimit());
        }
        return false;
    }
}
