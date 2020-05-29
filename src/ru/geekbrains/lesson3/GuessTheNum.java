package ru.geekbrains.lesson3;

import java.io.IOException;
import java.util.Scanner;

public class GuessTheNum {
    public static final Scanner scan = new Scanner(System.in);
    public static final int easyRange = 9;
    public static final int mediumRange = 19;
    public static final int hardRange = 29;
    public static String difficultyLevel;

    public static void initializeTheGame() throws IOException {
        greetingsPrint();
        chooseTheDifficult();
    }
    public static void playGame(int maxRange) {
        System.out.println("Playing " + difficultyLevel + " game!");
        int puzzledNumber = (int) (Math.random() * maxRange);
        while (true) {
            System.out.print("Enter the number: ");
            int askedNumber = scan.nextInt();
            if (askedNumber == puzzledNumber) {
                System.out.println("You win, congratulations!");
                break;
            } else {
                if (askedNumber > puzzledNumber) {
                    System.out.println("Puzzled number is lower.");
                } else {
                    System.out.println("Puzzled number is higher.");
                }
            }
        }
     }

    public static void playHardcoreGame() {
        System.out.println("Playing " + difficultyLevel.toUpperCase() + " game!");
        int puzzledNumber = (int) (Math.random() * 49);
        int counter = 0;
        while (true) {
            if (counter == 10) {
                System.out.println("You lose.");
                break;
            }
            System.out.print("Enter the number: ");
            int askedNumber = scan.nextInt();
            if (askedNumber == puzzledNumber) {
                System.out.println("You win, congratulations!");
                break;
            } else {
                if (askedNumber > puzzledNumber) {
                    System.out.println("Puzzled number is lower.\nMoves left: " + (10 - counter - 1));
                } else {
                    System.out.println("Puzzled number is higher.\nMoves left: " + (10 - counter - 1));
                }
            }

            counter++;
        }
    }

    public static void chooseTheDifficult() {
        System.out.print("Your difficulty: ");
        difficultyLevel = scan.nextLine();
        switch (difficultyLevel.toUpperCase().charAt(0) + difficultyLevel.substring(1)) {
            case "Easy":
            case "1":
                difficultyLevel = "easy";
                playGame(easyRange);
                break;
            case "Medium":
            case "2":
                difficultyLevel = "medium";
                playGame(mediumRange);
                break;
            case "Hard":
            case "3":
                difficultyLevel = "hard";
                playGame(hardRange);
                break;
            case "Hardcore":
            case "4":
                difficultyLevel = "hardcore";
                playHardcoreGame();
                break;
            default:
                System.out.println("Your input is incorrect, ");
                chooseTheDifficult();
        }
    }

    public static void greetingsPrint(){
        System.out.println("Welcome to the \"Guess the number\" game!\nChoose the difficulty:\n" +
                "1. Easy (range is from 0 to 9)\n" +
                "2. Medium (range is from 0 to 19)\n" +
                "3. Hard (range is from 0 to 29)\n" +
                "4. Hardcore (range is from 0 to 49 and the amount of the available moves is restricted to 10)"
        );
    }

}
