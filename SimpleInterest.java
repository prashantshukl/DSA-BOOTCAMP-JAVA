package Assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter principle :");
        int a = input.nextInt();
        System.out.print("enter time :");
        int b = input.nextInt();
        System.out.print("enter rate :");
        int c = input.nextInt();
        int d = (a*b*c)/100;
        System.out.print("simple interest is : "+ d );
    }
}
