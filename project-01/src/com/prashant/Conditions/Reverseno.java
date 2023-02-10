package com.prashant.Conditions;

import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0;
        while (a>0){
            int rem = a%10;
            count += rem;
            a /= 10 ;
            count *= 10;
        }
        count /= 10 ;
        System.out.println(count);

    }
}
