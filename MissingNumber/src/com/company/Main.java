package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] inputArray = {3,0,1};
        //int[] inputArray = {9,6,4,2,3,5,7,0,1};
        int[] inputArray = {0};
        System.out.println(missingNumber(inputArray));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int val = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
            {
                return i;
            }
        }
        return val;
    }

    /*public static int missingNumber(int[] nums) {
        int n = nums.length;
        int val = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        int missingVal = val - sum;
        return missingVal;
    }*/



}
