package Assignments;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter amount in rupees:");
        float a = input.nextFloat();
        System.out.println("amount in dollar is :" + a/81.52f);
    }
}
