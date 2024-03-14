package com.supriya.array;

import java.util.concurrent.LinkedBlockingDeque;

public class MultiDimentionalArrayDemo {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];
        marks[0][0] = 45;
        marks[0][1] = 59;
        marks[0][2] = 63;

        marks[1][0] = 40;
        marks[1][1] = 51;
        marks[1][2] = 37;

        marks[2][0] = 68;
        marks[2][1] = 53;
        marks[2][2] = 18;


        System.out.println("size of array: " + marks.length);

        System.out.println("-------------------------");
        System.out.println("Demo of for loop");
        //for loop demo for array
        for(int row = 0; row < marks.length; row++ ) {
            for (int column = 0; column < marks.length; column++) {
                System.out.print(marks[row][column] + "\t");
            }
            System.out.println();
        }
    }
}


// for loop
//examples : armstrong no    //while , for       = convert to string ->"123";
// prime no         -//-
// palindrome no     -//-
// reverse no      -//-
//get the value from user

