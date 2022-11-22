package Assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number upto which the series is required :");
        int num = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int count = 0;
        int num3 = 0;
        if (num == 0){
            System.out.println(num1);
        }
        if (num == 1) {
            System.out.println(num1);
            System.out.println(num2);
        }
        else {
            System.out.println(num1);
            System.out.println(num2);
        }
        do {
            count++;
            num3=num1 + num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        } while (count <= (num - 3));





    }
}
