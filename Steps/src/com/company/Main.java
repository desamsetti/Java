package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps to be displayed : ");
        int n = sc.nextInt();
        steps(n);

    }


    public static void steps(int n)
    {
        if(n==0)
        {
            System.out.println("");
        }
        else
        {
            String stair = "";
            for(int row=0;row<n;row++)
            {
                if(stair.length()<=row)
                {
                    stair += "*";
                }
                else
                {
                    stair += " ";
                }
                System.out.println(stair);
            }
        }
    }


    /*public static void steps(int n)
    {
        for(int row=0;row<n;row++)
        {
            String s = "";
            for(int column=0;column<n;column++)
            {
                if(column<=row)
                {
                    s += "*";
                }
                else
                {
                    s+=" ";
                }
            }
            System.out.println(s);
        }
    }*/

    /*public static void steps(int n)
    {
        int j=1;
        int counter = 1;
        for(int i=0;i<n;i++)
        {
            String s = "";
            for(int k=0;k<counter;k++)
            {
                s += "*";
            }
            counter++;
            s+="";
            System.out.println(s);
        }*/
   /*public static void steps(int n)
    {
            String arr1 = "";
            for (int i = 0; i < n; i++) {
                if (i == 0 || i < n) {
                    arr1 += "*";
                } else {
                    arr1 += " ";
                }
                System.out.println(arr1);
            }

        //for(int i=n;i>0;i--)
        /*for(int i=0;i<n;i++)
        {
            //for(int j=1;j<=n;j++)
            while(j<=n)
            {
                System.out.print("*");

            }
            j++;
            System.out.println();
        }*/
    //}
}
