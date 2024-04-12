package com.supriya.accessModifiers.model;

import java.util.Scanner;

public class Person {
    public String name;
    //    public String city;
//    public Object city;
    public String city;
    public int heightInCm;
    public int weightInKg;
//    public Object weightInKg;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public int salary;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public static void main(String[] args) {
        System.out.println("Please enter 2 values: ");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

//        try {
//            int no1 = Integer.valueOf(firstInput);
//            int no2 = Integer.valueOf(secondInput);
//            System.out.println("Division: ");
//        } catch (java.lang.NumberFormatException exception) {
//            System.err.println("entered numbers are not valid numbers");
    }
}

