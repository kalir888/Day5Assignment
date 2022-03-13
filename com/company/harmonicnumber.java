package com.company;

import java.util.Scanner;

public class harmonicnumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find Nth harmonic number: ");
        double userNum = in.nextInt();
        if (userNum != 0){
            double harmonicNumber = 0;
            for (double i = 1; i <= userNum; i++){
                harmonicNumber = harmonicNumber + (1/i);
            }
            System.out.println("The Nth harmonic value for the given number is = " + harmonicNumber);
        }else
            System.out.println("Invalid entry");
    }
}
