package com.company;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter how many times you want to flip coin!!!");
        Scanner scan= new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("Coin to be flipped "+number+" times!!!");
        double headPercent;
        double tailPercent;
        int head=0;
        int tail=0;
        for(int i=1;i<=number;i++){
            int rand=(int)(Math.random()*10)%2;
            if(rand<0.5){
                head++;
            }
            else{
                tail++;
            }

        }
        System.out.println("Head:"+head+"   ---  Tail:"+tail);


        headPercent = (float)((head*100)/number);
        System.out.println("Head Percentage:"+headPercent);

        tailPercent=(float)((tail*100)/number);;
        System.out.println("Tail Percentage:"+tailPercent);

    }
}
