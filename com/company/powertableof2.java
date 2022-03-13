package com.company;

public class powertableof2 {
    public static int MINIMUM = 0;
    public static int MAXIMUM = 31;
    public static void main(String args[]){
        int tableLimit = Integer.parseInt(args[0]);
        if (tableLimit > MINIMUM & tableLimit < MAXIMUM){
            int power = 1;
            for (int i = 1; i <= tableLimit; i++ ){
                power = power * 2;
                System.out.println("2 to the power of " + i + " = " + power);
            }
        }else
            System.out.println("Invalid Entry");
    }
}
