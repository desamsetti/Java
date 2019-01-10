package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the integer to display the reverse : ");
        Scanner sc = new Scanner(System.in);
        Integer i = sc.nextInt();
        long reversedNum = 0;
        while(i!=0)
        {
            reversedNum = reversedNum * 10;
            reversedNum = reversedNum + i%10;
            i = i/10;
        }
        System.out.println("The Reverse of the Integer is : "+reversedNum);
    }
}
