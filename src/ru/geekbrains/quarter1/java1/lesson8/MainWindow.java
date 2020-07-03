package ru.geekbrains.quarter1.java1.lesson8;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private SettingsWindow tctSettingsWindow;
    private GameField tctGameField;

    public MainWindow() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Tic Tac Toe");
        setResizable(false);
        this.tctGameField = new GameField();
        this.tctSettingsWindow = new SettingsWindow(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(Buttons.createStartButton(tctSettingsWindow));
        buttonPanel.add(Buttons.createExitButton());
        add(buttonPanel, BorderLayout.SOUTH);

        GameField tctGameField = new GameField();
        add(tctGameField, BorderLayout.CENTER);

        setVisible(true);
    }

    public void  startGame(int gameMode, int fieldSize, int winLength) {
        System.out.printf(" Game mode: %d%n Field size: %d%n Win length: %d%n", gameMode, fieldSize, winLength);
        this.tctGameField.startGame(gameMode, fieldSize, winLength);
    }
}
