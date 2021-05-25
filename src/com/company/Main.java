package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        Number number = new Number(num);
        int isKaprekarNumber = KaprekarNumber.checkKaprekarNumber(number);
//        System.out.println(isKaprekarNumber);
        if(isKaprekarNumber == 1)
            System.out.println("This number is a Kaprekar Number.");
        else
            System.out.println("This number is not a Kaprekar Number.");
    }
}
