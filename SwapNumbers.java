package com.company;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int temp;

        System.out.println("Enter a and b!!!");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The Two numbers to before swapping are "+a+" and "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("The Two numbers after swapping are "+a+" and "+b);



    }
}
