package com.company;

import java.util.Scanner;

public class quotientAndReminder {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your dividend: ");
        int dividend = in.nextInt();
        System.out.println("Enter your divisor: ");
        int divisor = in.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println("quotient and remainder are respectively " + quotient + " " + remainder);
    }
}
