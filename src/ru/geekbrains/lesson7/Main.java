package ru.geekbrains.lesson7;

import static ru.geekbrains.lesson7.FileProcessor.*;
import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) {
        testingFileProcessor();
    }

    public static void testingFileProcessor() {
        try {
            compileFiles("result.txt");
            findWordInFile("firstFile.txt", "eiusmod");
            findWordInFile("eiusmod");
            addWordToFiles("someRandomWord", true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
