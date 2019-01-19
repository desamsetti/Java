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
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int index1 = 0;
        int index2 = 1;
        if (size == 1){
            return nums[0];
        }
        while (index1<size-1){
            if (nums[index1] != nums[index2]){
                break;
            }
            index1 +=2;
            index2 +=2;
        }
        return nums[index1];
    }
}
