package com.company;

public class Distance {
    public static void main(String args[]){
        double distance = Math.sqrt(Math.pow(Double.parseDouble(args[0]),2)+Math.pow(Double.parseDouble(args[1]),2));
        System.out.println("distance of line belong to given coordinates is = " + distance);
    }
}
