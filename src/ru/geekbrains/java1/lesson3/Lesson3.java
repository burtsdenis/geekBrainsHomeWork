package ru.geekbrains.java1.lesson3;


import java.util.Scanner;

public class Lesson3 {
    public static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Which game do you want to play?\n1. Guess the number\n2. Guess the word");
        System.out.print("Your choose: ");
        String input = SCAN.next();
        switch (input) {
            case "1":
                GuessTheNum.initializeTheGame();
                break;
            case "2":
                GuessTheWord.initializeTheGame();
                break;
        }
    }
}
