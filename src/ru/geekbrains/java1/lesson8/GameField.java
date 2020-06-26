package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private static final int WINDOW_WIDTH = 407;
    private static final int WINDOW_HEIGHT = 455;

    public GameField() {
        setBackground(Color.DARK_GRAY);
        JPanel field = new JPanel();
        add(field, BorderLayout.CENTER);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    public void startGame(int gameMode, int fieldSize, int winLength) {

    }
}