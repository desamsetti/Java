package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] inputArray = {3,1,2,4};
        int[] inputArray = {1,3,5,7,9,2,4,6,8};
        int[] outputArray = sortArrayByParity(inputArray);

        for(int i=0;i<outputArray.length;i++)
        {
            System.out.print(outputArray[i]+",");
        }
    }

    public static int[] sortArrayByParity(int[] A) {
        int i=0;
        int j=A.length-1;

        while(i<=j)
        {
            if(A[i]%2!=0 && A[j]%2==0)
            {
                swap(A,i,j);
                i++;
                j--;
            }
            /*else if(A[i]%2==0 && A[j]%2==0)
            {
                i++;
            }
            else if(A[i]%2!=0 && A[j]%2!=0)
            {
                j--;
            }*/
            else
            {
                i++;
                j--;
            }
        }
        return A;
    }

    public static void swap(int[] inputArray, int i, int j)
    {
        if(i==j)
        {
            return;
        }
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}