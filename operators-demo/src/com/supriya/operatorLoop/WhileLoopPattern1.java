package com.supriya.operatorLoop;

public class WhileLoopPattern1 {
    //Psuedo code:
    //    *
    //    * *
    //    * * *
    //    * * * *
    //    * * * * *

    public static void main(String[] args) {
//        WhileLoopPattern1 loopClass = new WhileLoopPattern1();
        int row = 1;

        while (row <= 5) {
            int column = 1;

            while (column <= row)  {
                System.out.print("*\t");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}



