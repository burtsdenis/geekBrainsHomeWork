package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.actions.Jumpable;
import ru.geekbrains.java2.lesson1.actions.Runnable;
import ru.geekbrains.java2.lesson1.characters.Cat;
import ru.geekbrains.java2.lesson1.characters.Human;
import ru.geekbrains.java2.lesson1.characters.Robot;
import ru.geekbrains.java2.lesson1.obstacles.Obstacles;
import ru.geekbrains.java2.lesson1.obstacles.TheWall;
import ru.geekbrains.java2.lesson1.obstacles.Treadmill;


public class Main {
    public static void main(String[] args) {
        steeplechase();
    }

    public static void steeplechase() {
        Object[] participants = {
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
                boolean result = obstacle.passTheObstacle((Jumpable) participant, (Runnable) participant);
                if (!result) break;
            }
            System.out.println();
        }
    }
}
