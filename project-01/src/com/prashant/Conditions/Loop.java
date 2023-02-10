package com.prashant.Conditions;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        System.out.print ("enter n: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b,c=0;
        for(b=1;b<=a;b++){
           c=c+b;

        }
        System.out.println(c);
    }
}
//
