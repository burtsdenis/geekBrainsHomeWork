package ru.geekbrains.java1.lesson6;

public abstract class Animal {
    public static int animalsCount;
    String name;
    protected double runLimit;
    protected double swimLimit;
    protected double jumpLimit;

    public Animal(String name){
        this.name = name;
        animalsCount++;
    }

    public Animal(String name, double runLimit, double swimLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        animalsCount++;
    }

    protected String run(double distance) {
        if (this.runLimit > 0) {
            if (distance <= this.runLimit) {
                return this.getClass().getSimpleName() + " " + this.name + " runs!";
            } else {
                return this.getClass().getSimpleName() + " " + this.name + " cannot run so far.";
            }
        } else {
            return this.getClass().getSimpleName() + " " + this.name + " cannot run!";
        }
    }

    ;

    protected String swim(double distance) {
        if (this.swimLimit > 0) {
            if (distance <= this.swimLimit) {
                return this.getClass().getSimpleName() + " " + this.name + " swim!";
            } else {
                return this.getClass().getSimpleName() + " " + this.name + " cannot swim so far.";
            }
        } else {
            return this.getClass().getSimpleName() + " " + this.name + " cannot swim!";
        }
    }

    protected String jump(double distance) {
        if (this.jumpLimit > 0) {
            if (distance <= this.jumpLimit) {
                return this.getClass().getSimpleName() + " " + this.name + " jumps!";
            } else {
                return this.getClass().getSimpleName() + " " + this.name + " cannot jump so far.";
            }
        } else {
            return this.getClass().getSimpleName() + " " + this.name + " cannot jump!";
        }
    }

    protected static void printListOfAnimals() {
        System.out.println("Animals: " + animalsCount +
                            "\nDogs: " + Dog.dogsCount +
                            "\nCats: " + Cat.catsCount +
                            "\nHorses: " + Horse.horsesCount +
                            "\nBirds: " + Bird.birdsCount);
    }
}
