package Assignments.Conditional;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().trim().charAt(0);
        if ( a < 'z' && a > 'a') {
            System.out.println("it is lower case");
        }
        else {
            System.out.println("it is upper case");
        }

    }
}
