package ru.geekbrains.quarter1.java3.lesson1.fruitBox;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruitBox;

    public Box(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public float getWeightOfBox() {
        float result = 0f;
        if (this.fruitBox.size() > 0) {
            for (int i = 0; i < this.fruitBox.size(); i++) {
                result += fruitBox.get(i).getWeight();
            }
        }
        return result;
    }

    public boolean compareTheBoxes(Box<? extends Fruit> boxWithFruit) {
        if (this.getWeightOfBox() == boxWithFruit.getWeightOfBox()) return true;
        return false;
    }

    public Box<T> moveFruitsToAnotherBox() {
        return new Box<>(this.fruitBox);
    }
}
