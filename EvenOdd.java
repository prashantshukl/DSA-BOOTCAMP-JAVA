package Assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number to check whether it is even or odd :");
        int num = input.nextInt();
        if ((num%2)==0) {
            System.out.println("the number is even");
        }
        if ((num%2)!=0){
            System.out.println("the number is odd");
        }
    }
}
