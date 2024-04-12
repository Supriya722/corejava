package com.supriya.accessModifiers.services;

import com.supriya.accessModifiers.model.Person;

import java.util.Scanner;

public class AccessModifiersDemo {
    public static void main(String[] args) {
        System.out.println("Please enter person details: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Person person1 = new Person();
        person1. name = name;
        System.out.println("Please enter person city:");
        String city = scanner.nextLine();
        person1.city = city;

        System.out.println("Please enter person height in Cm:");
        String heightInCm = scanner.nextLine();
        person1.heightInCm = Integer.valueOf(heightInCm);

        System.out.println("Please enter person weight in Kg:");
        String weightInKg = scanner.nextLine();
        person1.weightInKg = Integer.valueOf(person1.getWeightInKg());

        System.out.println("Please enter person salary:");
        String salary = scanner.nextLine();
        person1.salary = Integer.valueOf(salary);
    }
}
