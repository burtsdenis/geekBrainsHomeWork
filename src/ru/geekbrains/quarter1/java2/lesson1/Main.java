package ru.geekbrains.quarter1.java2.lesson1;

import ru.geekbrains.quarter1.java2.lesson1.actions.Movable;
import ru.geekbrains.quarter1.java2.lesson1.characters.Cat;
import ru.geekbrains.quarter1.java2.lesson1.characters.Human;
import ru.geekbrains.quarter1.java2.lesson1.characters.Robot;
import ru.geekbrains.quarter1.java2.lesson1.obstacles.Obstacles;
import ru.geekbrains.quarter1.java2.lesson1.obstacles.TheWall;
import ru.geekbrains.quarter1.java2.lesson1.obstacles.Treadmill;


public class Main {
    public static void main(String[] args) {
        steeplechase();
    }

    public static void steeplechase() {
        Movable[] participants = {
                new Cat(10, 10),
                new Human(10, 10),
                new Robot(10, 30)
        };

        Obstacles[] obstacleCourse = {
                new TheWall(5),
                new Treadmill(3),
                new TheWall(10),
                new Treadmill(5),
                new TheWall(3)
        };

        for (Object participant : participants) {
            for (Obstacles obstacle : obstacleCourse) {
                boolean result = obstacle.passTheObstacle((Movable) participant);
                if (!result) break;
            }
            System.out.println();
        }
    }
}
