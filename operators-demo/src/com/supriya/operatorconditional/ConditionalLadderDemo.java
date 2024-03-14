package com.supriya.operatorconditional;

import java.util.Scanner;

public class ConditionalLadderDemo {
    //        psuedo code
//        accept the no
//        print the no in words
//
    public static void main(String[] args) {
        int input = acceptNumber();
        printNumber(input);
    }
    private static int acceptNumber() { //access_specifier return_type method_name(parameters)
        System.out.println("please enter value: ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        return input;
    }
    public static void printNumber(int no) {
        if (no <= 10) {
            if (no == 1) {
                System.out.println("one");
            }
            if (no == 2) {
                System.out.println("two");
            }
            if (no == 3) {
                System.out.println("three");
            }
            if (no == 4) {
                System.out.println("four");
            }
            if (no == 5) {
                System.out.println("five");
            }
            if (no == 6) {
                System.out.println("six");
            }
            if (no == 7) {
                System.out.println("seven");
            }
            if (no == 8) {
                System.out.println("eight");
            }
            if (no == 9) {
                System.out.println("nine");
            }
            if (no == 10) {
                System.out.println("ten ");
            }
        } else if (no <=20) {
            System.out.println("this no is between 11 to 20");
        }else if (no <=30) {
            System.out.println("thirty");

            if (no == 31) {
                System.out.println("one");
            }
            if (no == 32) {
                System.out.println("two");
            }
            if (no == 33) {
                System.out.println("three");
            }
            if (no == 34) {
                System.out.println("four");
            }
        } else {
            System.out.println("no doesn't match or equal to 100");
        }
    }
}