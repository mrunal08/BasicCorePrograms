package com.company;

import javax.print.DocFlavor;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        System.out.println("Enter The Nth Value In the Harmonic Series!!!");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            double i;
            double sum=0;
            for( i=1;i<=n;i++)
            {
                sum=sum+(1/i);
            }
            System.out.println("Harmonic value = "+sum);
        }


}
