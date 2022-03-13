package com.company;

import java.util.Scanner;

public class vowels {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a letter to find whether it is a vowel or not: ");
        char userAlphabet = in.next().charAt(0);
        if (userAlphabet == 'a' || userAlphabet == 'e' || userAlphabet == 'i' || userAlphabet == 'o' || userAlphabet == 'u')
            System.out.println(userAlphabet + " is a vowel");
        else
            System.out.println(userAlphabet + " is a consonant");
    }
}
