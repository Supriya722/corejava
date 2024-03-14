package com.supriya.array;

import java.util.concurrent.LinkedBlockingDeque;

public class ArrayDemo {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 45;
        marks[1] = 98;
        marks[2] = 63;
        marks[3] = 79;
        marks[4] = 57;

        System.out.println("size of array: " + marks.length);
        //while loop demo for array
        int position = 0;
        while(position < marks.length) {
            System.out.println(marks[position]);
            position++;
        }

        System.out.println("-------------------------");
        System.out.println("Demo of for loop");
            //for loop demo for array
        for(int index = 0; index < marks.length; index++ ) {
            System.out.println(marks[index]);
        }
        System.out.println("-------------------------");
        System.out.println("Demo of forEach loop");
        //for loop demo for array
        for(int element : marks) {
            System.out.println(element);
        }
    }
}


// for loop
//examples : armstrong no    //while , for       = convert to string ->"123";
           // prime no         -//-
          // palindrome no     -//-
            // reverse no      -//-
//get the value from user

