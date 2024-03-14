package com.supriya.LogicDevelopment;
import java.util.Scanner;
public class ReverseNumberDemo {
//    private static long millis;

    public static void main() throws InterruptedException {
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int no = Integer.valueOf(scanner.nextLine());

//        int reverseNo = 0;   //reverseNo: 3210
//        while (no > 0) {
//            int remainder = no % 10;
//            no = no / 10;
//                reverseNo = reverseNo + remainder;
//                reverseNo = reverseNo * 10;
//        }
        int reverseNumber = 0;   //reverseNo: 3210
        for (int anotherNo = no; anotherNo > 0; anotherNo = anotherNo / 10) {
            int remainder = anotherNo % 10;
            reverseNumber = (reverseNumber == 0) ? remainder : (reverseNumber + 10) + remainder;

            System.out.println("reverseNo : " + reverseNumber);
        }
        System.out.println(reverseNumber);
    }
}


//prime no
//palindrome no
//armstrong no