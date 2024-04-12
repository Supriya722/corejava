package com.supriya.OOPs.inheritance.service;

import com.supriya.OOPs.inheritance.model.Employee;
import com.supriya.OOPs.inheritance.model.Person;

import java.util.Scanner;

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Please enter name of employee:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Please enter city of employ :");
        String city = scanner.nextLine();

        System.out.println("Please enter employ id of employee:");
        int employeeId = scanner.nextInt();

        System.out.println("Please enter employ salary:");
        int salary = scanner.nextInt();

        System.out.println("Please enter department of employ:");
        String dept = scanner.nextLine();

        Employee employee = new Employee();
        employee.name = name;
        employee.city = city;
        employee.employeeId = employeeId;
        employee.dept = dept;
        employee.salary = salary;

        System.out.println(employee);

    }
}
