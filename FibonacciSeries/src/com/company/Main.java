package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter the integer value of which the fibanocci n-th term is to be printed : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciSeries(n));
    }


    /*public static int fibonacciSeries(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        }
    }*/
    public static int fibonacciSeries(int n)
    {
        ArrayList<Integer> values = new ArrayList<Integer>();

        values.add(0);
        values.add(1);
        for(int i=2;i<=n;i++)
        {
            int x = values.get(i-1)+values.get(i-2);
            values.add(x);
        }
        return values.get(n);
    }
}
