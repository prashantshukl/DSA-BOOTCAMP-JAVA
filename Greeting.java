package Assignments;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name :");
        var a = input.nextLine();
        System.out.println("Hello " + a + " Welcome to my program");
    }
}
