package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter the number of elements to print Fizz at multiples of 3 and Buzz at mutliples of 5 and FizzBuzz at multiples of both 3 and 5");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        FizzBuzz(n);




    }

    public static void FizzBuzz(Integer n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
