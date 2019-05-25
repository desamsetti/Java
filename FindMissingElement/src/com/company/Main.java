package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {1,2,3,4,5,6,7,8,9};
        int inputSize = 10;
        System.out.println(returnMissingNumber(inputArray,inputSize));
    }

    public static int returnMissingNumber(int[] inputArray, int size){
        int sum = 0;
        for(int i:inputArray){
            sum += i;
        }
        int total = (size*(size+1))/2;
        return total-sum;
    }
}
