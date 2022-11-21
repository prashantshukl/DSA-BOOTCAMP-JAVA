package Assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number:");
        int num1 = input.nextInt();
        System.out.print("enter second number:");
        int num2 = input.nextInt();
        System.out.print("enter the operator (+,-,*,/):");
        var a = input.next();
        if (a == "+") {
            System.out.println(num1+num2);
        }



    }
}
