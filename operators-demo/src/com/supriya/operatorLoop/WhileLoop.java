package com.supriya.operatorLoop;

public class WhileLoop {
    //Psuedo code:
    //     -write a method to print a no = 10.
    //     -print the no using loop
    private void printNo(int no) {
        System.out.println(no);

    }
    public static void main(String[] args) {
        WhileLoop loopClass = new WhileLoop();
        int no = 11;

        while(no >= 1) {
            loopClass.printNo(--no);
        }
    }
}

//while : mandatory variable declaration - mandatory condition logic - may run 0 or more times

