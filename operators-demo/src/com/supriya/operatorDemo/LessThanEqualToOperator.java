package com.supriya.operatorDemo;
import java.util.Scanner;

public class LessThanEqualToOperator {
    /* pseudo code:
    if(no is less than equal to 100 or not)
        ?print good no;
        print bad no;*/
    public static void main(String[] args){
        System.out.println("please enter value: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        if (Integer.valueOf(input) <= 100) {
            System.out.println("good number..");
        }else {
            System.out.println("bad number..");
        }

    }
}