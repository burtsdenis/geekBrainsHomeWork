package ru.geekbrains.lesson3;

import java.util.Scanner;

public class GuessTheWord {
    private static final Scanner scan = new Scanner(System.in);
    private static final String[] words = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
    };

    public static void initializeTheGame() {
        System.out.println("Welcome to the \"Guess the word\" game!\n" +
                "The word has been chosen, try to Guess it!");
        String puzzledWord = words[(int) (Math.random() * words.length - 1)];
        guessTheWord();

    }

    private static void guessTheWord() {
        System.out.print("Enter the word: ");
        String guessTry = scan.next();
        System.out.println(guessTry);
    }
}
