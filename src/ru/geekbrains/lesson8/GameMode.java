package ru.geekbrains.lesson8;

public enum GameMode {
    HUMAN_VS_AI(0),
    HUMAN_VS_HUMAN(1);

    private int gameMode;

    GameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public int getGameMode() {
        return gameMode;
    }
}
