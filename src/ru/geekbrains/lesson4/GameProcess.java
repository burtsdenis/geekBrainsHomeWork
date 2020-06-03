package ru.geekbrains.lesson4;

import static ru.geekbrains.lesson4.UI.initGameBoard;
import static ru.geekbrains.lesson4.Main.scan;
import static ru.geekbrains.lesson4.UI.printGameBoard;

public class GameProcess {
    public static int turnNumber = 0;
    public static char EMPTY = ' ';
    public static int BOARD_SIZE = 3;
    public static String GAME_MODE;
    public static char[][] gameBoard = new char[BOARD_SIZE][BOARD_SIZE];

    public static void initializeGame() {
        System.out.println("Choose game mode:\n1. Player vs Player\n2. Player vs Computer\n3. Player vs Computer (Hardcore)");
        System.out.print("Game mode (1/2): ");
        GAME_MODE = scan.next();

        switch (GAME_MODE) {
            case "1":
                System.out.print("Enter name for player №" + Player.playersCount + ": ");
                Player player1 = new Player(scan.next(), 'X');
                System.out.print("Enter name for player №" + Player.playersCount + ": ");
                Player player2 = new Player(scan.next(), 'O');
                pvpGame(player1, player2);
                initGameBoard();
                break;
            case "2":
                System.out.print("Enter your name: " + Player.playersCount + ": ");
                Player player = new Player(scan.next(), 'X');
                pvcGame(player);
                initGameBoard();
                break;
            case "3":
                System.out.print("Enter your name: " + Player.playersCount + ": ");
                Player playerH = new Player(scan.next(), 'X');
                pvcGame(playerH);
                initGameBoard();
                break;
        }


    }

    static void pvpGame(Player player1, Player player2) {
        while (true) {
            System.out.println("Turn number is: " + (turnNumber + 1) + "\nIt's " + (turnNumber % 2 == 0 ? player1.name : player1.name) + " turn!");
            System.out.print("Enter the x and y divided by space: ");
            int x;
            int y;
            try {
                x = Integer.parseInt(scan.next());
                y = Integer.parseInt(scan.next());
            } catch (NumberFormatException e) {
                System.out.println("Your input is incorrect, both values must be integer!");
                continue;
            }
            turnNumber++;

            if (turnNumber % 2 == 0) {
                makeTurn(x, y, player1);
            } else {
                makeTurn(x, y, player2);
            }
            printGameBoard();
        }
    }

    static void pvcGame(Player player) {
        if (GAME_MODE.equals("2")) {

        } else if (GAME_MODE.equals("3")) {

        }

    }

    static void makeTurn(int x, int y, Player player) {
        if (checkInput(x, y) && turnAllowed(x, y)) {
            gameBoard[x][y] = player.playingMark;
        }
        if (checkWinner(x, y, player)) {
            System.out.println("Player " + player.name + " wins!");
            System.exit(0);
        }
    }

    static boolean turnAllowed(int x, int y) {
        if (gameBoard[x][y] != EMPTY) {
            return true;
        } else {
            System.out.println("This field is already taken.\nChoose another field!");
            return false;
        }
    }

    static boolean checkInput(int x, int y) {
        if (x <= BOARD_SIZE - 1 && y <= BOARD_SIZE - 1) {
            return true;
        } else {
            System.out.println("Your input is incorrect, values must be between 0 and " + (BOARD_SIZE - 1));
            return false;
        }
    }

    static boolean checkWinner(int x, int y, Player player) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if (gameBoard[i][j] != player.playingMark) {
                    break;
                }
                if (checkVerticals(j) || checkHorizontals(i) || checkDiagonals(i, j)) {
                    return true;
                }

            }
        }
        return false;
    }

    static boolean checkVerticals(int y) {
        return y == gameBoard.length - 1;
    }

    static boolean checkHorizontals(int x) {
        return x == gameBoard.length - 1;
    }

    static boolean checkDiagonals(int x, int y) {
        boolean mainDiagonal = (x - y) == 0 && x == gameBoard.length - 1;
        boolean secondaryDiagonal;

        if (gameBoard.length % 2 == 0) {
            secondaryDiagonal = (x - y) % gameBoard.length == 0 && y == 0;
        } else {
            secondaryDiagonal = (x - y) % gameBoard.length != 0 && y == 0;
        }

        return mainDiagonal || secondaryDiagonal;
    }

}
