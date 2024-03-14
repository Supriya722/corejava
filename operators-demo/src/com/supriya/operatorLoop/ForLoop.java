package com.supriya.operatorLoop;

public class ForLoop {
    //Psuedo code:
    //     -write a method to print a no = 10.
    //     -print the no using loop
    private void printNo(int no) {
        System.out.println(no);
    }

    public static void main(String[] args) {
        ForLoop loopClass = new ForLoop();

        for (int no = 0; no <= 10; ++no) {
            loopClass.printNo(no);         //print the no using loop
        }
    }
}

// for (declaration; condition; increment/decrement) {
//     statements;

