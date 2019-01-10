package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {124,122,50,25,-4,1,6};

        for(int firstUnsortedIndex = 1;firstUnsortedIndex<inputArray.length;firstUnsortedIndex++)
        {
            int newElement = inputArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && inputArray[i-1]>newElement;i--)
            {
                inputArray[i] = inputArray[i-1];
            }
            inputArray[i] = newElement;

        }


        for(int i=0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }
        System.out.println("Hello World");
    }
    }



