package com.company;

import java.util.Scanner;

public class QuoRemainder {
    public static void main(String[] args) {

        int divisor;
        int dividend;
        System.out.println("Enter The Divisor!!!");
        Scanner divs = new Scanner(System.in);
        divisor = divs.nextInt();

        System.out.println("Enter The Dividend!!!");
        Scanner divd = new Scanner(System.in);
        dividend = divd.nextInt();

        int quotient = (dividend / divisor);
        int remainder = (dividend % divisor);
        System.out.println("The Quotient is : " + quotient);
        System.out.println("The Remainder is : " + remainder);
    }
}