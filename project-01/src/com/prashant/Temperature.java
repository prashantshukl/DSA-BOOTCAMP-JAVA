package com.prashant;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("enter temperature in celcius :");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        float tempF = (tempC*1.8f) + 32;
        System.out.println(tempF);
    }
}
