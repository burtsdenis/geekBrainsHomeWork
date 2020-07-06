package ru.geekbrains.quarter1.java2.lesson3.phoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final HashMap<String, ArrayList<Person>> phoneBook = new HashMap<>();

    public static void addPersonToPhoneBook(Person person) {
        for (Map.Entry<String, ArrayList<Person>> entry : phoneBook.entrySet()) {
            if (person.getSecondName().equals(entry.getKey())) {
                entry.getValue().add(person);
                return;
            }
        }
        phoneBook.put(
                person.getSecondName(),
                new ArrayList<>()
        );
        phoneBook.get(person.getSecondName()).add(person);
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