package com.company;

import java.util.Scanner;

public class BruteForceFactorization {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=scan.nextInt();

        for(int i=2;i<num;i++){
            while(num%i==0){
                System.out.println(i);
                num=num/i;
            }
        }
        if(num>2){
            System.out.println(num);
        }


    }
}
