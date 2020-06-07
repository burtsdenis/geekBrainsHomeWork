package ru.geekbrains.lesson5;

import java.util.*;

public class Person {
    private final String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public static void main(String[] args) {
        Person[] department = new Person[5];
        department[0] = new Person("Denis Burtsev", 25, "+7123456789", "dburtsev@somemail.coru", "Developer", 60000);
        department[1] = new Person("Hilary Barry", 55, "+77112659193", "hbarry@somemail.coru", "Manager", 30000);
        department[2] = new Person("Farhana Rawlings", 41, "+75145318471", "frawlings@somemail.coru", "QA Engineer", 25000);
        department[3] = new Person("John Doe", 35, "+71126359123", "jdoe@somemail.coru", "Developer", 60000);
        department[4] = new Person("Lorem Ipsum", 999, "+7125152376", "lipsum@somemail.coru", "DevOps", 300000000);

        for (Person person : department) {
            if (person.age > 40) {
                person.printInfo();
            }
        }
    }

    public Person(String name, int age, String phone, String email, String position, int salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.position = position;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println("Name: " + this.name +
                           ", age: " + this.age +
                           ", phone: " + this.phone +
                           ", email: " + this.email +
                           ", position: " + this.position +
                           ", salary: " + this.salary);
    }

}
