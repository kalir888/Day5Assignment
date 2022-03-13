package com.company;

import java.util.Scanner;

public class OddorEven {
    public static int IS_EVEN = 0;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number to find whether it is odd or even: ");
        int userNum = in.nextInt();
        int diviCheck = userNum%2;
        if (diviCheck == IS_EVEN)
            System.out.println(userNum + " is an even number");
        else
            System.out.println(userNum + " is an odd number");
    }
}
