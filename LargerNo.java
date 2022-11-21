package Assignments;

import java.util.Scanner;

public class LargerNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = input.nextInt();
        System.out.print("enter second number:");
        int b = input.nextInt();
        if (a>b) {
            System.out.println(a +" is larger");
        }
        if (b>a) {
            System.out.println(b + " is larger");
        }
    }
}
