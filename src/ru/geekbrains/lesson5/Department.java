package ru.geekbrains.lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private ArrayList<Employee> employeesList;


    public Department(String fileName) {
        this.employeesList = new ArrayList<>();
        try {
            File departmentFile = new File(fileName);
            Scanner scanner = new Scanner(departmentFile);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String phone = data[2];
                String email = data[3];
                String position = data[4];
                int salary = Integer.parseInt(data[5]);

                this.employeesList.add(new Employee(name, age, phone, email, position, salary));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> getEmployeesList() {
        return this.employeesList;
    }
}
