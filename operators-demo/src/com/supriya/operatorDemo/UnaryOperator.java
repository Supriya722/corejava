package com.supriya.operatorDemo;
import java.util.Scanner;

public class UnaryOperator {
    //    attribute or operands
    int number = 0;

    //    method
    void preIncrement(int input) {
        System.out.println("preIncrement " + ++input);
        System.out.println("preIncrement " + input);
    }


    void postIncrement(int input) {
        System.out.println("postIncrement " + input++);
        System.out.println("postIncrement " + input);
    }


    void preDecrement(int input) {
        System.out.println("preDecrement " + --input);
        System.out.println("preDecrement " + input);
    }


    void postDecrement(int input) {
        System.out.println("postDecrement " + input--);
        System.out.println("postDecrement " + input);
    }

    void complement(int input) {
        System.out.println("complement: " + -input);
        System.out.println("after complement: " + input);
    }

    void negation(boolean flag) {
        System.out.println("negation: " + !flag);
    }

    public static void main(String[] args) {

        System.out.println("please enter 2 value: ");
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();


        UnaryOperator unaryOperator = new UnaryOperator();
        int no = Integer.valueOf(Input);


        unaryOperator.preIncrement(no);
        unaryOperator.postIncrement(no);

        unaryOperator.preDecrement(no);
        unaryOperator.postDecrement(no);

        unaryOperator.complement(no);
        unaryOperator.negation(true);

    }
}