package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {1,2,3,1};
        //int[] inputArray = {1,1,1,3,3,4,3,2,4,2};
        boolean output = containsDuplicate1(inputArray);
        System.out.println(output);
    }

    public static boolean containsDuplicate1(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++)
        {
            Integer count = 0;
            count = map1.containsKey(nums[i])?map1.get(nums[i])+1:0+1;
            map1.put(nums[i],count);
            if(count==2)
            {
                return true;
            }
        }
        return false;
    }

    /*public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i : nums) {
            if(m.put(i,0)!=null) return true;
        }
        return false;
    }*/
}
