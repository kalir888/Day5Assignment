package com.company;

public class WindChill {
    public static void main(String args[]){
        int temperature = Integer.parseInt(args[0]);
        int windSpeed = Integer.parseInt(args[1]);
        if (temperature <= 50 & windSpeed <= 120 & windSpeed >= 3) {
            double windChill;
            windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
            System.out.println("windchill for given values is = " + windChill);
        }else
            System.out.println("invalid values entered");
    }
}
