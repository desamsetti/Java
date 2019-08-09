package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] inputArray = readIntegers(5);
        System.out.println("The minimum element is :"+findMin(inputArray));
        System.out.println("The maximum element is :"+findMax(inputArray));
    }

    public static int[] readIntegers(int count){
        int inputArray[] = new int[count];
        for(int i=0;i<count;i++){
            System.out.print("Enter the element number "+(i+1)+" : ");
            inputArray[i] = scanner.nextInt();
            System.out.println();
        }
        return inputArray;
    }

    public static int findMin(int[] inputArray){
        int minElement = inputArray[0];
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]<minElement){
                minElement = inputArray[i];
            }
        }
        return minElement;
    }

    public static int findMax(int[] inputArray){
        int maxElement = inputArray[0];
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]>maxElement){
                maxElement = inputArray[i];
            }
        }
        return maxElement;
    }
}
