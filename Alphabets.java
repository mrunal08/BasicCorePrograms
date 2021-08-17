package com.company;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args){
        System.out.println("Enter an Alphabet!!!");
        Scanner scan= new Scanner(System.in);

        char alphabet = scan.next().charAt(0);
        if(alphabet=='a' ||alphabet=='e'||alphabet=='i'||alphabet=='i'||alphabet=='o' ){
            System.out.println("Alphabet is a vowel ");
        }
        else{
            System.out.println("Alphabet is consonent");
        }
    }
}
