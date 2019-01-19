package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));


    }


    public static int singleNumber(int[] nums)
    {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    /*public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int val = 0;
        //for(int i=0;i<nums.length;i=i+2)
        int i=0;
        while(i<nums.length || i+1 == nums.length)
        {
            if(nums[i]!=nums[i+1])
            {
                val = nums[i];
                return nums[i];
            }
            i++;
        }
        return val;
    }*/
}
