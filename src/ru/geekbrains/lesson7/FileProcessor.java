package ru.geekbrains.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FileProcessor {
    static File currentDir = new File("src/ru/geekbrains/lesson7");
    static FileInputStream fileInputStream;
    static ArrayList<String> listOfFiles = new ArrayList<>();
    static FileOutputStream fileOutputStream;
    static PrintStream printStream;

    protected static void getAllTextFiles() {
        for (File file : Objects.requireNonNull(currentDir.listFiles())) {
            if (file.getName().contains(".txt") && !file.getName().equals("result.txt")) {
                listOfFiles.add(file.getAbsoluteFile().toString());
            }
        }
    }


    public static void compileFiles(String resultFile) throws FileNotFoundException {
        FileProcessor.getAllTextFiles();
        resultFile = "src/ru/geekbrains/lesson7/" + resultFile;
        fileOutputStream = new FileOutputStream(resultFile, true);
        printStream = new PrintStream(fileOutputStream);
        for (String pathToFile : listOfFiles) {
            fileInputStream = new FileInputStream(pathToFile);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                printStream.println(scanner.nextLine());
            }
        }
    }

    public static boolean findWordInFile(String file, String word) throws FileNotFoundException {
        file = "src/ru/geekbrains/lesson7/" + file;
        fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.contains(word)) {
                int index = line.indexOf(word);
                System.out.println("Word exists.\nFile name: " + file + "\nIndex is: " + (index + 1));
                return true;
            }
        }
        System.out.println("Word does not exist in this file.");
        return false;
    }

    public static boolean findWordInFile(String word) throws FileNotFoundException {
        int result = 0;
        System.out.println("Iterating in all files in directory: " + currentDir);
        for (String file : listOfFiles) {
            fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.contains(word)) {
                    int index = line.indexOf(word);
                    System.out.println("Word exists.\nFile name: " + file + "\nIndex is: " + (index + 1));
                    result++;
                }
            }
        }

        if (result > 0) {
            return true;
        } else {
            System.out.println("Word does not exist in this file.");
            return false;
        }
    }

    public static void addWordToFiles(String word, boolean newLine) throws FileNotFoundException {
        for (String file : listOfFiles) {
            fileOutputStream = new FileOutputStream(file, true);
            printStream = new PrintStream(fileOutputStream);
            if (newLine) {
                printStream.println(word);
            } else {
                printStream.print(word);
            }
        }
    }
}
