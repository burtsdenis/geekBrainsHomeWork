package ru.geekbrains.quarter1.java2.lesson3.phoneBook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final HashMap<String, ArrayList<Person>> phoneBook = new HashMap<>();

    public static void addPersonToPhoneBook(Person person) {
        ArrayList<Person> persons = phoneBook.get(person.getSecondName());
        if (persons == null) {
            persons = new ArrayList<>();
        }
        persons.add(person);
        phoneBook.put(person.getSecondName(), persons);
    }

    public static ArrayList<String> getPhoneNumberBySecondName(String secName) {
        return getPropertyBySecondName(secName, "phoneNumber");
    }

    public static ArrayList<String> getEmailBySecondName(String secName) {
        return getPropertyBySecondName(secName, "email");
    }

    private static ArrayList<String> getPropertyBySecondName(String secName, String property) {
        ArrayList<String> properties = new ArrayList<>();
        try {
            ArrayList<Person> personsList = phoneBook.get(secName);
            for (Person person : personsList) {
                switch (property) {
                    case "email":
                        properties.add(person.getEmail());
                        break;
                    case "phoneNumber":
                        properties.add(person.getPhoneNumber());
                        break;
                }
            }
        } catch (NullPointerException e) {
            System.out.print("There is no such person/persons with the second name: " + secName + " ");
        }

        return properties;
    }
}