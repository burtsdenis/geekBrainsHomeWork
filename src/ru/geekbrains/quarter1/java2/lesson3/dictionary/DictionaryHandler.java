package ru.geekbrains.quarter1.java2.lesson3.dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryHandler {

    public static ArrayList<String> getUniqueWords(String[] arrayOfWords) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        uniqueWords.add(arrayOfWords[0]);
        for (int i = 1; i < arrayOfWords.length; i++) {
            if (isWordExist(arrayOfWords[i], uniqueWords)) {
                uniqueWords.add(arrayOfWords[i]);
            }
        }
        return uniqueWords;
    }

    private static boolean isWordExist(String word, ArrayList<String> words) {
      for (String str: words) {
          if (str.equals(word)) {
              return false;
          }
      }
      return true;
    }


    public static HashMap<String, Integer> getWordsCount(String[] arrayOfWords) {
        HashMap<String,Integer> wordsCount = new HashMap<>();
        int counter;
        for (String word : arrayOfWords) {
            if (!wordsCount.containsKey(word)) {
                counter = 1;
            } else {
                counter = wordsCount.get(word) + 1;
            }
            wordsCount.put(word, counter);
        }
        return wordsCount;
    }
}

