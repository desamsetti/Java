package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int[] inputArray = {1,2,3,4,5};
        int[] inputArray = {4,5,1,2,3};
        int minimumElement = findMinimumElement(inputArray,0,inputArray.length);
        System.out.println("The minimum element found in O(logN) is :"+minimumElement);
        int element = 3;
        boolean output = binarySearch(inputArray,0,inputArray.length-1,element);
        System.out.println("Is the element "+element+" in the input array ? "+output);
    }

    // Finding the minimum element in a sorted and rotated array(Rotated Somewhere) with no duplicates
    public static int findMinimumElement(int[] inputArray,int low,int high){
        int mid = (low+high)/2;
        if(high<low){
            return inputArray[0];
        }
        else if(high==low){
            //return inputArray[mid];
            return inputArray[low];
        }

        else if(mid<high && inputArray[mid+1]<inputArray[mid]){
            return inputArray[mid+1];
        }
        else if(mid>low && inputArray[mid-1]>inputArray[mid]){
            return inputArray[mid];
        }

        if(inputArray[high]>inputArray[mid]){
            return findMinimumElement(inputArray,low,mid-1);
        }

        return findMinimumElement(inputArray,mid+1,high);
    }




    public static boolean binarySearch(int[] input,int low, int high,int key){
        //int mid = low + (high-low)/2;
        if(high>=low) {
            int mid = (low + high) / 2;

            if (input[mid] == key) {
                return true;
            } else if (input[mid] > key) {
                return binarySearch(input, low, mid-1, key);
            } else if (input[mid] < key) {
                return binarySearch(input, mid+1, high, key);
            }
        }
            return false;
    }
}
