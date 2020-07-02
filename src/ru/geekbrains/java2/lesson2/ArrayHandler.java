package ru.geekbrains.java2.lesson2;

import ru.geekbrains.java2.lesson2.exceptions.ArraySizeException;

public class ArrayHandler {

    public static String[][] stringToArray(String string) throws ArraySizeException {
        try {
            checkThatStringIsValid(string);
        } catch (ArraySizeException e) {
            throw new ArraySizeException(e.getMessage());
        }
        String[][] array = new String[4][4];
        String[] parsedString = string.split("\n");

        for (int i = 0; i < parsedString.length; i++) {
            for (int j = 0; j < parsedString[i].split(" ").length; j++) {
                array[i][j] = parsedString[i].split(" ")[j];
            }
        }

        return array;
    }

    public static int[][] stringArrayToInts(String[][] array) {
        int[][] intArray = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    try {
                        intArray[i][j] = Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                    throw new NumberFormatException(array[i][j] +
                            " at line: " + i
                            + " at column: " + j
                            + " is not a number");
                }
            }
        }
        return intArray;
    }

    public static int calculateArray(int[][] intArray) {
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                result += intArray[i][j];
            }
        }
        return result / 2;
    }

    public static boolean checkThatStringIsValid(String string) throws ArraySizeException {
        String[] checkingString = string.split("\n");
        if (checkingString.length != 4) throw new ArraySizeException("Column length must be 4");

        for (int i = 0; i < checkingString.length; i++) {
            if (checkingString[i].split(" ").length != 4) throw new ArraySizeException("Wrong line length, at line: " + i + ", line length must be 4");
        }
        return true;
    }
}