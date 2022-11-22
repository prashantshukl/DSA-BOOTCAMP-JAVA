package Assignments.Conditional;

import java.util.Scanner;

public class BonusCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your salary :");
        int a = input.nextInt();
        if (a>10000){
            System.out.println("bonus is 2000");
        }
        if (a<=10000) {
            System.out.println("bonus is 10000");
        }
    }
}
