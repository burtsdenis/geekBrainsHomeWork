package ru.geekbrains.quarter1.java1.lesson4;

public class Player {
    String name;
    char playingMark;
    static int playersCount = 0;

    public Player(String name, char playingMark) {
        playersCount++;
        this.name = name;
        this.playingMark = playingMark;
    }
}
