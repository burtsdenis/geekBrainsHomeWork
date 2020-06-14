package ru.geekbrains.lesson5;

public class Employee {
    private final String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

     public Employee(String name, int age, String phone, String email, String position, int salary) {
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


    public void printEmployeesOlderThen(int age) {
         if (this.age > age) {
             this.printInfo();
         }
    }
}
