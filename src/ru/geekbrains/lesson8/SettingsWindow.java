package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import static ru.geekbrains.lesson8.GameButtons.*;

public class SettingsWindow extends JFrame {
    protected static final int WINDOW_WIDTH = 350;
    protected static final int WINDOW_HEIGHT = 270;
    protected static final int MIN_WIN_LENGTH = 3;
    protected static final int MIN_FIELD_SIZE = 3;
    protected static final int MAX_FIELD_SIZE = 10;
    protected static final String FIELD_SIZE_PREFIX = "Field size: ";
    protected static final String WIN_LENGTH_PREFIX = "Win length: ";

    protected MainWindow mainWindow;
    protected JRadioButton humanVsAI;
    protected JRadioButton humanVsHuman;
    protected JSlider sliderWinLength;
    protected JSlider sliderFieldSize;

    public SettingsWindow(MainWindow tctMainWindow) {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.mainWindow = tctMainWindow;
        Rectangle mainWindowBounds = tctMainWindow.getBounds();
        int positionX = (int) mainWindowBounds.getCenterX() - WINDOW_WIDTH / 2;
        int positionY = (int) mainWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(positionX, positionY);
        add(GameButtons.createApplySettingsButton(this), BorderLayout.SOUTH);
        setResizable(false);
        setTitle("Create game");
        setLayout(new GridLayout(8, 1));
        GameButtons.addGameModeButtons(this);
        GameButtons.addGameSettings(this);

    }

    protected void classStartGame() {
        int gameMode;
        if (humanVsAI.isSelected()) {
            gameMode = GameMode.HUMAN_VS_AI.getGameMode();
        } else if (humanVsHuman.isSelected()) {
            gameMode = GameMode.HUMAN_VS_HUMAN.getGameMode();

        } else {
            gameMode = 999;
            System.out.println("This game mode is not available for now");;
        }
        int fieldSize = sliderFieldSize.getValue();
        int winLength = sliderWinLength.getValue();

        mainWindow.startGame(gameMode, fieldSize, winLength);
    }
}
