package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Array elements : ");
        int n = sc.nextInt();
        int[] newArray = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element number "+(i+1)+" : ");
            newArray[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println("Enter the number with which the elements should be shifted : ");
        int shiftVal = sc.nextInt();
        int[] outputArray = shiftArrayElements(shiftVal,newArray);
        System.out.println();
        System.out.print("The array values after rotating the array is : ");
        for(int i=0;i<outputArray.length;i++)
        {
            System.out.print(outputArray[i]+",");
        }


    }


    public static int[] shiftArrayElements(int n,int[] inputArray)
    {
        int[] newArray = new int[inputArray.length];
        if(n==0)
        {
            return inputArray;
        }
        else
        {
            for(int i=0;i<inputArray.length;i++)
            {
                //                  4,5,6,1,2,3
                //                  0 1 2 3 4 5
                //int[] newArray = {1,2,3,4,5,6};
                newArray[i] = inputArray[(i+n)%(inputArray.length)];
            }
        }
        return newArray;
    }
}
