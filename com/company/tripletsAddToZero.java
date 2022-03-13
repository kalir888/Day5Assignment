package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class tripletsAddToZero {
    public static void main(String args[]){
        int array[] = {-1,-2,-3,1,2,3,4,-4};
        int found = 0;
        for(int i = 0; i < array.length-2; i++){
            for (int j = i+1; j < array.length-1; j++){
                for (int k = j+1; k < array.length; k++){
                    if (array[i]+array[j]+array[k] == 0){
                        int arrayijk[] = {array[i],array[j],array[k]};
                        System.out.println(Arrays.toString(arrayijk));
                        found++;
                    }
                }
            }
        }
        if (found == 0)
            System.out.println("no triplets found");
        else
            System.out.println("no of triplets found is = " + found);
    }
}
