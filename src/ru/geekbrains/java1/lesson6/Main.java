package ru.geekbrains.java1.lesson6;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby", 500, 10, 2);
        Cat cat = new Cat("Barsik", 200, 0, 0.4);
        Horse horse = new Horse("Black Jack");
        Bird bird = new Bird("Tweetty");


        System.out.println(dog.run(11));
        System.out.println(cat.swim(10));
        System.out.println(horse.jump(10));
        System.out.println(bird.run(3));

        Animal.printListOfAnimals();
    }
}
