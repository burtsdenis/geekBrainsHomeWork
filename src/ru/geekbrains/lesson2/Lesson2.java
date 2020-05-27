package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] binaryArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] randArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] balanceArr = {2, 2, 2, 1, 2, 2, 10, 1};

        revertArrayValues(binaryArr);
        fillAnArray();
        multiplyElements();
        fillDiagonals();
        minAndMax(randArr);
        checkBalance(balanceArr);
        moveElements(randArr, 2);

    }

    private static void revertArrayValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }

    private static void fillAnArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    private static void multiplyElements() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    private static void fillDiagonals() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    private static void minAndMax(int[] arr) {
        int minimum = arr[0];
        int maximum = arr[0];
        for (int value : arr) {
            if (value > maximum) {
                maximum = value;
            } else if (value < minimum) {
                minimum = value;
            }
        }
    }

    private static boolean checkBalance(int[] arr) {
        int arraySum = 0;
        int finalSum = 0;
        for (int value : arr) {
            arraySum += value;
        }
        if (arraySum % 2 == 0) {
            for (int value : arr) {
                finalSum += value;
                if (finalSum == arraySum / 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void moveElements(int[] arr, int n) {
        if (arr.length == 0 ||n % arr.length == 0) {
            return;
        }

        for (int j = 0; j < Math.abs(n % arr.length); j++) {
            if (n > 0) {
                int dummy = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = dummy;
            } else {
                int dummy = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = dummy;
            }
        }
    }
}

