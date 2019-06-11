package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Using Binary Search, we have found out the number of rotations in a Sorted array.
        // Time Complexity O(logN) Auxiliary Space O(1) if we used Iterative Binary Search
        int[] input = {3,4,5,6,7,8,1,2};
        findRotationCount(input);
    }

    public static void findRotationCount(int[] input){
        int[] findMin = findMinimum(input,0,input.length-1);
        System.out.println(findMin[0]+" is the Rotation Count");
        System.out.println(findMin[1]+" is where the starting element is rotated");
    }


    public static int[] findMinimum(int[] input,int low,int high){
        int[] outputArray = new int[2];
        int mid = (low+high)/2;
        if(high<low){
            //return input[0];
            return new int[]{0,input[0]};

        }
        else if(high==low){
            //return input[low];
            return new int[]{low,input[low]};
        }
        else if(mid<high && input[mid]>input[mid+1]){
            //return input[mid+1];
            return new int[]{mid+1,input[mid+1]};
        }
        else if(mid>low && input[mid-1]>input[mid]){
            //return input[mid];
            return new int[]{mid,input[mid]};
        }
        if(input[high]>input[mid]){
            return findMinimum(input,low,mid-1);
        }
        return findMinimum(input,mid+1,high);
    }
}
