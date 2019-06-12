package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {-3,-2,0,3,4,5};
        int n = input.length;
        //int output = findAbsoluteDistinctCount(input);
        int output = findDistinctCount(input,n);
        System.out.println(output);
    }

    public static int findDistinctCount(int[] input,int n){
        //Time Complexity : O(N) Space Complexity : O(1)
        int count = input.length;
        int i=0;
        int j=n-1;
        int sum=0;

        while(i<j){
            while(i!=j && input[i]==input[i+1]){
                count--;
                i++;
            }

            while(i!=j && input[j]==input[j-1]){
                count--;
                j--;
            }

            if(i==j)
                break;


            sum = input[i]+input[j];


            if(sum == 0){
                count--;
                i++;
                j--;
            }
            else if(sum<0){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }


    public static int findAbsoluteDistinctCount(int[] input){
        // Time Complexity : O(N) Space Complexity : O(N)
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<input.length;i++){
            set.add(Math.abs(input[i]));
        }
        return set.size();
    }
}
