package ru.geekbrains.java1.lesson3;


public class GuessTheNum {
    private static final int EASY_RANGE = 9;
    private static final int MEDIUM_RANGE = 19;
    private static final int HARD_RANGE = 29;
    private static String DIFFICULTY_LEVEL;

    public static void initializeTheGame() {
        greetingsPrint();
        chooseTheDifficult();
        System.out.print("One more game?\nYes/No: ");
        String command = Lesson3.SCAN.next();
        switch (command) {
            case "Yes":
            case "1":
                initializeTheGame();
                break;
            case "No":
            case "2":
                System.out.println("Bye!");
                break;
        }
    }

    private static void playGame(int maxRange) {
        System.out.println("Playing " + DIFFICULTY_LEVEL + " game!");
        int puzzledNumber = (int) (Math.random() * maxRange);
        while (true) {
            System.out.print("Enter the number: ");
            int askedNumber = Lesson3.SCAN.nextInt();
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

    private static void playHardcoreGame() {
        System.out.println("Playing " + DIFFICULTY_LEVEL.toUpperCase() + " game!");
        int puzzledNumber = (int) (Math.random() * 49);
        int counter = 0;
        while (true) {
            if (counter == 10) {
                System.out.println("You lose.");
                break;
            }
            System.out.print("Enter the number: ");
            int askedNumber = Lesson3.SCAN.nextInt();
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

    private static void chooseTheDifficult() {
        System.out.print("Your difficulty: ");
        DIFFICULTY_LEVEL = Lesson3.SCAN.next();
        switch (DIFFICULTY_LEVEL.toUpperCase().charAt(0) + DIFFICULTY_LEVEL.substring(1)) {
            case "Easy":
            case "1":
                DIFFICULTY_LEVEL = "easy";
                playGame(EASY_RANGE);
                break;
            case "Medium":
            case "2":
                DIFFICULTY_LEVEL = "medium";
                playGame(MEDIUM_RANGE);
                break;
            case "Hard":
            case "3":
                DIFFICULTY_LEVEL = "hard";
                playGame(HARD_RANGE);
                break;
            case "Hardcore":
            case "4":
                DIFFICULTY_LEVEL = "hardcore";
                playHardcoreGame();
                break;
            default:
                System.out.println("Your input is incorrect, ");
                chooseTheDifficult();
        }
    }

    private static void greetingsPrint() {
        System.out.println("Welcome to the \"Guess the number\" game!\nChoose the difficulty:\n" +
                "1. Easy (range is from 0 to 9)\n" +
                "2. Medium (range is from 0 to 19)\n" +
                "3. Hard (range is from 0 to 29)\n" +
                "4. Hardcore (range is from 0 to 49 and the amount of the available moves is restricted to 10)"
        );
    }
}
