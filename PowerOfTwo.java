package com.company;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int base=2;
        System.out.println("Enter the Nth Value!!!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       // System.out.println("Number in n value is "+num);
        System.out.println("Table of 2");
      double a=base;
              double b;
        for (int i = 1; i < num; i++) {
            System.out.println(Math.pow(a, i));
        }


    }

}