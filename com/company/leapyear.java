package com.company;

import java.util.Scanner;

public class leapyear {
    public static int MINIMUM = 1000;
    public static int MAXIMUM = 9999;
    public static int PASS = 0;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year to find it is a leap year or not: ");
        int userYear = in.nextInt();
        if (userYear >= MINIMUM & userYear <= MAXIMUM){
            int leapYearCheck = userYear%4;
            if (leapYearCheck == PASS)
                System.out.println(userYear + " is a leap year");
            else
                System.out.println(userYear + " is not a leap year");
        }else
            System.out.println("Invalid Year");
    }
}
