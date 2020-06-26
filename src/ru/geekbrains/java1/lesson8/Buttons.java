package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ru.geekbrains.java1.lesson8.SettingsWindow.*;

public class Buttons {
    protected static JButton createExitButton() {
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return exitButton;
    }

    protected static JButton createStartButton(SettingsWindow settingsWindow) {
        JButton startButton = new JButton("Start game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });
        return startButton;
    }

    protected static JButton createApplySettingsButton(SettingsWindow settingsWindow) {
        JButton applySettingsButton = new JButton("Apply settings and start the game!");
        applySettingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(false);
                settingsWindow.classStartGame();

            }
        });
        return applySettingsButton;
    }

    protected static void addGameModeButtons(SettingsWindow settingsWindow) {
        settingsWindow.add(new JLabel("Choose game mode:"));
        settingsWindow.humanVsAI = new JRadioButton("Human VS AI");
        settingsWindow.humanVsHuman = new JRadioButton("Human VS Human");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(settingsWindow.humanVsAI);
        buttonGroup.add(settingsWindow.humanVsHuman);

        settingsWindow.humanVsAI.setSelected(true);

        settingsWindow.add(settingsWindow.humanVsAI);
        settingsWindow.add(settingsWindow.humanVsHuman);
    }


    protected static void addGameSettings(SettingsWindow settingsWindow) {
        JLabel lbFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        JLabel lbWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);
        settingsWindow.sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        settingsWindow.sliderWinLength = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_FIELD_SIZE);

        settingsWindow.sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = settingsWindow.sliderFieldSize.getValue();
                lbFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);
                settingsWindow.sliderWinLength.setMaximum(currentValue);
            }
        });

        settingsWindow.sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLength.setText(WIN_LENGTH_PREFIX + settingsWindow.sliderWinLength.getValue());
            }
        });

        settingsWindow.add(lbFieldSize);
        settingsWindow.add(settingsWindow.sliderFieldSize);
        settingsWindow.add(lbWinLength);
        settingsWindow.add(settingsWindow.sliderWinLength);
    }


}
