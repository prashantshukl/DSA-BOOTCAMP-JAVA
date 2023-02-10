package com.prashant;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        switch (a) {
            case "mango":
                System.out.println("asdf");
                break;
            case "apple":
                System.out.println("fasd");
                break;
            case "orange":
                System.out.println("dasd");
                break;
            default:
                System.out.println("not a fruit");
                break;
        }

    }
}
