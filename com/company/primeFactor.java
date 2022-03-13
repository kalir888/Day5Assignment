package com.company;

import java.util.Scanner;

public class primeFactor {
    public static final int IS_PRIME = 0;
    public static final int IS_NOT_PRIME = 1;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find it's prime factors : ");
        int userNum = in.nextInt();
        for (int i = 2; i <= (userNum/2); i++){
            int diviCheck1 = userNum%i;
            if (diviCheck1 == 0){
                int primeCheck = IS_PRIME;
                int j = 2;
                while (j*j <= i & primeCheck == IS_PRIME){
                    int diviCheck2 = i%j;
                    if (diviCheck2 == 0)
                        primeCheck = IS_NOT_PRIME;
                    else
                        primeCheck = IS_PRIME;
                    j++;
                }
                if (primeCheck == IS_PRIME)
                    System.out.println(i + " is the prime factor of " + userNum);
            }
        }
    }
}
