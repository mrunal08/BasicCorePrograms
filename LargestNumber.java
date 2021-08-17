package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter three numbers a ,b and c to find out the largest!!!");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int largestNum;
        int temp;
        if (a > b) {
            temp=a;
        }else{
            temp=b;
        }
        if(temp>c){
            largestNum=temp;
        }
        else{
            largestNum=c;
        }
        System.out.println("Largest number of the three numbers is : "+largestNum);
    }
}

