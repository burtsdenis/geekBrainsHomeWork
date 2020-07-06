package ru.geekbrains.quarter1.java2.lesson3;

import ru.geekbrains.quarter1.java2.lesson3.dictionary.DictionaryHandler;
import ru.geekbrains.quarter1.java2.lesson3.phoneBook.Person;
import ru.geekbrains.quarter1.java2.lesson3.phoneBook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        dictionaryHandlerTest();

        phoneBookTest();
    }

    private static void dictionaryHandlerTest() {
        String[] arrayOfWords = { "lion", "sow", "bland", "fate", "mouse", "quality",
                "ancestor", "sock", "acceptance", "ratio", "leave", "mouse",
                "artificial", "fate", "verdict", "fate", "strain",
                "correspondence", "soft", "mouse", "sow", "fate",
                "mouse", "activate", "exchange"};


        System.out.println(DictionaryHandler.getUniqueWords(arrayOfWords));

        System.out.println(DictionaryHandler.getWordsCount(arrayOfWords));
    }

    private static void phoneBookTest() {

        PhoneBook.addPersonToPhoneBook(new Person("Petrov", "+7123456789", "apetrov@companyname.ru"));
        PhoneBook.addPersonToPhoneBook(new Person("Petrov", "+7987654321", "bpetrov@companyname.ru"));
        PhoneBook.addPersonToPhoneBook(new Person("Sidorov", "+712349876", "csidorov@companyname.ru"));
        PhoneBook.addPersonToPhoneBook(new Person("Sidorov", "+798761234", "psidorov@companyname.ru"));
        PhoneBook.addPersonToPhoneBook(new Person("Ivanov", "+7", "ivanov@companyname.ru"));

        System.out.println(PhoneBook.getEmailBySecondName("Petrov"));
        System.out.println(PhoneBook.getPhoneNumberBySecondName("Sidorov"));
        System.out.println(PhoneBook.getEmailBySecondName("Cat"));

    }
}
