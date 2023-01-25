package com.bridgelabz;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0,temp = n;
        while(temp != 0){//123
            sum += temp % 10;//3+2
            temp = temp / 10;//12
        }
        System.out.println("Sum of Digits of number "+n+" is: "+sum);
    }

}
