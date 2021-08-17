package com.company;

import java.util.Scanner;

public class PrimeFactor {
    static PrimeFactor obj= new PrimeFactor();

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number = scan.nextInt();

       obj.primeFactor(number);
       // System.out.println(prime);
    }
    public boolean isPrime(int number){
        int count=0;
        boolean flag=false;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }

    public void primeFactor(int number){
       // for(int i=2;i<number;i++){
        int i=2;
        while(number>0){
            if(number%i==0 && obj.isPrime(i)==true){
               number=number/i;
                System.out.println(i);
                i=i+1;
                break;
            }
        }
    }
}
