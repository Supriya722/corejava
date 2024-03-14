package com.supriya.operatorDemo;
import java.util.Scanner;

public class BitwiseAndOperator {
    //    attribute
    static int firstNumber = 0;
    static int secondNumber = 0;

    //    behavior/method
    public static void bitwiseAndOpertation() {
        int result = firstNumber & secondNumber;
        System.out.println("bitwise AND result: " + result);
    }
    public static void main(String[] args) {

        System.out.println("please enter 2 value: ");
        Scanner scanner = new Scanner(System.in);
        firstNumber = Integer.valueOf(scanner.nextLine());
        secondNumber = Integer.valueOf(scanner.nextLine());

        bitwiseAndOpertation();
    }
}