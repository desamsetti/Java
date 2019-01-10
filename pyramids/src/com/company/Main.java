package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps : ");
        int n = sc.nextInt();
        pyramids(n);
    }

    public static void pyramids(int n)
    {
        Double midpoint = Math.floor((2*n - 1)/2);
        for(int row=0;row<n;row++)
        {
            String level = "";
            for(int column=0;column<=n+n-1;column++)
            {
                if(midpoint-row<=column && midpoint+row>=column)
                {
                    level += "*";
                }
                else
                {
                    level += " ";
                }
            }
            System.out.println(level);
        }
    }
}
