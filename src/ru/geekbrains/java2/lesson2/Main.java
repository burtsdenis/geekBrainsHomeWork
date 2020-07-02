package ru.geekbrains.java2.lesson2;

import ru.geekbrains.java2.lesson2.exceptions.ArraySizeException;

public class Main {
    public static void main(String[] args) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String str2 = "10 3 1 2\n2 3 2 2\n5 6 7 1 3\n300 3 1 0 0";
        String str3 = "10 a 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        handlerTest(str);
        handlerTest(str2);
        handlerTest(str3);
    }

    public static void handlerTest(String string) {
        try {
            String[][] stringArray = ArrayHandler.stringToArray(string);
            int[][] intArray = ArrayHandler.stringArrayToInts(stringArray);
            System.out.println(ArrayHandler.calculateArray(intArray));
        } catch (ArraySizeException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
