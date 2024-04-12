package com.supriya.exceptionHandling;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        System.out.println("Please enter 2 values: ");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        try {
            int no1 = Integer.valueOf(firstInput);
            int no2 = Integer.valueOf(secondInput);
            System.out.println("Division: ");
        } catch (java.lang.NumberFormatException exception) {
            System.err.println("entered numbers are not valid numbers");
        }
    }
}
