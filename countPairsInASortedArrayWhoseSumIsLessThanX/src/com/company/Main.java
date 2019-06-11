package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Time Complexity : O(N) Space Complexity : O(1)
        int[] input = {1,2,3,4,5,6,7,8};
        int x = 7;
        int output = countNumberOfPairs(input,x);
        System.out.println(output);
    }

    public static int countNumberOfPairs(int[] input,int x){
        int low = 0;
        int high = input.length-1;
        int count = 0;
        while(low<high){
            if(input[low]+input[high]<x){
                count = count + (high-low);
                low++;
            }
            else{
                high--;
            }
        }
        return count;
    }


}
