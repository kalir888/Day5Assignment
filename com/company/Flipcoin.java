package com.company;

import java.util.Scanner;

public class Flipcoin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of times to flip the coin: ");
        double numberOfTimes = in.nextInt();
        double heads = 0;
        double tails = 0;
        if (numberOfTimes > 0) {
            for (int i = 1; i <= numberOfTimes; i++) {
                double toss = Math.random() % 1;
                if (toss < 0.5)
                    heads++;
                else
                    tails++;
            }

            int percentageOfHeads = (int) Math.round((heads / numberOfTimes) * 100);
            int percentageOfTails = (int) Math.round((tails / numberOfTimes) * 100);
            System.out.println("number of heads is = " + heads);
            System.out.println("number of tails is = " + tails);
            System.out.println("percentage of heads is = " + percentageOfHeads + "%");
            System.out.println("percentage of tails is = " + percentageOfTails + "%");
        }else{
            System.out.println("Invalid Entry");
        }
    }
}
