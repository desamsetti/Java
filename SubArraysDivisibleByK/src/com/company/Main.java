package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(countSubArraysDivisibleByK(arr,k));


    }

    public static int countSubArraysDivisibleByK(int[] inputArray, int k)
    {
        int counter = 0;
        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i]==k)
            {
                counter++;
            }
            else
            {
                for(int j=i;j<inputArray.length;j++)
                {

                }
            }

        }

    }
}
