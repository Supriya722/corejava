package com.supriya.operatorLoop;

public class DoWhileLoop {
    //Pseudo code:
    //     -write a method to print a numbers till 10 starting from 1 = 10.
    //     -print the no using loop
    private void printNo(int no) {
        System.out.println(no);

    }
    public static void main(String[] args) {
        DoWhileLoop loopClass = new DoWhileLoop();
        int no = 0;

        do {
            loopClass.printNo(++no);   //print the no using loop
        }while (no < 10);
    }
}

// do..while : mandatory variable declaration - mandatory exit condition declaration - always guaranteed
//             execution at least once or more times.