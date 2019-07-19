package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myIntegers = getIntegers(5);
//        printArray(myIntegers);
        Arrays.sort(myIntegers);
        for(Integer i:myIntegers){
            System.out.println(i);
        }
        /*sortArray(myIntegers);
        printArray(myIntegers);*/
    }


    public static int[] getIntegers(int number)
    {
        Scanner sc = new Scanner(System.in);
        int[] integersArray = new int[number];
        System.out.println("Enter the "+ number +" of elements");
        for(int i=0;i<number;i++)
        {
            integersArray[i]=sc.nextInt();
        }
        return integersArray;
    }

    public static void printArray(int[] myArray)
    {
        for(int i=0;i<myArray.length;i++)
        {
            System.out.println("Element "+i+" is "+myArray[i]);
        }
    }


    public static void sortArray(int[] myArray)
    {
        for(int lastUnsortedIndex = myArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            for(int i=0;i<lastUnsortedIndex;i++)
            {
                if(myArray[i]<myArray[i+1])
                {
                    Sort(myArray,i,i+1);
                }
            }
        }
    }

    public static void Sort(int[] myArray,int i, int j)
    {
        if(i==j)
        {
            return;
        }
        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }
}
