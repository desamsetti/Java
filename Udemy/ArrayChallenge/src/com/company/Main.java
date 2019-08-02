package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static  int[] getIntegers(int number){
        int[] intArray = new int[number];
        for(int i=0;i<number;i++){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] inputArray){
        for(int i=0;i<inputArray.length;i++){
            System.out.println("Element at "+i+" is "+inputArray[i]);
        }
    }

    //Input : 106,26,81,5,15
    //Output: 106,81,26,15,5
    public static int[] sortIntegers(int[] inputArray){
        int sortedArray[] = new int[inputArray.length];
        int minElement = Integer.MIN_VALUE;
        for(int i=0;i<inputArray.length;i++){
            sortedArray[i] = inputArray[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        //Arrays.sort(inputArray);
        //return inputArray;
        return sortedArray;
    }


}
