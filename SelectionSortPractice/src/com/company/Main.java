package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {7,6,5,4,3,2,1};
        int[] outputArray = selectionSort(inputArray);
        for(int i:outputArray){
            System.out.print(i+",");
        }
    }

    public static int[] selectionSort(int[] inputArray){
        for(int lastUnsortedIndex = inputArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            int largest = 0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                if(inputArray[i]>inputArray[largest]){
                    largest = inputArray[i];
                }
            }
            Swap(inputArray,largest,lastUnsortedIndex);
        }
        return inputArray;
    }

    public static void Swap(int[] inputArray, int i, int j){
        if(i==j) return;
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}
