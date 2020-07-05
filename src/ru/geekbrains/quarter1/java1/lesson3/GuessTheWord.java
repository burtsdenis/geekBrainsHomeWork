package ru.geekbrains.quarter1.java1.lesson3;

public class GuessTheWord {

    private static final String[] WORDS = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
    };

    public static void initializeTheGame() {
        System.out.println("Welcome to the \"Guess the word\" game!\n" +
                "The word has been chosen, try to Guess it!");
        String puzzledWord = WORDS[(int) (Math.random() * WORDS.length - 1)];
        StringBuilder hidedWord = new StringBuilder("##############");
        boolean notGuessed = true;
        while (notGuessed) {
            notGuessed = guessTheWord(puzzledWord, hidedWord);
        }
    }

    private static boolean guessTheWord(String puzzledWord, StringBuilder hidedWord) {
        System.out.print("Puzzled Word: ");
        System.out.print(hidedWord);
        System.out.print("\nEnter the word: ");
        String guessTry = Lesson3.SCAN.next();
        if (guessTry.equals(puzzledWord)) {
            System.out.println("You win! Congrats!");
            return false;
        }
        int minLength = Math.min(guessTry.length(), puzzledWord.length());
        for (int i = 0; i < minLength; i++) {
            if (guessTry.charAt(i) == puzzledWord.charAt(i)) {
                hidedWord.setCharAt(i, guessTry.charAt(i));
            }
        }
        return true;
    }
}
