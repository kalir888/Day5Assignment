package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows in your array");
        int rows = in.nextInt();
        System.out.println("enter the number of columns in your array");
        int columns = in.nextInt();
        int[][] userArray = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.println("enter the element for your array position " + i + j);
                userArray[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(userArray));
    }
}
