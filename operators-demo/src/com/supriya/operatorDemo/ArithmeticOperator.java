package com.supriya.operatorDemo;
import java.util.Scanner;

public class ArithmeticOperator {
    //    attribute
    int firstNumber;
    int secondNumber;

    //    behavior/method
    void addition() {
        int total = firstNumber + secondNumber;
        System.out.println("total of 2 numbers is: " + total);
    }


    void subtraction() {
        int subtraction= firstNumber - secondNumber;
        System.out.println("subtraction of 2 numbers is: " + subtraction);
    }


    void multiplication() {
        int  total = firstNumber * secondNumber;
        System.out.println("multiplication of 2 numbers is: " +  total);
    }


    void division() {
        int total = firstNumber / secondNumber;
        System.out.println("division of 2 numbers is: " + total);
    }


    void modulation() {
        int modulo = firstNumber % secondNumber;
        System.out.println("remainder of 2 numbers is: " + modulo);
    }

    public static void main(String[] args) {

        System.out.println("please enter 2 value: ");
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();


        ArithmeticOperator arithmaticOperator = new ArithmeticOperator();
        arithmaticOperator.firstNumber = 5;
        arithmaticOperator.secondNumber = 4;

        arithmaticOperator.addition();
        arithmaticOperator.subtraction();
        arithmaticOperator.multiplication();
        arithmaticOperator.division();
        arithmaticOperator.modulation();

    }
}