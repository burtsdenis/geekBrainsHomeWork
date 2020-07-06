package ru.geekbrains.quarter1.java2.lesson3.phoneBook;

public class Person {
    private final String secondName;
    private final String phoneNumber;
    private final String email;

    public Person(String secondName, String phoneNumber, String email) {
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
