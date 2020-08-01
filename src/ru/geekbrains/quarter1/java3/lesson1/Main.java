package ru.geekbrains.quarter1.java3.lesson1;

import ru.geekbrains.quarter1.java3.lesson1.fruitBox.Apple;
import ru.geekbrains.quarter1.java3.lesson1.fruitBox.Box;
import ru.geekbrains.quarter1.java3.lesson1.fruitBox.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        genericArrayTest();
        testFruitBox();
    }

    public static void genericArrayTest() {
        GenericArray<Integer> genericArray = new GenericArray<>(new Integer[]{1, 2, 3, 4, 5,});
        GenericArray<String> genericArray1 = new GenericArray<>(new String[]{"Java", "Spring", "Hibernate", "Something"});
        System.out.println(genericArray.arrayToList());
        System.out.println(genericArray1.arrayToList());
        System.out.println(Arrays.toString(genericArray.replaceElements(2, 3)));
        System.out.println(Arrays.toString(genericArray1.replaceElements(2,3)));
    }

    public static void testFruitBox() {
        ArrayList<Apple> listOfApples = new ArrayList<>();
        ArrayList<Orange> listOfOranges = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listOfApples.add(new Apple());
            listOfOranges.add(new Orange());
        }

        Box<Apple> boxOfApples = new Box<>(listOfApples);
        Box<Orange> boxOfOranges = new Box<>(listOfOranges);
        Box<Orange> anotherBoxOfOranges = boxOfOranges.moveFruitsToAnotherBox();

        System.out.println(boxOfApples.getWeightOfBox());
        System.out.println(boxOfOranges.getWeightOfBox());

        System.out.println(boxOfApples.compareTheBoxes(boxOfOranges));
    }
}
