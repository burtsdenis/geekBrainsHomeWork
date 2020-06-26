package ru.geekbrains.java1.lesson1;

public class Lesson1 {
    byte b = 127;
    short sh = 128;
    float fl = 1.123f;
    double db = 123.321;
    char ch = 'a';
    boolean bool = true;

    static int year = 129;
    static String str = "Denis";

    public static void main(String[] args) {
        calculate(10, 100, 3, 50);
        checkInRange(3, 15);
        checkThatPositive(-10);
        checkThatNegative(10);
        sayHello(str);
        leapYear(year);
    }


    private static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean checkInRange(int a, int b) {
        int result = a + b;
        return result >= 10 && result <= 20;
    }

    private static void checkThatPositive(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean checkThatNegative(int a) {
        return a < 0;
    }

    private static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }

    private static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Го не високосный");
        }
    }
}
