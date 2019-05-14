package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {7,6,5,4,3,2,1};
        int[] outputArray = insertionSort(inputArray);
        //7,6,5,4,3,2,1
        for(int i:outputArray){
            System.out.print(i+",");
        }

    }

    public static int[] insertionSort(int[] inputArray){
        for(int i=0;i<inputArray.length;i++){
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[i]>inputArray[j]){
                    Swap(inputArray,i,j);
                }
            }
        }
        return inputArray;
    }

    public static void Swap(int[] inputArray,int i,int j){
        if(i==j) return;
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}
