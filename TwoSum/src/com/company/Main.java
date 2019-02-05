package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {2, 7, 11, 15};
        int target = 9;
        int[] outputArray = twoSum(inputArray,target);
        for(int i=0;i<outputArray.length;i++)
        {
            System.out.println("The output is index : " + outputArray[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2) return new int[]{0,0};

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return new int[]{map.get(nums[i]),i};
            }
            else
            {
                map.put(target-nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
