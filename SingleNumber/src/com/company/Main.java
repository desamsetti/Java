package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));


    }


    /*public static int singleNumber(int[] nums)
    {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }*/
    /*4,1,2,1,2
      1,1,2,2,4*/
    //0,1,2,3,4
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int val = 0;
        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1]|| i==nums.length-1)
            {
                val = nums[i];
                return nums[i];
            }
        }

        return val;
    }
}
