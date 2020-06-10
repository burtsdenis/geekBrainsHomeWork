package ru.geekbrains.lesson5;


public class Main {
    public static void main(String[] args) {
        Department itDepartment = new Department("src/ru/geekbrains/lesson5/itDepartment.txt");

        for (Employee employee : itDepartment.getEmployeesList()) {
                employee.printEmployeesOlderThen(40);
        }
    }
}
