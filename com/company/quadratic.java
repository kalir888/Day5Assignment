package com.company;

import java.util.Scanner;

public class quadratic {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the three coefficients of your quadratic equation");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int delta = (b*b) - (4*a*c);
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("delta is = " + delta);
        System.out.println("root1 of quadratic equation is = " + root1);
        System.out.println("root2 of quadratic equation is = " + root2);
    }
}
