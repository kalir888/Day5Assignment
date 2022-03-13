package com.company;

import java.util.Scanner;

public class greatest {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers to find the greatest among them: ");
        int userNum1 = in.nextInt();
        int userNum2 = in.nextInt();
        int userNum3 = in.nextInt();
        if (userNum1 > userNum2 & userNum1 > userNum3)
            System.out.println(userNum1 + " is the greatest among three numbers");
        else if (userNum2 > userNum1 & userNum2 > userNum3)
            System.out.println(userNum2 + " is the greatest among three numbers");
        else
            System.out.println(userNum3 + " is the greatest among three numbers");

    }
}
