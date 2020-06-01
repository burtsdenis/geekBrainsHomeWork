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
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void revertArrayValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void fillAnArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void multiplyElements() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static void fillDiagonals() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }


//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    private static void minAndMax(int[] arr) {
        int minimum = arr[0];
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum){
                maximum = arr[i];
            } else if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
    }

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//если в массиве есть место, в котором сумма левой и правой части массива равны.
//Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

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

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
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

